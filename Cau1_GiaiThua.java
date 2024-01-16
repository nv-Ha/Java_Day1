import java.util.Scanner;

public class Cau1_GiaiThua {
    public static void main(String[] args) {
        int result = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so:");
        int number = input.nextInt();
        for(int i = 1; i <= number; i++){
            result *= i;
        }
        System.out.println("Giai thua cua so " + number + " la: " + result);
    }
}
