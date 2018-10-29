/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap08_2;

/**
 *
 * @author Admin
 */
public class Arithmetic {
    public void error(int a,int b)throws ArithmeticException{
        System.out.println(a/b);
    }
    public static void main(String[] args) {
      
        try{
            new Arithmetic().error(5,0);
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
