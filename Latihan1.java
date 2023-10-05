import java.util.Scanner;
public class Latihan1 {
    public static void main(String [] args) {
        Scanner input28 = new Scanner(System.in);
        int jarak;

        System.out.println("Masukkan jarak pertarungan: ");
        jarak =  input28.nextInt();

    if (jarak <= 5) {
        System.out.println("Gunakan Melee Weapon");
    } else {
        System.out.println("Gunakan Range Weapon");

    }
    }
}