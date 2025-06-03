import java.util.List;

public class FinancialReport {
    private final String title;
    private final List<Property> properties;

    public FinancialReport(String title, List<Property> properties) {
        this.title = title;
        this.properties = properties;
    }

    public void generateReport() {
        double total = 0;
        System.out.println("== " + title + " ==");
        for (Property p : properties) {
            p.printDetails();
            System.out.println("--------------------");
            total += p.getRentAmount();
        }
        System.out.printf("Total Rent: $%.2f\n", total);
    }
}
