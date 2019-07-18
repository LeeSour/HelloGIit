package TestDemo;

import java.util.Calendar;

/**
 *
 * @title: print the time the day of yesterday
 * @author: LeeSour
 * @time: 7-18
 */
public class Demo01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,-1);
        System.out.println(cal.getTime());


    }

}

