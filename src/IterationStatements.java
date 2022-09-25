public class IterationStatements {
   //Zuyg Tver
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println("Even numbers are:" + i);
        }

//how to exclude 0?
        for (int i1 = 0; i1 <= 100; i1++) {
            if (i1 % 2 != 0) {
                System.out.println("Kent tvern en" + i1);
            }
        }
        for (int i2 = 0; i2 < 100; i2++) {
            if (i2 % 3 == 0) {
                System.out.println("3in bajanvox tvern en" + i2);
            }
        }
        int sum = 0;
        for (int i3 = 0; i3 <= 100; i3++) {
            sum += i3;
        }
        System.out.println("Sum is" + sum);

//    Why 0?
        Long result = 1L;
        for (int i = 1; i <= 100; i++) {
            result = (result * i);
        }
        System.out.println(result);

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("%");
            }
            System.out.println();
        }

        for (int k = 1; k < 10; k++) {
            for (int j = 1; j <= k; j++) {
                System.out.print("-");
            }
            System.out.println();
        }

//??????
        for (int f = 1; f < 7; f ++) {
            for (int j = 7; j >= f; j--) {
                System.out.print(" ");
            }
            for (int c = f; c > 0; c--) {
                System.out.print(" " + c);
            }
            System.out.println(" ");
        }

            for (int m = 0; m < 4; m++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(" # ");
                }
                System.out.println();
            }


    }
}