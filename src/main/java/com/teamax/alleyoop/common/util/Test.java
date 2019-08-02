package com.teamax.alleyoop.common.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 日期格式
        Date date = dateFormat.parse("2018-06-29 16:17:26"); // 指定时间（字符串格式）
        Date newDate = addDate(date, 15);
        System.out.println("原始的时间：                   "+dateFormat.format(date));// 输出格式化后的日期
        System.out.println("加上天数之后的时间："+dateFormat.format(newDate));
        System.out.println(date.getTime() > newDate.getTime());
    }


    public static Date addDate(Date date,long day) throws ParseException {
        long time = date.getTime(); // 得到指定日期的毫秒数
        day = day*24*60*60*1000; // 要加上的天数转换成毫秒数
        time+=day; // 相加得到新的毫秒数
        return new Date(time); // 将毫秒数转换成日期
    }

}
