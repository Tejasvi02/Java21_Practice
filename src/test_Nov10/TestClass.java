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
        var at = AccountType.valueOf("FD");
        System.out.println(at.ordinal()+" "+at);
        
        LocalDateTime ld = LocalDateTime.of(2022, Month.OCTOBER, 31, 10, 0);

        ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Duration.ofDays(1));
        System.out.println(date);

        date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Period.ofDays(1));
        System.out.println(date);
    }

}

