//5. Ввести три целых числа с консоли. Вывести на экран наименьшее из них.
import java.util.Scanner;
import java.lang.Math;
public class eMinNumber {
    public static void main(String[] args) {
        System.out.println("Наименьшее число из введенных =  " + minNumber());
    }

    static int minNumber() {
        // Вводим первое число
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int number_one = in.nextInt();
        // Вводим второе число
        System.out.print("Введите второе целое число: ");
        int number_two = in.nextInt();
        //Вводим третье число
        System.out.print("Введите третье целое число: ");
        int number_three = in.nextInt();
        // Поиск наименьшего числа
int N=Math.min(number_one,number_two);
int minN=Math.min(N,number_three);
return minN;
    }
}
