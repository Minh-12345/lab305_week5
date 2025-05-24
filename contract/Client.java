public class Client {
    public static void main(String[] args) {
        
        Contract permanent = new PermanentContract();
        permanent.buildContractID("C001");
        permanent.buildPropertyID("P123");
        permanent.buildTenantID("T456");
        permanent.buildRentAmount(1500.00);
        permanent.signContract();
        System.out.println(permanent.toString());

        
        Contract longTerm = new LongTermContract();
        longTerm.buildContractID("C002");
        longTerm.buildPropertyID("P124");
        longTerm.buildTenantID("T789");
        longTerm.buildRentAmount(1800.00);
        longTerm.signContract();
        System.out.println(longTerm.toString());

       
        Contract shortTerm = new ShortTermContract();
        shortTerm.buildContractID("C003");
        shortTerm.buildPropertyID("P125");
        shortTerm.buildTenantID("T101");
        shortTerm.buildRentAmount(1200.00);
        shortTerm.signContract();
        System.out.println(shortTerm.toString());


        
    }
}
