package com.dsl.question3;

/**
 * Created by Victor on 2017/8/9.
 */
public class DuplicateData {
    public static Integer duplicateFind1(int []numbers){
        if(numbers == null || numbers.length <=0){
            return null;
        }
        //所有数字都在n-1内
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<0 || numbers[i]>numbers.length-1){
                return null;
            }
        }
        //找到重复的数字
        for(int i=0;i<numbers.length;i++){
            while (numbers[i] !=i){
                if(numbers[i] == numbers[numbers[i]]){
                    return numbers[i];
                }
                //交换
                int temp=numbers[i];
                numbers[i]=numbers[temp];
                numbers[temp]=temp;
            }
        }
        return null;
    }
}
