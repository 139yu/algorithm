package com.xj.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,7,8,23,77};
        int i = binarySearch(arr, 8,0,arr.length - 1);
        System.out.println(i);
    }

    /**
     * 二分查找算法，非递归
     * @param arr 有序数组
     * @param value 要查找的值
     * @return
     */
    public static int binarySearch(int arr[],int value){
        int low = 0;
        int high = arr.length - 1;
        int mid;
        boolean flag = false;
        while(low <= high){
            mid = (low + high) / 2;
            if (value < arr[mid]){
                high = mid - 1;
            }else if (value > arr[mid]){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    /**
     * 递归二分查找
     * @param arr 要查找的有序数组
     * @param value 要查找的值
     * @param low
     * @param high
     * @return
     */
    public static int binarySearch(int arr[],int value,int low,int high){
        int mid = (low + high) / 2;
        while (low <= high) {
            if (value < arr[mid]){
                return binarySearch(arr,value,low,mid - 1);
            }else if (value > arr[mid]){
                return binarySearch(arr,value,mid + 1,high);
            }else{
                return mid;
            }
        }
        return -1;
    }
}
