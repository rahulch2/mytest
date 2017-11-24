/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Administrator
 */
public class LocalDateEXM {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current Date : " + date);
        //It is used to return a copy of this LocalDate with the specified number of days subtracted.
        LocalDate yes = date.minusDays(1);
        System.out.println("Yesterday Date : " + yes);
        
         //It is used to return a copy of this LocalDate with the specified number of days subtracted.
        LocalDate monthsub = date.minusMonths(1);
         System.out.println("lastmonth Date : " + monthsub);
         LocalDate weeksub = date.minusWeeks(1);
        System.out.println("lastweek Date : " + yes);
        //Compare to date 
        int date1 = date.compareTo(yes);
        System.out.println("deference Date : " + date1);
        //Add Time into date
        LocalDateTime datetime = date.atTime(1, 50, 9);
        System.out.println("deference Date : " + datetime);

    }
}
