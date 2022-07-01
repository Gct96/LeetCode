package Array;

/**
 * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数
 * @author keyboardhero
 * @create 2022-07-01 9:50
 */
public class _189_middle {
    public void rotate(int[] nums, int k) {
        //临时数组法
        int length=nums.length;
        int[] temp=new int[length];
        for(int i=0;i<length;i++){
            temp[i]=nums[i];
        }
        for(int i=0;i<length;i++){
            nums[(i+k)%length]=temp[i];
        }
    }

    //三逆置法
    public void rotate2(int[] nums, int k) {
        int length=nums.length;
        k%=length;
        reverse(nums,0,length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,length-1);
    }

    private void reverse(int[] nums,int start,int end){
        while (start<end){
            int temp=nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }
    }
}
