import java.util.Scanner;

public class Pjestimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Vendosni numrin e pare: ");
        int numri1 = input.nextInt();

        System.out.print("Vendosni numrin e dyte: ");
        int numri2 = input.nextInt();

        input.close();

        if (numri2 != 0) {
            int pjestimi = numri1 / numri2;
            int mbetja = numri1 % numri2;

            System.out.println("Pjestimi i numrave eshte: " + pjestimi);
            System.out.println("Mbetja nga pjestimi eshte: " + mbetja);
        } else {
            System.out.println("Gabim: Nuk mund te pjestohet me zero!");
        }
    }
}
