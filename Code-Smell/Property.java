public class Property {
    private final String name;
    private final double rentAmount;
    private final String owner;
    private final String location;

    public Property(String name, double rentAmount, String owner, String location) {
        this.name = name;
        this.rentAmount = rentAmount;
        this.owner = owner;
        this.location = location;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void printDetails() {
        System.out.printf("Property: %s | Owner: %s | Location: %s | Rent: $%.2f\n", name, owner, location, rentAmount);
        System.out.println(rentAmount > 2000 ? "This is a premium property." : "This is a standard property.");
        System.out.printf("Yearly Rent: $%.2f\n", rentAmount * 12);
    }
}
