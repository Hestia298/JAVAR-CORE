public class AritthmeticOperatorDemo {

    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        // +, -, * , / , %(lấy dư)
        int c = 100214 % 1000;

        System.out.println("c = " + c);

        a = a + 10;
        System.out.println("a = " + a);

        // int d = b;
        // b = b + 1;
        b++; // 11
        int d = b + 1;
        System.out.println("d = " + b);

        // b = b + 1;
        // int e = b;
        int e = ++b;
        System.out.println("e = " + e);






    }
}
