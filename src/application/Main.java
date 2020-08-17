package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PayPalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Installment> installments = new ArrayList<>();

        System.out.println("Enter contract data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (DD/MM/YYYY): ");
        Date date = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        ContractService contractService = new ContractService(new PayPalService());

        System.out.print("Enter number of installments: ");
        int n = sc.nextInt();

        contractService.processContract(contract, n);

        System.out.println("Installments:");

        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }


        sc.close();
    }
}