public class LowPriorityRequestFactory extends MaintenanceRequestFactory {
    @Override
    public MaintenanceRequest createRequest() {
        MaintenanceRequest request = new LowPriorityRequest();
        request.setPriority();
        request.setStatus();
        request.setExpire();
        return request;
    }
}
