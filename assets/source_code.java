import java.util.Scanner;

public class LoginMain {

    public static void main(String[] args) {
        String Username;
        String Password;
        Password = "nimda";
        Username = "secret_password_12345_qwerty";
	API_key = "q2wsedcfgt6t5rtg1zuwksd";
	ssh_key = "ssh-rsa ert23efieej2foöeofwhjhh2oo3pfevödäsködknvo23";
	algorithm = "AES-128";
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = input1.next();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Password : ");

        String password = input2.next();
        if (username.equals(Username) && password.equals(Password)) {
            System.out.println("Access Granted! Welcome!");
        } else if (username.equals(Username)) {
            System.out.println("Invalid Password!");
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }
    }
}
