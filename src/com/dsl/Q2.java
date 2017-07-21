package com.dsl;

/**
 * Created by Victor on 2017/7/18.
 * 实现一个函数，将一个字符串中的空格替换成%20.例如当字符串为We Are Happy则经过替换后的字符串为We%20Are%20Happy
 */
public class Q2 {
    public String replaceSpace(StringBuffer str) {
        if(str ==null){
            return null;
        }
        StringBuffer newStr=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                newStr.append('%');
                newStr.append('2');
                newStr.append('0');
            }else{
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }
    public String replaceSpace1(StringBuffer str) {
        if(str == null);
        String result="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c == ' '){
                result+="%20";
            }else{
                result+=c;
            }
        }
        return result;
    }
}
