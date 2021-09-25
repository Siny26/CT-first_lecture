/*7.Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора в зависимости от кода города.
        (Москва(905) - 4.15 руб. Ростов(194) - 1.98 руб. Краснодар(491) - 2.69 руб. Киров(800) - 5.00руб.).
        Пользователь в консоли должен ввести код города, а в ответ от программы получить,
        например, при вводе кода 905, - «Москва. Стоимость разговора: 41.5»*/
import java.util.Scanner;
public class CostOfConversation {
    public static void main(String[] args) {

        // Вводим код города
        Scanner in = new Scanner(System.in);
        System.out.print("Введите код города: ");
        int kod = in.nextInt();
         double cost=0;
         String town = new String();

         // В зависимости от кода города, выбирается стоимость и название города.
        if (kod ==905 ) {
            town = "Москва";
        cost=4.15;

        } else if (kod ==194 ) {
            cost=1.98;
            town = "Ростов";
        }
        else if (kod ==491 ) {
            cost=2.69;
            town = "Краснодар";
        }

        else if (kod ==800 ) {
            cost=5.00;
            town = "Киров";
        }

        System.out.println("Город  " + town + ". Стоимость разговора " + cost);

    }

}
