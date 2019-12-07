/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package la9_javaclaaslib;

/**
 *
 * @author ASUS A43S
 */
public class TestPastByValue {

    public static void main(String[] args) {
      int i = 10;
      System.out.println(i);
      test(i);
      System.out.println(i);
    }
    public static void test(int j){
        j = 33;
    }
}
