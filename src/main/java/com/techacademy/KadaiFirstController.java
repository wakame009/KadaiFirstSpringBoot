package com.techacademy;

import java.util.Calendar;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {
    
    @GetMapping("/")
    public String index() {
        return "Hello SpringBoot!";
    }
    @GetMapping("dayOfWeek")
    public String dispDayOfWeek() {
     // 現在の日付を取得
        Date date = new Date();

        // Calendarインスタンスを取得
        Calendar calendar = Calendar.getInstance();

        // DateをCalendarにセット
        calendar.setTime(date);
        System.out.println(date);

        // 曜日を取得
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // 曜日を出力
        String[] weekDays = {"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        System.out.println("weekDays[dayOfWeek]");
        
        //String dayOfWeek = Calendar.dayOfWeek().format( Date.ofPattern("yyyymmdd") );

        return "指定日" ;
        
    }
    //足し算
    //@GetMapping("calcPlus")
    public void calcPlus() {
            int 数値1 = 6;
            int 数値2 = 3;
            System.out.println( 数値1 + 数値2);
    }
    //引き算
    public void calcMinus() {
            int 数値1 = 6;
            int 数値2 = 3;
        System.out.println( 数値1 - 数値2);
    }
    //掛け算
    public void calcTimes() {
        int 数値1 = 6;
        int 数値2 = 3;
    System.out.println( 数値1 * 数値2);
    }
  //割り算
    public void calcDivide() {
        int 数値1 = 6;
        int 数値2 = 3;
    System.out.println( 数値1 / 数値2);
    }
}
    
