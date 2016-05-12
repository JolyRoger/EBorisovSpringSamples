package quoters;

import javax.annotation.PostConstruct;

/**
 * Created by torquemada on 5/5/16.
 */
@Profiling
@DeprecatedClass(newImpl = T1000.class)
public class TerminatorQuoter implements Quoter {

    public TerminatorQuoter() {
        System.out.println("Phase 1");
        System.out.println("constructor repeat = " + repeat);
    }

    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
        System.out.println("init repeat = " + repeat);
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    @InjectRandomInt(min=2, max=7)
    private int repeat;

    private String message;

    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("Phase 3");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message: " + message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
