package com.xj.kmp;

import java.util.Arrays;

public class KMPAlgorithm {
    public static void main(String[] args) {
        String s1 = "BBC ABCDABgg ABCDABCDABDE";
        String dest = "ABCDABD";
        int[] ints = kmpNext(dest);
        int i = kmpSearch(s1, dest, ints);
        System.out.println(i);
    }
    public static int kmpSearch(String s1,String s2,int[] next){
        for (int i=0,j=0;i<s1.length();i++){
            while (j > 0 && s1.charAt(i) != s2.charAt(j)){
                j = next[j - 1];
            }
            if (s1.charAt(i) == s2.charAt(j)){
                j++;
            }
            if (j == s2.length()) {
                return i - j + 1;
            }
        }
        return -1;
    }
    /**
     * 获取字符串子串的部分匹配表
     * @param dest
     * @return
     */
    public static int[] kmpNext(String dest){
        int[] next = new int[dest.length()];
        next[0] = 0;
        for (int i=1,j=0;i<dest.length();i++){
            while (j > 0 && dest.charAt(i) != dest.charAt(j)){
                j = next[j - 1];
            }
            if (dest.charAt(i) == dest.charAt(j)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
