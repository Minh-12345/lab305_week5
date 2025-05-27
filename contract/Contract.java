public interface Contract {
    void buildContractID(String id);
    void buildPropertyID(String propertyId);
    void buildTenantID(String tenantId);
    void buildRentAmount(double amount);
    Contract signContract();
}
