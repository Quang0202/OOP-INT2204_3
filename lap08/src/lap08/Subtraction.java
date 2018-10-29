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
class Subtraction extends BinaryExpression {
    Expression left;
    Expression right;

    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public int evaluate() {
        return (left.evaluate() - right.evaluate());
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public String toString() {
       return (left.toString()+"-"+right.toString());
    }
    
}
