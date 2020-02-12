package com.xj.kmp;

public class ViolenceMatch {
    public static void main(String[] args) {
        String str1 = "我真的很大老远的判断安排数据";
        String str2 = "的判断安排";
        int i = violenceMatch(str1, str2);
        System.out.println(i);
    }

    /**
     * 暴力匹配算法
     * @param str1
     * @param str2
     * @return
     */
    public static int violenceMatch(String str1,String str2){
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        int len1 = char1.length;
        int len2 = char2.length;
        int i = 0;
        int j = 0;
        while (i < len1 && j < len2){
            if (char1[i] == char2[j]){
                i++;
                j++;
            }else {
                i = i - (j - 1);
                j = 0;
            }
        }
        if (j == len2){
            return i - j;
        }else {
            return -1;
        }
    }
}
