import java.util.Scanner;

public class print_array {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element you want store");
        num = sc.nextInt();

        int[] array = new int[10];
        System.out.println("enter the element of the array:");
        for(int i=0;i<num;i++){
            array[i] = sc.nextInt();
           }
             System.out.println("array elements are:");
            for(int i=0;i<num;i++){
                System.out.println(array[i]);
        }
    }
}
