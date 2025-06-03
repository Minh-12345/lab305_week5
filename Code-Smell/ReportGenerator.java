import java.util.List;

public class ReportGenerator {
    public static void main(String[] args) {
        List<Property> list = List.of(
            new Property("Apartment A", 1500, "John Doe", "City Center"),
            new Property("House B", 2500, "Jane Smith", "Suburb"),
            new Property("Condo C", 1800, "Bob Johnson", "Downtown")
        );

        FinancialReport report = new FinancialReport("Monthly Rent Summary", list);
        report.generateReport();
    }
}
