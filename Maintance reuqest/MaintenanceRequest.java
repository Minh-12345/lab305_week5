import java.time.LocalDate;

public abstract class MaintenanceRequest {
    protected String priority;
    protected String status;
    protected LocalDate expire;

    public abstract void setPriority();
    public abstract void setStatus();
    public abstract void setExpire();
    public abstract void processRequest();
}
