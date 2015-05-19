/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Hj. Elis Yulifah
 */
public class OrderLineItem implements ISale {
    int Number, Quantity, x, y;
   
    public OrderLineItem(int newNumber,int newQty){
        Number = newNumber;
        Quantity = newQty;
    }
    @Override
    public void total() {
        
        x=Quantity*10000;
        System.out.println("Total = " +x);
    }

    @Override
    public void tax() {
        y=(x*10)/100;
        System.out.println("Tax = " +y);
    }

    @Override
    public int getQuantity() {
        return Quantity;
    }

    @Override
    public void setQuantity(int qty) {
        Quantity = qty;
    }

    @Override
    public int getNumber() {
        return Number;
    }

    @Override
    public void setNumber(int number) {
        Number = number;
    }

    @Override
    public void Opname() {
        System.out.println("OP Name : Fikry");
    }
    
    public void isFilled(){
        System.out.println("Ini method isFilled OrderLineItem");
    }
    
}
