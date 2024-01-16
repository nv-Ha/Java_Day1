public class Cau5_InCacSo1Den100 {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println("Hello");
            }
            if(i % 5 == 0){
                System.out.println("World");
            }
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("HelloWorld");
            }
            if(i % 3 != 0 && i % 5 != 0){
                System.out.println(i);
            }
        }
    }
}
