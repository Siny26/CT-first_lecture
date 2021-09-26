/*9,Дан массив целых чисел: [15,10,51, 6, 5,3, 10,-34,0,32,56, 12,24, 52]. Переставить элементы массива в обратном порядке.
 Вывести результат в консоль.
 */

import java.util.ArrayList;

public class iReverseArray {
    public static void main(String[] args) {
        int[] intArray = new int[]{15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, 24, 52};
        ArrayList<Integer> list = new ArrayList();
        System.out.println("Элементы массива в обратном порядке");
        for (int i = intArray.length - 1; i >= 0; i--) {
            // создадим новый список в обратном порядке
            list.add(intArray[i]);
        }
        System.out.println(list);
    }
}