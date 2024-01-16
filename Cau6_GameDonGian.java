import java.util.Random;
import java.util.Scanner;

public class Cau6_GameDonGian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Vui long nhap trong khoang cach 1 - 20:");
        System.out.println("Nhap so thu nhat: ");
        int number1 = scanner.nextInt();
        System.out.println("Nhap so thu hai: ");
        int number2 = scanner.nextInt();

        int SoRandom = random.nextInt((number2 - number1)/1 + 1) + number1;
        System.out.println("Mot so ngau nhien da du chon ! Hay thu van may cua ban.");
        for(int i = 0; i < 3; i++){
            System.out.println("Nhap so ban chon:");
            int SoDuDoan = scanner.nextInt();
            if (SoDuDoan < SoRandom) {
                System.out.println("Tang len");
            } else if (SoDuDoan > SoRandom) {
                System.out.println("Giam xuong");
            } else {
                System.out.println("Ban da thang!");
                scanner.close();
                return;
            }
        }
        System.out.println("Ban da thua! So dung la " + SoRandom);
        scanner.close();
    }
}
