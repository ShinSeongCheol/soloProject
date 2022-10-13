package chap08;

public class p03 {
    static long[] d = new long[100];

    private static long fibo(int x) {

        System.out.print("f(" + Integer.toString(x) + ") ");

        if(x==1 || x == 2) {
            return 1;
        }

        if(d[x] != 0)
            return d[x];

        d[x] = fibo(x-1) + fibo(x-2);
        return d[x];
    }

    public static void main(String[] args) {
        fibo(6);
    }
}
