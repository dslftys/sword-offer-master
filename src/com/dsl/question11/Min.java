package com.dsl.question11;

/**
 * Created by Victor on 2017/8/19.
 * 递增数组从首位到某个位置移动到数组的后面，称为旋转数组
 */
public class Min {
    public int findMin(int []a) throws Exception {
        if(a == null || a.length <= 0){
            throw  new Exception("errr");
        }
        int left=0;
        int right=a.length-1;
        int mid=0;
        while(a[left] >= a[right]){
            if(right -left == 1){
                mid=right;
                break;
            }
            mid=(left+right)/2;
            //如果left right和mid指向的三个数字都相等，则只能顺序查找
            if(a[left] ==a[right] && a[mid] == a[left]){
                return MinInOrder(a,left,right);
            }
            if(a[mid]>=a[left]){
                left=mid;
            }else if(a[mid]<=a[right]){
                right=mid;
            }
        }
        return a[mid];
    }
    public int MinInOrder(int [] a,int index1,int index2){
        int result=a[index1];
        for(int i=index1+1;i<=index2;i++){
            if(a[result] >a[i]){
                result=a[i];
            }
        }
        return result;
    }
}
