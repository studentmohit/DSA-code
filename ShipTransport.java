import java.util.Scanner;

public class ShipTransport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();  
        int N = sc.nextInt();  

        int rounds = (N == 0) ? 0 : (N + C - 1) / C;

        System.out.println("Number of rounds required: " + rounds);
    }
}