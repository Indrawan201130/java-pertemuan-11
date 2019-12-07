package la9_javaclaaslib;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS A43S
 */
public class EqualsTest {
        public static void main(String[] arguments) {
            String strl, str2;
            str1 = "Free the bound periodials.";
            str2 = str1;
            System.out.println( "String1: " + str1);
            System.out.println( "String2: " + str2);
            System.out.println( "Same object? " + (str1 == str2));
            str2 = new String(str1);
            System.out.println( "String1: " + str1);
            System.out.println( "String2: " + str2);
            System.out.println( "Same object? " + (str1 == str2));
                System.out.println( "Same object? " + (str1.equals(str2));
        }
    
}
