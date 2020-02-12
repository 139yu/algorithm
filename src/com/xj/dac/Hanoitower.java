package com.xj.dac;

public class Hanoitower {
    public static void main(String[] args) {
        hanoitower(3,'A','B','C');

    }
    public static void hanoitower(int n,char a,char b,char c){
        if (n == 1) {
            System.out.println("第1个盘从 " + a + "->" + c);
        }else {
            hanoitower(n -1,a,c,b);
            System.out.println("第" + n + "个盘从 " + a + "->" + c);
            hanoitower(n -1,b,a,c);
        }
    }
}
