package com.kk.practice;

import java.time.LocalDate;

public class Sample {

    public static int calculateWorkingDays(LocalDate startDate, LocalDate endDate) {
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);

        int workingDays = 0;
        startDate = startDate.plusDays(1); // To exclude the start date from the count.
        while(!startDate.isAfter(endDate)) {
            if(!startDate.getDayOfWeek().name().equalsIgnoreCase("SATURDAY") && !startDate.getDayOfWeek().name().equalsIgnoreCase("SUNDAY")){
                workingDays++;
            }
            startDate = startDate.plusDays(1);
        }
        return workingDays;
    }
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.now().minusDays(8); // Alert raise date
        LocalDate endDate = LocalDate.now(); // Alert disappearance date

        int workingDays = calculateWorkingDays(startDate, endDate);

        System.out.println("Working days: " + workingDays);
    }
}
