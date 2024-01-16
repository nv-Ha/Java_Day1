import java.util.Scanner;

public class Cau4_LlaiKep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        System.out.println("Nhap so tien ban muon gui: ");    
        float Money = input.nextFloat(); 
        System.out.println("Ban muon gui trong bao lau ( thang ): ");     
        int Month = input.nextInt();
        System.out.println("Lai suat ban mong muon (%): ");    
        double LaiSuat = input.nextDouble() / 100;
        // --
        double SoDuCuoiKy = Money;
        for(int thang = 1; thang <= Month; thang++){
            double LaiSuatThang = Money*LaiSuat;
            SoDuCuoiKy = SoDuCuoiKy + LaiSuatThang;
            System.out.println("Thang " + thang + " nhan duoc " + SoDuCuoiKy);
        }
        System.out.println("So tien ban nhan duoc sau " + Month + " la " + SoDuCuoiKy);
    }
}
