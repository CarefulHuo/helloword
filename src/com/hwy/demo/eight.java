package com.hwy.demo;

public class eight {
    public static void main(String args[]){
        char [] chars = {'"','"'};
        String str = String.valueOf(chars);
        int n = 9;
        eight eight = new eight();
        eight.rotateString(chars,n);
    }
    public void rotateString(char[] str, int offset) {
        // write your code here
        if (str.length==0){
            str = str;
            System.out.println(str);
        }else{
            offset = offset % str.length;
            String strs = String.valueOf(str);
            String request = strs.substring((str.length - offset),str.length);
            String response = strs.substring(0,(str.length - offset));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(request);
            stringBuilder.append(response);
            System.out.println(stringBuilder);
            str = stringBuilder.toString().toCharArray();
            System.out.println(str);
        }
    }
}
