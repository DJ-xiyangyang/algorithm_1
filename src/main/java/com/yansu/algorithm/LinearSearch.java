package com.yansu.algorithm;

/**
 * 线性查找
 */
public class LinearSearch {

public static String[] ARRS = new String[]{"AA","BB","CC","DD","EE"};

    public static void main(String[] args) {

        String goal = "BB";

        int i=0;

        for(;i<ARRS.length;i++){

            if (goal.equals(ARRS[i])){
                System.out.println(i);
                break;
            }
        }
        if (i==5){
            System.out.println("not found");
        }

    }
}
