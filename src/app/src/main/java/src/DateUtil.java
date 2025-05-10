package src;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class DateUtil {
    public LocalDateTime getNow() {
        return LocalDateTime.now();
    }
}
