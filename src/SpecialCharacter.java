//Write a program in java to check string contains special characters in java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharacter {
    public static void main(String[] args) {
        String s1="Anuragisaboy";
        Pattern p=Pattern.compile("[^a-z0-9]",Pattern.CASE_INSENSITIVE);
        Matcher m= p.matcher(s1);
        boolean res= m.find();
        if(res)
            System.out.println("String1 contains special characters ");
        else
            System.out.println("no special characters ");
        String s2="!!Anurag.is.a.good.boy ##";
        Matcher m2= p.matcher(s2);
        boolean res2= m2.find();
        if(res2)
            System.out.println("String2 contains special characters ");
        else
            System.out.println("String2 not contain special characters ");

    }
}
