//Write a program to check whether the given no is a valid mobile number or not? The mobile no is entered by the command line argument
import java.util.Scanner;
import java.util.regex.*;
public class MobileNumberValidation
{
    public static boolean isValidMobileNo(String str)
    {
        Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher match = ptrn.matcher(str);
        return (match.find() && match.group().equals(str));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mobile number : ");
        String str = sc.next();
        if (isValidMobileNo(str))
            System.out.println("It is a valid mobile number.");
        else
            System.out.println("Entered mobile number is invalid.");
    }
}