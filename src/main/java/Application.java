import com.olaniyi.service.SpeakerService;
import com.olaniyi.service.SpeakerServiceImpl;

public class Application {
    public static void main(String[] args) {

        SpeakerService service = new SpeakerServiceImpl();
        System.out.println(service.findall().get(0).getFirstName());
    }
}
