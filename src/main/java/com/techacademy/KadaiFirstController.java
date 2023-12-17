package com.techacademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
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
    @GetMapping("now")
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String usrDate = br.readLine(); // ユーザ入力日付
        br.close(); // リーダを閉じる

        Calendar cal = Calendar.getInstance(); // 現在日時
        SimpleDateFormat sdf = new SimpleDateFormat("yyyymmdd"); 
        Date date = sdf.parse(usrDate); // ユーザ入力日付解析
        cal.setTime(date); // ユーザが入力した日付に更新

        int weekNum = cal.get(java.util.Calendar.DAY_OF_WEEK); // 曜日
        switch(weekNum) {
        case(Calendar.SUNDAY) : 
        case(Calendar.MONDAY) : 
        case(Calendar.TUESDAY) : 
        case(Calendar.WEDNESDAY) : 
        case(Calendar.THURSDAY) : 
        case(Calendar.FRIDAY) : 
        case(Calendar.SATURDAY) : 
        }

        sdf.applyPattern("yyyymmdd"); // フォーマッタのパターンを変更
        }

        static void dispDayOfWeek(String dateStr,String dayOfWeek) {
        String now = null;
        System.out.println( dayOfWeek + now);
        
        
        //public String dispDayOfWeek() {
        //String now = Calendar.now().format( Date.ofPattern("yyyymmdd") );
        //return "実行結果：" + now;
        
        //public String dispDayOfWeek(@PathVariable String date) {
        // 現在の日付を取得
        //Date date = new Date();

        // Calendarインスタンスを取得
        //Calendar calendar = Calendar.getInstance();

        // DateをCalendarにセット
        //calendar.setTime(date);
        //System.out.println(date);

        // 曜日を取得
        //int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // 曜日を出力
        //String[] weekDays = {"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        //System.out.println("weekDays[dayOfWeek]");
        
        //String dayOfWeek = Calendar.dayOfWeek().format( Date.ofPattern("yyyymmdd") );

        //return "Tuesday";  
    }
        
    private Object Calendar(String string) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }
    private Object Date() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
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
    
