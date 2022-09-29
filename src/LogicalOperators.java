import java.sql.SQLOutput;
import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
//square();
reverseString();
    }

    public static void changeNumbers() {
        int a, fist, two, five, six, osn;
        System.out.print("Введите 6-значное число -> ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        if (a % 1000000 == a) {
            six = a % 10;
            five = (a % 100) / 10;
            fist = (a % 1000000) / 100000;
            two = (a % 100000) / 10000;
            osn = (a % 10000) / 100;
            System.out.println("Исходное число: " + six + five + osn + two + fist);
        } else System.out.println("Введено не 6-значное число!");
    }

    public static void showNumbers() {
        System.out.print("Введите 2 числa -> ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }
    }

    public static void showNumbers2() {
        System.out.print("Введите 2 числa -> "); // показать все нечетные числа
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void factorial() {
        System.out.print("Введите положительное число -> "); // найти факториал
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int res = 1;
        for (int i = 1; i <= x; i++) {
            res *= i;
        }
        System.out.println(res);
    }

    public static void stars() {
        System.out.print("Введите число (длина линии)--> ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i <= x; i++) {
            System.out.print( "*");

        }
    }

    public static void months() {
        System.out.print("Введите номер месяца--> ");
        Scanner scanner = new Scanner(System.in);
        int numberMonth = scanner.nextInt();
        if (numberMonth == 12 || numberMonth == 1 || numberMonth == 2) {
            System.out.println("Winter");
        } else if (numberMonth == 3 || numberMonth == 4 || numberMonth == 5) {
            System.out.println("Spring");
        } else if (numberMonth == 6 || numberMonth == 6 || numberMonth == 8) {
            System.out.println("Summer");
        } else if (numberMonth == 9 || numberMonth == 10 || numberMonth == 11) {
            System.out.println("Autumn");
        }
        else {
            System.out.println("Ошибка");
        }
    }
    public static void square() {
        System.out.print("Введите цифру размер стороны квадрата--> ");
        Scanner scanner = new Scanner(System.in);
        int sideSquare = scanner.nextInt();
          for (int j = 0; j<sideSquare;j++){
           for (int i = 0; i<sideSquare; i++) {
               System.out.print("*");
           }
              System.out.println();
        }
    }

    public static void reverseString() {
        System.out.println("Enter string");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] array = s.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        System.out.println(result);
    }
}