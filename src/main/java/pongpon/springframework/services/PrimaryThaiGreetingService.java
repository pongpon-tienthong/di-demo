package pongpon.springframework.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("th")
public class PrimaryThaiGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "สวัสดีกูรู – ไพมารี่ไทยจ้า";
    }
}
