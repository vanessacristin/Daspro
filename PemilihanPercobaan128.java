import java.util.Scanner;
public class PemilihanPercobaan128 {
    public static void main(String [] args) {
        Scanner input28 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input28.nextInt();
        String hasil;
        hasil = (angka % 2 == 0 ) ? "Bilangan genap" : "Bilangan ganjil";
        System.out.println(angka + " adalah " + hasil);

        
    }
}