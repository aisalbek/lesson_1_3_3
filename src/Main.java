import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[15];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(-20, 20);
        }
        System.out.println(Arrays.toString(myArray));
        int schetchik = 1;
        int schetchik2 = 0;
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                schetchik = i;
                break;
            }
        }
        System.out.println("индекс первого отрицательного числа : " + schetchik);
        for (int i = schetchik; i < myArray.length; i++) {
            if (myArray[i] >= 1) {
                sum += myArray[i];
                schetchik2++;
            }
        }
        System.out.println(sum + "/" + schetchik2 + "=" + sum / schetchik2);
        System.out.println("---------------------доп дз-----------------------");
        sort(myArray);
        System.out.println(Arrays.toString(myArray));

    }

    public static void sort(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }
}