package cn.algorithm.sort;

/*
冒泡和选择排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {23, 45, 17, 11, 13, 89, 72, 26, 3, 17, 11, 13};
        int[] bubble = bubble(arr);
        System.out.println(bubble);
        int[] select = select(arr);
        System.out.println(select);

    }

    //冒泡排序的方法
	//改改改-----------
    public static int[] bubble(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        return arr;
    }

    //选择排序
    public static int[] select(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        return arr;
    }


}
