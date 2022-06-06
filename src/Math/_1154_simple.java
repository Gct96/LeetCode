package Math;

import org.junit.Test;

/**
 * 给你一个字符串 date ，按 YYYY-MM-DD 格式表示一个 现行公元纪年法 日期。返回该日期是当年的第几天
 * @author keyboardhero
 * @create 2022-06-06 10:12
 */
public class _1154_simple {
    public int dayOfYear(String date) {
        int year= Integer.parseInt(date.substring(0,4));
        int month=Integer.parseInt(date.substring(5,7));
        int day=Integer.parseInt(date.substring(8));
        int[] amount={31,28,31,30,31,30,31,31,30,31,30,31};
        if(year%400==0||(year%4==0&&year%100!=0)){
            amount[1]++;
        }
        int ans=0;
        for(int i=0;i<month-1;i++){
            ans+=amount[i];
        }
        return ans+day;
    }

    @Test
    public void test(){
        int i = dayOfYear("2019-02-10");
        System.out.println(i);
    }
}
