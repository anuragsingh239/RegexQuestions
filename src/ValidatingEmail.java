// Write a program to check whether the given mail id is valid or not
import java.util.Scanner;

public class ValidatingEmail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Email:  ");
        String phone=sc.next();
        String regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        boolean result=phone.matches(regex);
        if(result){
            System.out.println("Given Email is valid ");
        }
        else{
            System.out.println("Given Email is not valid");
        }
    }
}
