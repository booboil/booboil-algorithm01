package class01;

/**
 * 选择排序算法
 */
public class Code07_selectSort {

    public static void selectSort1(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int minValueIndex = i; //i
            for (int j = i+1; j < N; j++) {
                //确定下标最小值
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            swap(arr, i, minValueIndex);
        }
    }
    //交换
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 5, 8, 9, 2, 3, 5};
        printArray(arr);
        selectSort1(arr);
        printArray(arr);
    }
}
