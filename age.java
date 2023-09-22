import java.util.Scanner;

public class age {
    public static void main(String[] args){
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("you can vote");            
        }
        else{
            System.out.println("you can not vote");
        }
    }
    
}
