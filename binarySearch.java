package algo;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter element you want to find");
        int findElement = sc.nextInt();
        //System.out.println(iterativeBinarySearch(arr, findElement));
        System.out.println(recursiveBinarySearch(arr,0,arr.length-1, findElement));
    }

    private static int iterativeBinarySearch(int[] arr, int element){
        int l =0;
        int r = arr.length-1;
        while(l<=r){
            int mid = l+ (r-l)/2;
            if(arr[mid]==element)
                return mid;
            if (arr[mid]<element)
                l=mid+1;
            else
                r= mid-1;
        }
        return -1;
    }

    private static int recursiveBinarySearch(int[] arr,int l, int r, int element){

        if(l<=r){
            int mid = l + (r-l)/2;
            if (arr[mid]==element)
                return  mid;
            if (arr[mid]<element)
                return recursiveBinarySearch(arr,mid+1,r,element);
            return recursiveBinarySearch(arr,l,mid-1,element);
        }
        return -1;
    }
}
