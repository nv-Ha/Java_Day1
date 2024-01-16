import java.util.Locale;
import java.util.Scanner;

/**
 * Cau3_Nhap1So
 */
public class Cau3_Nhap1So {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Nhap so:");
        float number = input.nextFloat();
        if(number > 0 ){
            System.out.println("Positive");
        }
        else if(number == 0){
            System.out.println("0");
        }
        else{
            System.out.println("Negative");
        }
    }
}