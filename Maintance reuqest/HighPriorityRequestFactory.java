public class HighPriorityRequestFactory extends MaintenanceRequestFactory {
    @Override
    public MaintenanceRequest createRequest() {
        MaintenanceRequest request = new HighPriorityRequest();
        request.setPriority();
        request.setStatus();
        request.setExpire();
        return request;
    }
}
