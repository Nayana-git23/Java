package com.nayana.reasearch.development;
import java.time.LocalDate;

public class LocalDateEx {
	public static void main(String[] args) {
        // Current date
        LocalDate currentDate = LocalDate.now();
        
        // Subtract 10 days
        LocalDate pastDate = currentDate.minusDays(11);
        
        LocalDate futureDate = currentDate.plusDays(11);
        
        System.out.println("Past date (11 days ago): " + pastDate);
        System.out.println("Future date (11 days later): " + futureDate);
        System.out.println("Today's Date is  :" + currentDate);
    }

}
