package ru.dzolotarev.springbootapi.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MyScheduler {

    @Scheduled(cron = "*/10 * * * * *")
    public void myNewScheduler() {
        log.info("Scheduler periodical message from: {} ", this.getClass().getName());
    }
}
