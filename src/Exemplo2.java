public class Exemplo2 {
    public static void main(String[] args) {
        for(int i =0; i<100;i++){
            System.out.print(i+" ");
        }
        System.out.println("\n--------------------------");
        for(int i = 100;i>=0;i--){
            System.out.print(i+" ");
        }
        System.out.println("\n--------------------------");
        for (int i = 0; i < 20; i+=3) {
            System.out.print(i+" ");
        }
        System.out.println("\n--------------------------");
        int ac = 0;
        for (int i = 0; i <= 10; i++) {
            ac = ac+i;
        }
        System.out.println("Total: "+ac);
    }
}
