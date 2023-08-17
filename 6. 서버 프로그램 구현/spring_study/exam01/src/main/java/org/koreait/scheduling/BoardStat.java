package org.koreait.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BoardStat {
    @Scheduled(fixedDelay = 3000)
    @Scheduled(cron="0 0 1 * * *")
    public void makeStat(){
    }
}
