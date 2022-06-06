package Math;

/**
 * 给你一个日期，请你设计一个算法来判断它是对应一周中的哪一天。
 * 输入为三个整数：day、month和year，分别表示日、月、年。
 * 您返回的结果必须是这几个值中的一个{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}。
 * @author keyboardhero
 * @create 2022-06-06 10:55
 */
public class _1185_simple {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] week={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] monthDays={31,28,31,30,31,30,31,31,30,31,30,31};
        //计算年份之前的天数
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
        return week[(days+3)%7];
    }
}
