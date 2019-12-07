package Grade;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS A43S
 */
public class Grade4 {
      public static void main(String[] args){
           String names[] = {"Beah" , "Bianca", "Lance", "Belle","Nico", "Yza", "Gem", "Ethan"};
           int count = 0;
           for( int i=0; i<names.length; i++ ){
               if( !names[i].equals("Beah")){
                   continue;  //skip next statement
               }
               
               count++;
           }
           
           
             System.out.println("There are" + count + " Beah in the list");
           
      }
}
