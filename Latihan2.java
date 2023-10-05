import java.util.Scanner;
public class Latihan2 {
    public static void main(String [] args) {
        Scanner input28 = new Scanner(System.in);

        String username, password;

        System.out.print("Masukkan Username Anda: ");
        username = input28.nextLine();
        System.out.print("Masukkan Password Anda: ");
        password = input28.nextLine();

    if (username.equals("admin")    && password.equals("admin")) {
        System.out.println("Anda Berhasil Login");
    } else 
        System.out.println("Username atau Password Anda Salah");
    }
    
}
