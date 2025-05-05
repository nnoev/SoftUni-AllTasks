package basics.nestedLoops.lab;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i<=10;i++){
            for (int b = 1; b<=10;b++){
                System.out.printf("%d * %d = %d%n",i,b,i*b);
            }
        }

    }
}
