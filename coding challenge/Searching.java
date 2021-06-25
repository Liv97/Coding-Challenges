import java.util.*;

class searchAndSum {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Random random = new Random();
        int[] array = new int[10];

        int firstRandomNumber = rand.nextInt(100) + 1;
        int secRandomnumber = random.nextInt(100) + 1;

        int sum = firstRandomNumber + secRandomnumber;
        // Advanced for loop
        for (int num : array) {
            sum = sum + num;
        }
        // System.out.println("Sum of array elements is:" + sum);
        System.out.println(firstRandomNumber + " + " + secRandomnumber + " sum is: " + sum);

    }
}