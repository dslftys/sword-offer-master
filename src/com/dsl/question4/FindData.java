package com.dsl.question4;

/**
 * Created by Victor on 2017/7/18.
 * 在一个二维数组中，每一行都是从左到右递增的顺序排列，每一列都按照从
 * 上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数
 * 判断数组中是否含有该整数
 */
public class FindData {
    public static boolean Find(int target, int [][] array) {
        int len=array.length-1;
        int i=0;
        while ((len>=0)&&(i<array[0].length)){
            if(array[len][i]>target){
                len--;
            }else if(array[len][i]<target){
                i++;
            }else {
                return true;
            }
        }
        return false;
    }
    public static boolean Find1(int target, int [][] array) {
        if((array == null || array.length ==0)||(array.length == 1 && array[0].length == 0)) return false;
        int col=array[0].length;
        int row=array.length;
        boolean isContain=false;
        for (int i = 0; i < row&&(!isContain); i++) {
            if(target >array[i][col-1]){
                continue;
            }else{
                for (int j = col - 1; j >= 0&&(!isContain); j--) {
                    if(j == 0 && target <array[i][j]){
                        isContain =false;
                    }
                    if(target == array[i][j]){
                        isContain=true;
                    }
                }
            }

        }
        return isContain;
    }

    public static void main(String[] args) {
        int [][]array={{}};
        Find(16,array);
    }
}
