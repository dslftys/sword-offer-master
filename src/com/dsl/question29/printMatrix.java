package com.dsl.question29;

/**
 * Created by Victor on 2017/8/23.
 * 顺时针循环打印矩阵
 */
public class printMatrix {
    public void printMatrixCircle(int [][]number) {
        if (number == null || number.length <= 0) {
            return;
        }
        int row = number.length - 1;
        int column = number[0].length - 1;
        for (int i = 0; 2 * i <= row && 2 * i <= column; i++) {
            printOneCircle(number, column, row, i);
        }
    }
    private void printOneCircle(int[][] number, int column, int row, int start) {
        int endX=column-start;
        int endY=row-start;

        //从左到右打印一行
        for(int i=start;i<=endX;++i){
            System.out.println(number[start][i]);
        }
        //从上到下打印一行
        if(start <endY){
            for(int i=start+1;i<=endY;++i){
                System.out.println(number[i][endX]);
            }
        }
        //从右到左
        if(start <endX && start <endY){
            for(int i=endX-1;i>=start;--i){
                System.out.println(number[endY][i]);
            }
        }

        //从下到上打印一列
        if(start <endX && start<endY-1){
            for(int i=endY-1;i>start+1;--i){
                System.out.println(number[i][start]);
            }
        }

    }
}
