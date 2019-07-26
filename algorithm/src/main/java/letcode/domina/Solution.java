package letcode.domina;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-26
 */
public class Solution {


    public static int numEquivDominaPairs(int[][] dominoes) {
        int[] result = new int[100];
        int num = 0;
        int size = dominoes.length;
        int  val;

        for (int i = 0; i < size; i++) {
            if (dominoes[i][0] < dominoes[i][1]) {
                val = dominoes[i][1] * 10 + dominoes[i][0];
            } else {
                val = dominoes[i][0] * 10 + dominoes[i][1];
            }
            result[val] = result[val] + 1;
        }
        for (int i = 0; i < 100; i++) {
            if (result[i] > 1) {
                num += (result[i] - 1) * result[i] / 2;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[][] dominoes = new int[][]{{1,2},{1,1},{2,1},{1,2},{1,1},{2,2}};
        System.out.println(Solution.numEquivDominaPairs(dominoes));
    }
}
