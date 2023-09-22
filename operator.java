import java.util.Scanner;

public class operator {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String name = sc.nextLine();
        

        System.out.println(name);
    }
}
