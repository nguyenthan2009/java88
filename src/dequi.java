

import java.util.Arrays;
import java.util.Scanner;

public class dequi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrays = new int[4];
        System.out.println("Nhập các giá trị của mảng");
        for(int i =0;i< arrays.length;i++){
            arrays[i]= sc.nextInt();
        }
        Arrays.sort(arrays);
        for(int i=0;i< arrays.length;i++){
            System.out.println(arrays[i]);
        }
        System.out.println(binarySearch(arrays,0,arrays.length-1,4));

    }
    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if(array[middle] == value){
                return middle;
            }
            if(value > array[middle]){
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
