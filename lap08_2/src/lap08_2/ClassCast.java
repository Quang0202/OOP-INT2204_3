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
public class ClassCast {
    public int convert(Object s) throws ClassCastException{
        return (int)s;
    }
    public static void main(String[] args) {
        ClassCast cc=new ClassCast();
        try{
            System.out.println(cc.convert("123"));
        }catch(ClassCastException e){
            System.out.println(e.getMessage());
        }
    }
}
