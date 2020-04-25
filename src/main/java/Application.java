import com.pluralsight.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main (String[] args) {
        final ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        final SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
