package com.yansu.algorithm;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static Integer[] ARRS = new Integer[]{23,12,56,-78,-666,5,12,44,76,-3};

    public static void main(String[] args) {

        //i代表一共需要比较几轮，第一轮会将最大的数置换到最后，依次类推，n个元素，经过n-1轮，就会将n-1个数
        //从小到大排好序，剩下的一个数字最小不用排了，所以从0开始，一直到length-2，一共是length-1次
        for(int i = 0;i<ARRS.length-1;i++){
            //j代表在每一轮中需要比较的次数，以第一轮为例，j从0开始，会一直比较到倒数第二个元素，每次比较，如果
            //发生逆序，则交换两个元素，而在第二轮，i=1，由于最后一个元素已经就位，比较的次数就会减少一次，依次
            //类推，最后一次比较的下标为length-2-i，所以，跳出循环的条件为length-1-i。
            for (int j= 0;j<ARRS.length-1-i;j++){

                if (ARRS[j]>ARRS[j+1]){
                    int temp=ARRS[j];
                    ARRS[j]=ARRS[j+1];
                    ARRS[j+1]=temp;
                }
            }
        }
        for(int i=0;i<ARRS.length;i++){

            if (i==ARRS.length-1){

                System.out.println(ARRS[i]);
            }
            else {
                System.out.print(ARRS[i] + " < ");
            }

        }
        System.out.println();

        //这是从大到小排序
        for (int i=0;i<ARRS.length-1;i++){

            for (int j=0;j<ARRS.length-1-i;j++){

                if (ARRS[j]<ARRS[j+1]){
                    int temp = ARRS[j];
                    ARRS[j]=ARRS[j+1];
                    ARRS[j+1]=temp;
                }
            }
        }
        for(int i=0;i<ARRS.length;i++){

            if (i==ARRS.length-1){

                System.out.println(ARRS[i]);
            }
            else {
                System.out.print(ARRS[i] + " > ");
            }

        }
        
    }
}
