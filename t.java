import java.util.Arrays;    // Question no.4

public class t {
    public static void main(String[] args) {
        char[] characters = {'c', 'i', 'i', 'a', 's'};
        int n = characters.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (characters[j] > characters[j + 1]) {
                    char temp = characters[j];
                    characters[j] = characters[j + 1];
                    characters[j + 1] =  temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted array: " + Arrays.toString(characters));
    }
}
