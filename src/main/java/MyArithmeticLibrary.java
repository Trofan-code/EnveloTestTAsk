public class MyArithmeticLibrary {
    public int sum(int a, int b) {
        while (b != 0) {
            int temp = a & b;
            a = a ^ b;
            b = temp << 1;
        }
        return a;
    }

    public int subtract(int a, int b) {
        while (b != 0) {
            int temp = (~a) & b;
            a = a ^ b;
            b = temp << 1;
        }
        return a;
    }

    public int multiply(int a, int b) {
        int temp = 0;
        while (b > 0) {
            if ((b & 1) != 0)
                temp = temp + a;
            a = a << 1;
            b = b >> 1;
        }
        return temp;
    }
}
