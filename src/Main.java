//Task1
////////////////////////////////////////////////////////////////////////////////////
public class Main {
    public static void main(String[] args) {
        System.out.println("Orange\nBanana\nApple");
    }
}
//Task2
////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
//Task3
////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}
//Task4
////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
//Task5
////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        boolean t = c >= 10 && c <= 20;
        System.out.println(t);
    }
}
//Task6
////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");

        }
    }
}
//Task7
////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean t = a >= 0;
        System.out.println(!t);
    }
}
//Task8
////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = "Эх, раз, да еще раз...\n".repeat(a);
        System.out.println(str);
    }
}
//Task9
////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a % 4 == 0 && a % 100 != 0 || (a % 400 == 0) ? "Yes" : "No");
    }
}
//Task10
////////////////////////////////////////////////////////////////////////////////////
public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 0, 1, 0, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                numbers[i] = 0;
            } else {
                numbers[i] = 1;
            }
            System.out.println(numbers[i]);
        }
    }
}
//Task11
////////////////////////////////////////////////////////////////////////////////////
public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }
    }
}
//Task12
////////////////////////////////////////////////////////////////////////////////////
public class Main {
    public static void main(String[] args) {

            int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9};
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < 6) {
                    int a = numbers[i] * 2;
                    System.out.println(a);
                }
            }
        }
    }
//Task13
////////////////////////////////////////////////////////////////////////////////////
public class Main {
    public static void main(String[] args) {

        int[][] matrix = {{1, 5, 3},
                          {2, 11, 4},
                          {5, 2, 4}};
        for (int i = 0; i < 3; i++) {
            matrix[i][i] = 1;
            matrix[i][2 - i] = 1;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                          }
            System.out.println();
        }
    }
}
//Task14
////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int initialValue = sc.nextInt();
        int[] array = createArray(len, initialValue);
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
        static int[] createArray ( int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}







        
