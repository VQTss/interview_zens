import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MiniMaxSum {

    public static void MinMax_FiveInteger(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int index = 0;

        while (index < arr.size()) {
            int sum = 0;
            for (int k = 0; k < arr.size(); k++) {
                if (k != index) {
                    sum += arr.get(k);
                }
            }
            if (sum >= max) {
                max = sum;
            }
            if (sum <= min) {
                min = sum;
            }

            index++;
        }
        System.out.println(min + " " + max);
    }

    public static int sumOfArray(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    public static int findMin(ArrayList<Integer> arr) {
        return Collections.min(arr);
    }

    public static int findMax(ArrayList<Integer> arr) {
        return Collections.max(arr);
    }

    public static ArrayList<Integer> findEvenNumber(ArrayList<Integer> arr) {
        ArrayList<Integer> arrEvenNumber = new ArrayList<>();
        for (int integer : arr) {
            if (integer % 2 == 0) {
                arrEvenNumber.add(integer);

            }
        }
        return arrEvenNumber;
    }

    public static ArrayList<Integer> findOldNumber(ArrayList<Integer> arr) {
        ArrayList<Integer> arrOldNumber = new ArrayList<>();
        for (Integer integer : arr) {
            if (integer % 2 == 1) {
                arrOldNumber.add(integer);
            }
        }
        return arrOldNumber;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter five number: ");
        int id = 1;
        do {
            System.out.printf("%d: ", id);
            try {
                int store = sc.nextInt();
                arr.add(store);
                id++;
            } catch (Exception e) {
                System.out.println("The input must be a integer number");
                sc.nextLine();
            }
        } while (id < 6);
        MinMax_FiveInteger(arr);
        System.out.println("Sum of Array: " + sumOfArray(arr));
        System.out.println("Find min of array: " + findMin(arr));
        System.out.println("Find max of array: " + findMax(arr));
        System.out.println("Find number even: " + findEvenNumber(arr).toString());
        System.out.println("Find number old: " + findOldNumber(arr).toString());
    }
}
