import java.util.*;

//create generate random number class
class generateRandomNumber {
    // main method
    public static void main(String[] args) {

        // get the random method
        Random rand = new Random();
        // int random = rand.nextInt();
        // create an array
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            // storing random integers in an array
            arr[i] = rand.nextInt();
            // printing each array element
            System.out.println(arr[i]);
        }
    }
}
