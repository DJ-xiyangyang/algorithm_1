package com.yansu.algorithm;

/**
 * 快速排序
 * 循环解析；首先进入judge1，假设数组只有一个元素，直接return，假设数组有两个元素，进入judge1，判断judge2，假如
 * 此时是顺序，j--，跳出judge2，判断judge3，此时i=j，不满足judge3，同时也不满足judge4，进入judge5，由于i=j，自己
 * 交换以后，judge1循环结束，接着判断judge1，不满足，结束循环。假设数组元素个数在3个以及3个以上，有三个关键点：
 * 1.此算法是否会出现i>j的情况，经过分析，不会，因为每进行一次judge的前提是，判断i<j,每执行一次j--、i++，都会判断
 * 如果不满足，则结束判断。
 * 2.judge4的意义：分析，如果达到judge4，那么i<j必定成立，那么，在judge2和judge3中跳出循环时，i<j也是必定成立的，
 * 那么跳出循环时，judge2必定满足，arrs[j]<=pivot、judge3必定满足arrs[i] >=pivot、那么显而易见，进入judge4的条件
 * 为arrs[j]=pivot=arrs[i],这种情况下，如果不进行i++，或者j--，直接进行交换，就会进入死循环，真佩服写出这个方法
 * 的人。
 * 3.judge5何时会执行：第一种就是在i<j时的一般交换，另一种就是相等时的自我交换
 * 4.关于快速排序，还有许多路要走，这个方法看了两天，才看明白，惊叹于它的精炼与优雅，何时我才能写出这样的代码。
 */
public class QuickSort {

    public static Integer[] qSort(Integer[] arrs,Integer start,Integer end){

        Integer pivot=arrs[start];
        int i= start;
        int j=end;
        while (i<j){//judge1
            while(i<j && arrs[j]>pivot){//judge2

                j--;
                
            }
            while(i<j && arrs[i]<pivot){//judge3

                i++;
            }
            if (i<j && arrs[i]==arrs[j]){//judge4

                i++;//也可以j--
            }
            else{//judge5
                Integer temp = arrs[i];
                arrs[i]=arrs[j];
                arrs[j]=temp;
            }
        }
        if (i-1>start){
            qSort(arrs,start,i-1);
        }
        if (j+1<end){
            qSort(arrs,j+1,end);
        }
        return arrs;

    }

    public static void main(String[] args) {
     Integer[] arrs= new Integer[]{1,2,1,1,4,5,1,2};
     qSort(arrs,0,arrs.length-1);
    }
}
