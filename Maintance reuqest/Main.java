public class Main {
    public static void main(String[] args) {
        //  Low Priority
        MaintenanceRequestFactory lowFactory = new LowPriorityRequestFactory();
        MaintenanceRequest lowRequest = lowFactory.createRequest();
        lowRequest.processRequest();

        //  Medium Priority
        MaintenanceRequestFactory mediumFactory = new MediumPriorityRequestFactory();
        MaintenanceRequest mediumRequest = mediumFactory.createRequest();
        mediumRequest.processRequest();

        //  High Priority
        MaintenanceRequestFactory highFactory = new HighPriorityRequestFactory();
        MaintenanceRequest highRequest = highFactory.createRequest();
        highRequest.processRequest();
    }
}
