/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap08;

/**
 *
 * @author Admin
 */
public class ExpressionTest {
        public static void main(String[] args) {
        // TODO code application logic here
        //tao bieu thuc (10^2 - 1 + 2*3)^2
        System.out.println((10*10 - 1 + 2*3)*(10*10 - 1 + 2*3));
        System.out.println(new Square(new Addition(new Subtraction(new Square(new Numeral(10)), new Numeral(1)), new Multiplication(new Numeral(2), new Numeral(3)))).evaluate());
        System.out.println(new Square(new Addition(new Subtraction(new Square(new Numeral(10)), new Numeral(1)), new Multiplication(new Numeral(2), new Numeral(3)))));
        //phep chia cho 0
        try{
            System.out.println(new Division(new Numeral(10),new Numeral(0)).evaluate());
        }catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
