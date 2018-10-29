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
public class NullPointer {
    String x;
    public void error()throws NullPointerException{
        System.out.println(x.length());
    }
    public static void main(String[] args) {
        try{
            new NullPointer().error();
        }catch(NullPointerException e)
        {
            System.out.println(e);
        }
    }
}
