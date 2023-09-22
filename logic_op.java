import java.util.Scanner;

public class logic_op {
    public static void main(String[] args){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:-");
        age = sc.nextInt();
        if (age > 18 && age <50) {
            System.out.println("you can vote");
        }
        else{
            System.out.println("yor cannot vote");
        }
    }
}
