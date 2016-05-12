package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by torquemada on 5/5/16.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean(Quoter.class).sayQuote();
//        while (true) {
//            Thread.sleep(150);
//        }
    }
}
