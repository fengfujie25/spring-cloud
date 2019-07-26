package algorithm;

/**
 * @auther: fujie.feng
 * @DateT: 2019-06-27
 */
public class FangGeShu {

    public static void print(int num) {
        long t1 = System.currentTimeMillis();
        int length = num * num;
        for (int i = 1; i <= length; i++) {
            System.out.print(i + " ");
            if (i % num == 0) {
                System.out.println(i);
            }
        }
        System.out.println("1:" + (System.currentTimeMillis() - t1) + "ms");
    }

    public static void print2(int num) {
        long t1 = System.currentTimeMillis();
        for (int i = 1; i <= num; i++) {
            int start = num * (i - 1) + 1;
            int end = num * i;
            for (int j = start; j <= end; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        System.out.println("2:" + (System.currentTimeMillis() - t1) + "ms");
    }

    public static String replaceSpace(StringBuffer str) {
        int P1 = str.length() - 1;
        for (int i = 0; i <= P1; i++)
            if (str.charAt(i) == ' ')
                str.append("  ");
        System.out.println(str.toString());
        int P2 = str.length() - 1;
        while (P1 >= 0 && P2 > P1) {
            char c = str.charAt(P1--);
            if (c == ' ') {
                str.setCharAt(P2--, '0');
                str.setCharAt(P2--, '2');
                str.setCharAt(P2--, '%');
            } else {
                str.setCharAt(P2--, c);
            }
        }
        return str.toString();
    }


    public static void main(String[] args) {
//        FangGeShu.print(1000);
//        FangGeShu.print2(1000);
        StringBuffer sb = new StringBuffer();
        sb.append("A  B");
        System.out.println(FangGeShu.replaceSpace(sb));
    }
}
