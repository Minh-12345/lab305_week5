import java.time.LocalDate;

public class MediumPriorityRequest extends MaintenanceRequest {

    @Override
    public void setPriority() {
        this.priority = "Medium";
    }

    @Override
    public void setStatus() {
        this.status = "Accepted";
    }

    @Override
    public void setExpire() {
        this.expire = LocalDate.now().plusMonths(1);
    }

    @Override
    public void processRequest() {
        System.out.println("Request accept, estimated completion date is " + expire);
    }
}
