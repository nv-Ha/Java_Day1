/**
 * Cau3_Fibonacci
 */
public class Cau3_Fibonacci {

    public static void main(String[] args) {
        int Max = 20;
        System.out.println(Max + " so dau cua day so fibonacci la:");        
        System.out.println("----------------------------");
        int a = 1   ;
        int b = 1;
        for(int i = 0; i < Max; i++){
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}