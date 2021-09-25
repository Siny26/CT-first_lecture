//2. Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа.
import java.util.Scanner;

public class SumofTreeDigit {
    public static void main(String[] args) {
        System.out.println("Сумма цифр введенного числа =  " + sumofTreeDigit());
    }

    static int sumofTreeDigit() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = in.nextInt();
        int sum=0;
        // Нахождение суммы числа
        do  {
            sum+=number%10;
            number/=10;
        } while (number!=0);
        return sum;

       }

    }
