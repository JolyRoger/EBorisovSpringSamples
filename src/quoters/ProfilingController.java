package quoters;

/**
 * Created by torquemada on 5/5/16.
 */
public class ProfilingController implements ProfilingControllerMBean {

    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}
