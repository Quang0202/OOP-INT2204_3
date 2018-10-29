/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap08_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class filenotfound {

    /**
     * @param args the command line arguments
     */
  public void readFile(String str)throws FileNotFoundException{
      File file =new File(str);
      Scanner sc= new Scanner(file);
      while(sc.hasNext())
          System.out.println(sc.nextLine());
      sc.close();
  }
    public static void main(String[] args) {
        // TODO code application logic here
          try {
            new filenotfound().readFile("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    
}
