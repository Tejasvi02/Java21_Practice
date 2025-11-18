package test_Nov10;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

enum AccountType{
    CHECKING("Checking account"), SAVINGS("Savings account"),
    FD("Fixed Deposit");
    
    private String desc;
    AccountType(String desc){
        this.desc =  desc;
    }
    
    @Override
    public String toString(){
        return "Acct type:"+super.toString();
    }
    
}

public class TestClass {
    public static void main(String[] args) {
//        var at = AccountType.valueOf("FD");
//        System.out.println(at.ordinal()+" "+at);
//        
//        LocalDateTime ld = LocalDateTime.of(2022, Month.OCTOBER, 31, 10, 0);
//
//        ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
//        date = date.plus(Duration.ofDays(1));
//        System.out.println(date);
//
//        date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
//        date = date.plus(Period.ofDays(1));
//        System.out.println(date);
        
//    	daylight Savings Time ends on Nov 6 at 2 AM in US/Eastern time zone. 
//    	(As a result, 2 AM becomes 1 AM. In other words, one minute after 1.59 AM,
//    	the clock shows 1 AM instead of 2 AM.), 
//    	what will the following code print?
        LocalDateTime ld = LocalDateTime.of(2022, Month.NOVEMBER, 6, 1, 30);
        ZonedDateTime date1 = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        ZonedDateTime date2 = date1.plusHours(1);
        System.out.println(date1.getHour()+" "+date2.getHour());
    }

}

