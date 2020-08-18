package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private final Date dueDate;
    private final Double amount;

    public Installment(Date dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public String toString() {
        return sdf.format(dueDate) + " - " + String.format("%.2f", amount);
    }
}
