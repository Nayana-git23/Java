package com.nayana.reasearch.development;

import java.time.LocalDateTime;

public class LocalDateTimeEx {
    public static void main(String[] args) {

        // Current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Add 10 days, 5 hours, and 30 minutes to the current date and time
        LocalDateTime futureDateTime = currentDateTime.plusDays(10)
                                                      .plusHours(5)
                                                      .plusMinutes(30);
        
        LocalDateTime pastDateTime = currentDateTime.minusDays(10)
                                                     .minusHours(5)
                                                      .minusMinutes(30);

        System.out.println("Future date and time (10 days, 5 hours, 30 minutes later): " + futureDateTime);
        System.out.println("past date and time (10 days, 5 hours, 30 minutes before): " + pastDateTime);
    }
    }

