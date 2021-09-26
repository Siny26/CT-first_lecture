/*8.Дан массив целых чисел: [1,-10,5,6,45,23, 45,-34,0,32,56,-1,2,-2]. Для данного массива найти и вывести на экран:
        максимальное значение, сумму положительных элементов, сумму четных отрицательных элементов,
        количество положительных элементов, среднее арифметическое отрицательных элементов.*/

public class hArrayCalc {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, -10, 5, 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2};
        int max_number = 0;
        int sum_pos = 0;
        int kol_pos=0;
        double sum_neg = 0;
        int kol_neg = 0;
        double aver=0;
        int sum_neg_even=0;
        for (int i = 0; i < intArray.length; i++) {
         // Нахождение максимального значения
            if (intArray[i] > max_number) {
                max_number = intArray[i];

            }
             //Нахождение суммы и количества положительных чисел
                if(intArray[i]>=0){
                    sum_pos+=intArray[i];
                    kol_pos+=1;
                }
                //Нахождение суммы отрицательных чисел, кол-во отрицательных чисел, среднее арифметическое отр. чисел
            if(intArray[i]<0){
                sum_neg+=intArray[i];
                kol_neg+=1;

            }
            aver= sum_neg/kol_neg;
            //Нахождение суммы четных отрицательных чисел
            if(intArray[i]<0&&intArray[i]%2==0){
                sum_neg_even+=intArray[i];

            }
            }
        System.out.println("Максимальное значение массива "+ max_number );
        System.out.println(" Сумма положительных элементов "+ sum_pos);
        System.out.println(" Сумма четных отрицательных элементов "+ sum_neg_even);
        System.out.println(" Количество  положительных элементов "+ kol_pos);
        System.out.println(" Среднее арифметическое отрицательных элементов"+ aver);

        }

    }



