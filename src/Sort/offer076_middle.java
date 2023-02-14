package Sort;

/**
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 *
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素
 * @author keyboardhero
 * @create 2022-11-02 10:34
 */
public class offer076_middle {
    public int findKthLargest(int[] nums, int k) {
        int heapSize=nums.length;
        buildMaxHeap(nums,heapSize);
        for(int i=nums.length-1;i>=nums.length-k+1;i--){ //决定删几次
            swap(nums,0,i); //交换首尾，相当于移除堆顶元素
            --heapSize;//容量减一再调整
            maxHeapify(nums,0,heapSize);
        }
        return nums[0];
    }

    public void buildMaxHeap(int[] a, int heapSize){
        for(int i=heapSize/2-1;i>=0;i--){  //从下往上调整，heapSize/2-1是第一个非叶子节点的位置
            maxHeapify(a, i, heapSize);
        }
    }

    public void maxHeapify(int[] a, int i, int heapSize) {
        int l=2*i+1,r=2*i+2,largest=i;//分别定义左右节点，注意下标从0开始，所以是2倍+1、2倍+2
        if(l<heapSize && a[l]>a[largest])
            largest=l;
        if(r<heapSize && a[r]>a[largest])
            largest=r;
        if(largest!=i){
            swap(a,i,largest);
            maxHeapify(a,largest,heapSize);//递归
        }
    }

    public void swap(int[] a,int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

}
