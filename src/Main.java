import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Теперь нажмите 1 чтобы получить сумму");
        System.out.println("либо 2 чтобы получить разность");
        int c = scanner.nextInt();
        if (c == 1){
            result = a + b;
            System.out.println("Сумма чисел = " + result );
        }
        if (c == 2){
            result = a - b;
            System.out.println("Разница чисел = " + result);
        }


    }
}
