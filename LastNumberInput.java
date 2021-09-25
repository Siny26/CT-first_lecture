/* 1 задание. Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.*/
import java.util.Scanner;
public class LastNumberInput {
    public static void main(String[] args) {
        System.out.println("Последняя цифра введенного числа =  " + lastNumberInput());
    }

    static int lastNumberInput() {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        int last=0;
// Остаток от деления на 10
            last=number%10;

       return last;

    }
}