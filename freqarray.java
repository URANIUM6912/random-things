import java.util.Scanner;

public class freqarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read array elements from user
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Precompute (Create a frequency array)
        // In Java, integer arrays are automatically initialized to 0.
        int[] hash = new int[13]; 
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        // Read the number of queries
        int q = sc.nextInt();

        // Process each query
        while (q > 0) {
            int number = sc.nextInt();
            
            // Fetch and print the frequency
            System.out.println(hash[number]);
            q--;
        }
        
        sc.close();
    }
}