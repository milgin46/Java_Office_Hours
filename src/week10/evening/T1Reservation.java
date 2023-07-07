package week10.evening;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class T1Reservation {
    /*

T1Reservation [LocalDateTime, Scanner, conditional]

    Create a program that will help create a reservation for our restaurant.
    Ask the user to enter what year,month, and day they want to create the reservation
    Then ask what hour they want to create it for (assume the minutes are 0)

    Use the given information to create a LocalDateTime object and verify if the reservation can be made or not

    Here are the restrictions:
        - We are accepting reservations for only 2023
        ask for the year first and if it is not a valid year do not check anything else and print: Sorry we cannot make a reservation for the year $year

        - Any date before the current day(when the program is run) is invalid and should print:
        Sorry this date has already passed

        - Here is some days where reservations are booked: if the day selected is one of these print Sorry this date is all booked
            November 23
            December 24

        - check the time for the reservation, we have times open from 2 pm - 8 pm on weekends (FRI, SAT, SUN)
            if all the checks were met print: Book for $date
            if the other checks were met but the time given is not within the defined range print: Sorry we close at 11 on weekends
            otherwise, print: Sorry we only have availability on weekends

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = scanner.nextInt();
        System.out.println("Enter Month");
        int month = scanner.nextInt();
        System.out.println("Enter day");
        int day = scanner.nextInt();
        System.out.println("Enter hour");
        int hour = scanner.nextInt();
        int minute = 0;
        LocalDateTime reservationDate = LocalDateTime.of(year, month, day, hour, minute);
        /*
          - We are accepting reservations for only 2023
        ask for the year first and if it is not a valid year do not check anything else and print: Sorry we cannot make a reservation for the year $year
         */
        //   if (year!=2023){
        if (reservationDate.getYear() != 2023) {
            System.out.println("Sorry we cannot make a reservation for the year " + year);
            System.exit(0);
        }

        LocalDateTime now = LocalDateTime.now();
        if (reservationDate.isBefore(now)){
            System.out.println("Sorry this date has already passed");
            System.exit(0);
        }
/*
 Here is some days where reservations are booked: if the day selected is one of these print Sorry this date is all booked
            November 23
            December 24
 */
        LocalDate reserved1=LocalDate.of(2023,11,23);
        LocalDate reserved2=LocalDate.of(2023,12,24);
        LocalDate reservationDateDayAndMounth=LocalDate.of(year,month,day);

        if (reservationDateDayAndMounth.isEqual(reserved1)|| reservationDateDayAndMounth.isEqual(reserved2)){
            System.out.println("date is all booked");
            System.exit(0);
        }
        /*
        - check the time for the reservation, we have times open from 2 pm - 8 pm on weekends (FRI, SAT, SUN)
            if all the checks were met print: Book for $date
            if the other checks were met but the time given is not within the defined range print: Sorry we close at 11 on weekends
            otherwise, print: Sorry we only have availability on weekends
         */

        switch (reservationDate.getDayOfWeek().getValue()){

            case 5:  //Friday
            case 6:   //Sat
            case 7:   //Sun
                if (reservationDate.getHour()>=14 && reservationDate.getHour()<=20){
                    System.out.println("Booked for " + reservationDate.format(DateTimeFormatter.ISO_DATE_TIME));
                }else {
                    if (reservationDate.getHour()<14){
                        System.out.println("Not opened yet");
                    }
                    if (reservationDate.getHour()>20){
                        System.out.println("Closed");
                    }
                }


                break;

            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Sorry we only have availability on weekends");
                break;

        }

    }
}
