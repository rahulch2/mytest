/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Administrator
 */
public class LocalDateTimeEXM {
    public void LocaldateTimeMEthod(){
          LocalDateTime now =LocalDateTime.now();  
        System.out.println("Before Formatting: " + now);  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formatDateTime = now.format(format);  
        System.out.println("After Formatting: " + formatDateTime);  
}
    public void PlusORMinusDates(){
        LocalDateTime date1=LocalDateTime.of(2017, Month.JUNE, 5, 10, 23, 23);
        System.out.println("Before Formatting: " + date1);  
        LocalDateTime date2=date1.withDayOfMonth(1);
           System.out.println("Statrt of month : " + date2);  
       //   LocalDateTime  amountToSubtract=LocalDateTime.of(2017, Month.MARCH, 5, 10, 23, 23);
         date2=date1.minusDays(23);
           System.out.println("minusDays of month : " + date2);  
    }
    
    
    public static void main(String[] args) {
        LocalDateTimeEXM obj=new LocalDateTimeEXM();
        obj.LocaldateTimeMEthod();
        obj.PlusORMinusDates();
        
    }
}
