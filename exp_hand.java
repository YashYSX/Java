public class exp_hand {
    public static void main(String[] args){
        int a[]= new int[5];
        try {
        System.out.println(a[6]);
        } catch(Exception e){
            System.out.println("error");
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("hello");
    }
}
