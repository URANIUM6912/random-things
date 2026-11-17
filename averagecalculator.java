import java.util.*;
public class averagecalculator {
    public static void main(String[] args) {
        System.out.println("how many numbers you want to average");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
System.out.println("Enter each number");
for (int i = 0 ; i<n ; i++){
    int element = sc.nextInt();
    sum += element ;
}
int average = sum/n ;
System.out.println("your average is " + average);
    }
    
}
