//Daniel Ingo

public class writeSquares {
    public static void main(String[] args) {
    writeSquares(11);
    }
    public static void writeSquares(int n){
        if (n == 1) {
            System.out.print(" 1 ");
            return;
        }
        if ((n % 2) == 0) {
            System.out.print(" "+(n * n));
        }
        writeSquares(n - 1);
        if ((n % 2) != 0) {
            System.out.print((n * n)+" ");
        }

    }
}
