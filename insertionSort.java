package algo;

import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
    }

    private static void sortArray(int[] arr) {


        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void selectionSort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            int min =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i]=temp;
        }

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
