public class PermanentContract implements Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    @Override
    public void buildContractID(String id) {
        this.contractID = id;
    }

    @Override
    public void buildPropertyID(String propertyId) {
        this.propertyID = propertyId;
    }

    @Override
    public void buildTenantID(String tenantId) {
        this.tenantID = tenantId;
    }

    @Override
    public void buildRentAmount(double amount) {
        this.rentAmount = amount;
    }

    @Override
    public Contract signContract() {
        System.out.println("Permanent Contract signed with ID: ");
        return this;
    }

    @Override
    public String toString() {
        return "PermanentContract details:  contractID =" + contractID + ", propertyID=" + propertyID + ", tenantID=" + tenantID
                + ", rentAmount=" + rentAmount ;
    }
    
}
