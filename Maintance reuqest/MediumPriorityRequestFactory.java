public class MediumPriorityRequestFactory extends MaintenanceRequestFactory {
    @Override
    public MaintenanceRequest createRequest() {
        MaintenanceRequest request = new MediumPriorityRequest();
        request.setPriority();
        request.setStatus();
        request.setExpire();
        return request;
    }
}
