package Array;

/**
 * 给定一个长度为 n 的整数数组height。有n条垂线，第 i 条线的两个端点是(i, 0)和(i, height[i])。
 * 找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
 * 返回容器可以储存的最大水量。
 * 说明：你不能倾斜容器
 *
 * @author keyboardhero
 * @create 2023-02-16 10:22
 */
public class _11_middle {
    //双指针法
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int width=0,area=0,max=0;
        while(left<right){
            width=right-left;
            if(height[left]>=height[right]){
                area=width*height[right];
                max=max(area,max);
                right--;
            }
            else{
                area=width*height[left];
                max=max(area,max);
                left++;
            }
        }
        return max;
    }

    int max(int area, int max){
        if(max==0||max<area)
            max=area;
        return max;
    }
}
