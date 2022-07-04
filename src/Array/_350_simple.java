package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 给你两个整数数组nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的
 * 次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
 * @author keyboardhero
 * @create 2022-07-04 10:33
 */
public class _350_simple {
    //先排序,然后使用两个指针分别比较
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        List<Integer> list = new ArrayList<>();
        if(nums1[i]<nums2[j])
            i++;
        else if(nums1[i]>nums2[j])
            j++;
        else{
            list.add(nums1[i]);
            i++;
            j++;
        }

        int index=0;
        int[] res=new int[list.size()];
        for(int k=0;k<list.size();k++)
            res[index++]=list.get(k);
        return res;
    }

    //Map方法
    public int[] intersect2(int[] nums1, int[] nums2) {

            HashMap<Integer, Integer> map = new HashMap<>();
            ArrayList<Integer> list = new ArrayList<>();

            //先把数组nums1的所有元素都存放到map中，其中key是数组中
            //的元素，value是这个元素出现在数组中的次数
            for (int i = 0; i < nums1.length; i++) {
                //put(key,value) getOrDefault(key,default value) 如果map中有key就用其值，如没有则用默认值
                map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
            }

            //然后再遍历nums2数组，查看map中是否包含nums2的元素，如果包含，
            //就把当前值加入到集合list中，然后再把对应的value值减1。
            for (int i = 0; i < nums2.length; i++) {
                if (map.getOrDefault(nums2[i], 0) > 0) {
                    list.add(nums2[i]);
                    map.put(nums2[i], map.get(nums2[i]) - 1);
                }
            }

            //把集合list转化为数组
            int[] res = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                res[i] = list.get(i);
            }
            return res;
    }
}
