public class ArithmeticFunctions {
    public int power(int a, int b) {
        MyArithmeticLibrary myArithmeticLibrary = new MyArithmeticLibrary();
        if (b == 0)
            return 1;
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = myArithmeticLibrary.multiply(result, a);

        }
        return result;

    }

    public int divide(int a, int b) {
        MyArithmeticLibrary myArithmeticLibrary = new MyArithmeticLibrary();
        int temp = 1;
        int result = 0;
        if(b==0)
            System.out.println ("Can't divide a number by 0");
        while (b <= a) {
            b <<= 1;
            temp <<= 1;
        }
        while (temp > 1) {
            b >>= 1;
            temp >>= 1;
            if (a >= b) {
                a = myArithmeticLibrary.subtract(a, b);
                result = myArithmeticLibrary.sum(result, temp);
            }
        }
        return result;
    }

    public int factorial(int a) {
        MyArithmeticLibrary myArithmeticLibrary = new MyArithmeticLibrary();
        return (a == 1 || a == 0) ? 1 : a * factorial(a - 1);

    }
}
