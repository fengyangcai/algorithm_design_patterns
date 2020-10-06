package cn.algorithm.sort;

/*
快速排序
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {23, 45, 17, 11, 13, 89, 72, 26, 3, 17, 11, 13};
        quick(arr, 0, arr.length-1);
        System.out.println(arr);
    }

    //这里是快速排序
//快速排序
    public static void quick(int[] arr, int begin, int end) {
        if (begin<end) {
            int temp = arr[begin];
            int i = begin;
            int j = end;
            while (j > i) {

                while (i < j && arr[j] > temp) {
                    j--;
                }
                //找到了比temp小的就把这个值放到arr[i]；
                arr[i] = arr[j];
                while (i < j && arr[i] <= temp) {
                    i++;
                }
                arr[j] = arr[i];
            }
            arr[i] = temp;
            quick(arr, begin, i - 1);
            quick(arr, i + 1, end);
        }else {
            return;
        }
    }
}
