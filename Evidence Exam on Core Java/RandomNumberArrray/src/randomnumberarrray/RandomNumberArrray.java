package randomnumberarrray;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberArrray {

    public static void main(String[] args) {
        int[] randomArray = random(10);
        System.out.println("Random Array: " + Arrays.toString(randomArray));
    }

    public static int[] random(int length) {
        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }

}
