import java.util.Scanner;

public class Uslovie {
    public static void main(String[] args) {

    //Условие:

    // Первое задание:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Пожалуйста, введите второе число:");
        int b = scanner.nextInt();
        int result;

        if (a>b) {
        System.out.println("Первое число больше второго, вычитаем из первого второе");
        result = a - b;
        } else if (b>a) {
        System.out.println("Второе число больше первого, вычитаем из второго первое");
        result = b - a;
        } else {
        System.out.println("Оба числа равны");
        result = 0;
        }

        System.out.println("Результат вычитания: ");
        System.out.println(result);

    //Улучшения:

    // Сумма/умножение:

        System.out.println("Пожалуйста, введите первое число:");
        int e = scanner.nextInt();
        System.out.println("Пожалуйста, введите второе число:");
        int f = scanner.nextInt();

        if (e < 0) {
            System.out.println("Я не хочу работать с отрицательными числами");

        } else if (f < 0) {
            System.out.println("Я не хочу работать с отрицательными числами");
        } else {
            System.out.println("Сумма чисел");
            System.out.println(e + f);
            System.out.println("Произведение чисел");
            System.out.println(e * f);

    //Вычитание:

            System.out.println("Пожалуйста, введите первое число:");
            int c = scanner.nextInt();
            System.out.println("Пожалуйста, введите второе число:");
            int d = scanner.nextInt();

            if (c > d) {
                System.out.println("Результат");
                result = c - d;

            } else if (d > c) {
                System.out.println("Результат");
                result = d - c;
            } else {
                System.out.println("Нет результата");
                result = 0;
            }

            System.out.println("Результат вычитания: ");
            System.out.println(result);

    //Деление:

            System.out.println("Пожалуйста, введите первое число:");
            int h = scanner.nextInt();
            System.out.println("Пожалуйста, введите второе число:");
            int i = scanner.nextInt();

            if (h > i) {
                System.out.println("Результат");
                result = h / i;

            } else if (i > h) {
                System.out.println("Результат");
                result = i / h;
            } else {
                System.out.println("Нет результата");
                result = 1;
            }

            System.out.println("Результат деления: ");
            System.out.println(result);
        }
    }
}
