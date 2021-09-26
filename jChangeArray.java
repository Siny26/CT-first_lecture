/*10 Дан массив целых чисел: [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,52]. Переместить нули в конец массива.
 Вывести результат в консоль.*/
import java.util.ArrayList;
public class jChangeArray {
    public static void main(String[] args) {
        int[] intArray = new int[]{15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52};
        int kol = 0;
        ArrayList<Integer> list = new ArrayList();
        System.out.println("Массив с нулями в конце");
        for (int i = 0; i <= intArray.length - 1; i++) {
            if (intArray[i] != 0) {
                // Добавим в новый список значения массива
                list.add(intArray[i]);

            } else {
                kol += 1;
            }
        }
            for(int n = 0;n<kol;n++)
                // Добавим в конце нули
                list.add(0);
        System.out.println(list);

    }
}

