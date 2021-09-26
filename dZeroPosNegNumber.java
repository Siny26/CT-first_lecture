/*4. Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1; если отрицательным,
        то вычесть из него 2; если нулевым, то заменить его на 10. Вывести полученное число.*/

import java.util.Scanner;
public class dZeroPosNegNumber {
    public static void main(String[] args) {
        System.out.println("Полученное число =  " + posNegNumber());
    }

    static int posNegNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = in.nextInt();
// число положительное, +1
        if (number > 0) {
            number += 1;
            // число отрицательное, -2
        } else if (number < 0) {
            number -= 2;
            // число =0, заменить на 10
        } else if(number == 0) {
            number = 10;
        }
        return number;

    }
}
