/*3.Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1,
        в противном случае не изменять его. Вывести полученное число.*/
import java.util.Scanner;
public class cPosNegNumber {
    public static void main(String[] args) {
        System.out.println("Полученное число =  " + posNegNumber());
    }

    static int posNegNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = in.nextInt();
// Проверка является ли число положительным
        if (number>= 0)
        {
            number += 1;
        }
        return number;

    }

}
