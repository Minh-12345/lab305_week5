import java.time.LocalDate;

public class LowPriorityRequest extends MaintenanceRequest {

    @Override
    public void setPriority() {
        this.priority = "Ignore";
    }

    @Override
    public void setStatus() {
        this.status = "Done";
    }

    @Override
    public void setExpire() {
        this.expire = LocalDate.now();
    }

    @Override
    public void processRequest() {
        System.out.println("Request denied");
    }
}
