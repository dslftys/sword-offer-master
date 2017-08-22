package com.dsl.question14;

/**
 * Created by Victor on 2017/8/20.
 * 给一个n长的绳子，剪成m段。使得其最大乘积
 */
public class CutRope {

    public int maxProductAftercutting2(int len){
        if(len < 2) return 0;
        if(len == 2) return 1;
        if(len == 3) return 2;

        //尽可能多的剪去长度为三的绳子段
        int timesOf3=len/3;

        //当绳子最后剩下的长度为4的时候，不能再剪去长度为3的绳子段
        //此时更好的方法是把绳子剪成长度为2的两段，因为2*2>3*1
        if(len-timesOf3*3 ==1){
            timesOf3 -=1;
        }
        int timesOf2=(len-timesOf3*3)/2;
        return (int) (Math.pow(3,timesOf3)*Math.pow(2,timesOf2));

    }
    public int maxProductAftercutting(int len){
        if(len < 2) return 0;
        if(len == 2) return 1;
        if(len == 3) return 2;

        int []products=new int[len+1];
        products[0]=0;
        products[0]=1;
        products[0]=2;
        products[0]=3;

        int max=0;
        for(int i=4;i<=len;++i){
            max=0;
            for(int j=1;j<i/2;++j){
                int product=products[j]*products[i-j];
                if(max<product){
                    max=product;
                }
                products[i]=max;
            }
        }
        max=products[len];
        return max;
    }
}
