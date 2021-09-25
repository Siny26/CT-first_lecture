/*6.Ввести целое число в консоли. Вывести его строку-описание вида «отрицательное четное число», «нулевое число»,
        «положительное нечетное число» и т. д.*/
import java.util.Scanner;
public class DescriptionOfNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = in.nextInt();
// число положительное  и четное
        if (number > 0 && number%2==0 ) {
            System.out.println("положительное четное");
            // число положительное  и нечетное
        } else if (number > 0 && number%2!=0 ) {
            System.out.println("положительное нечетное");
        }
        // число отрицательное  и четное
        else if (number < 0 && number%2!=0 ) {
            System.out.println("отрицательное нечетное");
        }
        // число отрицательное  и нечетное
        else if (number < 0 && number%2==0 ) {
            System.out.println("отрицательное четное");
            // число нулевое
        }else if(number == 0) {
            System.out.println("Нулевое");
        }

    }
}
