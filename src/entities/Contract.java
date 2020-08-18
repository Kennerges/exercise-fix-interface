package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

    private final Date date;
    private final Double totalValue;

    private final List<Installment> installments = new ArrayList<>();

    public Contract(Date date, Double totalValue) {
        this.date = date;
        this.totalValue = totalValue;
    }

    public Date getDate() {
        return date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void addInstallment(Installment installment) {
        installments.add(installment);
    }

}
