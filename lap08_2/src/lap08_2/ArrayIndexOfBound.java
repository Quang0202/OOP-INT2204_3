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
public class ArrayIndexOfBound {
    public void error(int[] arr, int pos) throws ArrayIndexOutOfBoundsException{
        System.out.println(arr[pos]);
    }
    public static void main(String[] args){
        int[] arr = new int[10];
        try {
            new ArrayIndexOfBound().error(arr, 100);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
