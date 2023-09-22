import java.util.Scanner;

public class sc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        char grade = sc.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("very Good");
                break;
            case 'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("Improve yoyr self");
                break;
            default:
                System.err.println("Invalid Input");
                break;
        }
    }
}
