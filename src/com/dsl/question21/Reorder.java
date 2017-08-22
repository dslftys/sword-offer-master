package com.dsl.question21;

/**
 * Created by Victor on 2017/8/22.
 * 将奇数放在左侧，偶数放在右侧
 */
public class Reorder {
    public void ReorderOddEven(int []data){
        if(data == null || data.length <=0){
            return;
        }
        int left=0;
        int right=data.length-1;
        while(left < right){
            //向后移动left直到它指向偶数
            while(left<right&&(data[left]%2 != 0)){
                left++;
            }
            //向前移动right直到它指向奇数
            while(left<right && (data[right]%2 !=1)){
                right--;
            }
            // 交换
            if(left <right){
                int temp=data[left];
                data[left]=data[right];
                data[right]=temp;
            }
        }
    }
}
