package com.yansu.algorithm;

/**
 * 二分查找,前提有序
 */
public class BinarySearch {

    public static Integer[] ARRS = new Integer[]{-96,-78,-78,-45,-23,11,17,33,56,101};

    public static void main(String[] args) {
        int goal=-45;
        int head=0;
        int end = ARRS.length-1;
        boolean flag= false;
        while (head<=end){
            int middle= (head+end)/2;
            if (goal==ARRS[middle]){
                flag=true;
                System.out.println(middle);
                //如果不加break会无限循环
                break;
            }else if (goal>ARRS[middle]){
                head=middle+1;
            }else {
                end=middle-1;
            }
        }
        if(!flag){
            System.out.println("not found");
        }
    }
}
