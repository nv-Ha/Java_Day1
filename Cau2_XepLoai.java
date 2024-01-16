import java.util.Locale;
import java.util.Scanner;

/**
 * Cau2_XepLoai
 */
public class Cau2_XepLoai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Nhap diem cua sinh vien: ");
        float number = input.nextFloat();
        if(number > 8){
            System.out.println("Xep loai: Gioi !");
        }
        else if(6.5 < number && number < 8){
            System.out.println("Xep loai: Kha !");
        }
        else if(5 < number && number < 6.5){
            System.out.println("Xep loai: Tr8ung binh !");
        }
        else{
            System.out.println("Xep loai: Yeu !");
        }
    }
}
