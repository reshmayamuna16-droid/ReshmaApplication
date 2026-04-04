import java.util.Scanner;

public class LoginSystem {

    public boolean login(){

        Scanner sc=new Scanner(System.in);

        System.out.println("Username:");
        String user=sc.nextLine();

        System.out.println("Password:");
        String pass=sc.nextLine();

        return user.equals("admin") && pass.equals("1234");
    }
}