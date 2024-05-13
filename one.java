import java.util.Scanner;       //question no.1
public class one {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter the number to search for: ");
        int searchNumber = input.nextInt();

        int count = 0;
        for (int number : numbers) {
            if (number == searchNumber) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(searchNumber + " appears " + count + " time(s) in the array.");
        } else {
            System.out.println(searchNumber + " is not present in the array.");
        }

        input.close();
    }
}


