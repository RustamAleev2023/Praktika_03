import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
//        task4();
        task5();
    }

    //Task1
    public static void task1(){
        System.out.println("Fall seven times \nand \nstand up eight.");
    }

    //Task2
    public static void task2(){
        System.out.println("\"Your time is limited, \n\tso don’t waste it \n\t\tliving someone else’s life\"\n\t\t\tSteve Jobs.");
    }

    //Task3
    public static void task3(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int n1 = scanner.nextInt();

        System.out.println("Введите второе число");
        int n2 = scanner.nextInt();

        System.out.println("Сумма чисел: " + (n1 + n2));
        System.out.println("Разница чисел: " + (n1 - n2));
        System.out.println("Произведение чисел: " + (n1 * n2));
    }

    //Task4
    public static void task4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();

        System.out.println("Введите процент");
        int percent = scanner.nextInt();

        System.out.println(percent + " процентов от " + num + ". Результат: " + (int) (num * 0.01 * percent) + ".");
    }

    //Task5
    public static void task5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину стороны квадрата");

        int length = scanner.nextInt();

        System.out.println("Площадь квадрата со стороной " + length + " равна " + length * length);
    }
}