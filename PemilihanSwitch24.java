import java.util.Scanner;

public class PemilihanSwitch24 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("Masukkan angka 1: ");
        angka1 = sc.nextDouble();
        System.out.println("Masukkan angka 2: ");
        angka2 = sc.nextDouble();
<<<<<<< HEAD
        System.out.print("Masukkan operator: ");
=======
        System.out.print("Masukkan operator (+ - * :)");
>>>>>>> 81e0a535d2909afff0c7384060c3bbffc76e9cb1
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
<<<<<<< HEAD
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagi tidak boleh nol.");
                }
                break;
        default:
            System.out.println("Error: Operator yang dipilih tidak sesuai. Silahkan gunakan +, -, *, atau :,");
        }

            System.out.println(angka1 + operator + angka2 + " = " + hasil);
=======
                hasil = angka1 / angka2;
                break;
        }

        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
>>>>>>> 81e0a535d2909afff0c7384060c3bbffc76e9cb1
    }
}