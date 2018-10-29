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
abstract class BinaryExpression extends Expression{
    abstract public int evaluate();
    abstract public Expression left();
    abstract public Expression right();
}
