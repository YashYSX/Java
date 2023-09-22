import java.util.Scanner;

public class odd_even {
    public static void main(String[] args){
        int num;
        System.out.println("Enter the Number:-");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num%2==0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
