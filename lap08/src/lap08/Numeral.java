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
 class Numeral extends Expression{
    private int valuel;

    public int getValuel() {
        return valuel;
    }

    public void setValuel(int valuel) {
        this.valuel = valuel;
    }
    public Numeral(int valuel)
    {
        this.valuel=valuel;
    }
    public Numeral(){
        
    }
    public String toString() {
         return Integer.toString(valuel);
    }

    @Override
    public int evaluate() {
         return valuel;
    }
    
    
}
