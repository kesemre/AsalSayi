import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        System.out.println("Bu app girdiğiniz sayıya kadar olan asal sayıları bulur");
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Sayı giriniz: ");
        num = input.nextInt();
        for (int i = 2; i < num; i++) {
            boolean asal = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }

            }
            if (asal) {
                System.out.println(i + " Asal Sayıdır");

            }
        }
    }
}