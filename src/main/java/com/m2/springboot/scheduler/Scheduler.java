package com.m2.springboot.scheduler;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Scheduling is a process of executing the tasks for the specific time period.
 * Java Cron expressions: are used to configure the instances of CronTrigger, a subclass of org.quartz.Trigger
 * Fixed Rate scheduler: is used to execute the tasks at the specific time. It does not wait for the completion of previous task.
 */
@Component
public class Scheduler {

   // @Scheduled(fixedRate = 1000, initialDelay = 3000) //for every second after 3 seconds
   // @Scheduled(cron = "*/10 * * * * *")              //every 10 sec
    public void fixedRateSch() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        Date now = new Date();
        String strDate = sdf.format(now);
        System.out.println("Fixed Rate scheduler:: " + strDate);
    }
}

/** output:
 * Fixed Rate scheduler:: 2020-09-22 18:21:10.001
 * Fixed Rate scheduler:: 2020-09-22 18:21:20.018
 * Fixed Rate scheduler:: 2020-09-22 18:21:30.016
 */
