package src;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DateService {
    @Autowired
    private DateUtil dateUtil;

    private static final Logger log = LoggerFactory.getLogger(DateService.class);

    public void printNow() {
        for (int i = 0; i <= 10000000; i++) {
            LocalDateTime now = dateUtil.getNow();
            if (i % 1000 == 0) {
                log.info("ループ" + i + "回目：" + now.toString());
            }
        }
    }
}
