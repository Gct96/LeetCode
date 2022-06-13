package Math;

import org.junit.Test;

/**
 * @author keyboardhero
 * @create 2022-06-13 10:23
 */
public class _1360_simple {
    private int dayOfYear(String date) {
        int year= Integer.parseInt(date.substring(0,4));
        int month=Integer.parseInt(date.substring(5,7));
        int day=Integer.parseInt(date.substring(8));
        int[] monthDays={31,28,31,30,31,30,31,31,30,31,30,31};
        int days=365*(year-1971)+(year-1969)/4; //第一个闰年是1972，往前推4年是1969
        //计算月份之前的天数
        for(int i=0;i<month-1;i++){
            days+=monthDays[i];
        }
        if((year%400==0||(year%4==0&&year%100!=0))&&month>=3){
            days++;
        }
        //计算当月天数
        days+=day;
        return days;
    }

    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(dayOfYear(date2)-dayOfYear(date1));
    }

    @Test
    public void test(){
        String date1="2020-01-15";
        String date2="2019-12-31";
        int i = daysBetweenDates(date1, date2);
        System.out.println(i);
    }
}
