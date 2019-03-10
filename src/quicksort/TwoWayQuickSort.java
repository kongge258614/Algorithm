package quicksort;

import java.util.Arrays;

/**
 * @Author liliang
 * @Date 2019/3/10 22:05
 * @Description:双路快速排序
 **/
public class TwoWayQuickSort {
    public static void main(String[] args) {
        int[] arr = {56, 33, 71, 21, 13, 6, 27, 38, 133, 87, 126, 76, 99, 13, 37};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    //递归调用，递归调用首先确定好递归终止条件，否则会造成栈内存溢出。
    private static void quicksort(int[] arr, int left, int right) {
        if (left > right){
            return;
        }
        int p = partition(arr, left, right);
        quicksort(arr,left,p-1);
        quicksort(arr,p+1,right);
    }
    private static int partition(int[] arr,int left,int right){
        int random = left+(int) (Math.random()*(right-left+1));
        swap(arr, left, random);
        int v = arr[left];
        int i =left+1,j = right;
        while (true){
            while (i<=right && arr[i]<v) i++;
            while (j>=left+1 && arr[j] > v) j--;
            if (i > j){
                break;
            }
            swap(arr,i,j);
            i++;
            j--;
        }

        //这一步将arr[left] 放到i处
        swap(arr, left, j);

        return j;
    }

    private static void swap(int[] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
