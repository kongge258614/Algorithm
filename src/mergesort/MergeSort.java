package mergesort;

import java.util.Arrays;

/**
 * @Author liliang
 * @Date 2019/3/10 21:05
 * @Description: 归并排序
 **/
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {56, 33, 71, 21, 13, 6, 27, 38, 133, 87, 126, 76, 99, 13, 37};
        int[] temp = new int[arr.length];
        sort(arr,0,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));
    }

    //递归调用，首先应该明确递归终止条件，否则会造成栈内存溢出
    private static void sort(int[] arr,int left,int right,int[] temp) {
        if(left >= right){
            return;
        }
        int middle = (left+right)/2;
        sort(arr, left, middle, temp);
        sort(arr, middle+1, right, temp);
        merge(arr,left,middle,right,temp);
    }

    private static void merge(int[] arr,int left,int middle, int right,int[] temp) {
        int k = 0;  //临时数组指针
        int i = left;  //左序列指针
        int j = middle+1; //右序列指针

        while (i<= middle && j<=right){
            if (arr[i]<=arr[j]){
                temp[k++] = arr[j++];
            }else{
                temp[k++] = arr[i++];
            }
        }
        while (i<= middle){
            temp[k++] = arr[i++];
        }
        while (j<= right){
            temp[k++] = arr[j++];
        }
        k = 0;
        while (left <= right ){
            arr[left++] = temp[k++];
        }
    }
}
