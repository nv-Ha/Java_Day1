public class Cau2_SoNguyenTo {
    public static void main(String[] args) {
        int Max = 20;
        int SLSoNguyenToTimThay = 0;
        System.out.println(Max + " so nguyen to dau tien la: ");        
        System.out.println("----------------------");
        for(int i =2; SLSoNguyenToTimThay <= Max; i++){
            if(CheckSoNguyenTo(i)){
                System.out.println(i);
                SLSoNguyenToTimThay++;
            }
        }
    }
    public static boolean CheckSoNguyenTo(int n){
        if(n <= 2){
            return false;
        }
        for(int i = 2; i < n - 1; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
