package com.xj.dynamic;

public class KnapsackProblem {
    public static void main(String[] args) {
        int w[] = {1,4,3,2,1};//物品重量
        int val[] = {200,1500,3000,2000,1000};//物品价值
        int m = 10;//背包容量
        int n = val.length;//物品个数
        //v[i][j]表示前i个物品能够装入容量为j的背包中的最大价值
        int [][] v = new int[n + 1][m + 1];
        int path[][] = new int[n + 1][m + 1];
        for (int i=1;i<v.length;i++){
            for (int j=1;j<v[0].length;j++){
                if(w[i-1] > j){
                    v[i][j] = v[i - 1][j];
                }else {
                    if (v[i-1][j] < (val[i-1] + v[i-1][j-w[i-1]])){
                        v[i][j] = val[i-1] + v[i-1][j-w[i-1]];
                        path[i][j] = 1;
                    }else {
                        v[i][j] = v[i-1][j];
                    }
                }
            }
        }
        for(int i =0; i < v.length;i++) {
            for(int j = 0; j < v[i].length;j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }
        int i = v.length - 1;
        int j = v[0].length - 1;
        while (i > 0 && j > 0) {
            if (path[i][j] == 1) {
                System.out.println("第" + i + "个商品放进去了");
                j -= w[i-1];
            }
            i--;
        }

    }
}
