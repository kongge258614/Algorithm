package quicksort;

import java.util.Arrays;

/**
 * @Author liliang
 * @Date 2019/3/10 21:07
 * @Description :快速排序
 **/
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {56, 33, 71, 21, 13, 6, 27, 38, 133, 87, 126, 76, 99, 13, 37};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    // 递归调用，首先设置递归的终止条件，否则会出现栈内存溢出。
    private static void quicksort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int p = partition(arr, left, right);
        quicksort(arr, left, p - 1);
        quicksort(arr, p + 1, right);

    }

    // 方法1
/*    private static int partition(int[] arr, int left, int right) {
        int v = arr[left];
        int j = left;
        for (int i = left+1; i <= right ; i++){
            if (arr[i] < v){
                swap(arr,j+1,i);
                j++;
            }
        }
        swap(arr,left,j);
        return j;
    }*/

    // 方法2
    private static int partition(int[] arr, int left, int right) {
        int random = left+(int) (Math.random()*(right-left+1));
        swap(arr,left,random);
        int v = arr[left];
        int j = left;
        for (int i = left+1; i <= right ; i++){
            if (arr[i] < v){
                swap(arr,j+1,i);
                j++;
            }
        }
        swap(arr,left,j);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
