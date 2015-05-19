/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Hj. Elis Yulifah
 */
public class main {
    public static void main (String[] args){
        OrderLineItem oli = new OrderLineItem(1,5);
        oli.Opname();
        System.out.println("Number : " +oli.getNumber());
        System.out.println("Quantity : " +oli.getQuantity());
        
        oli.total();
        oli.tax();
        oli.isFilled();
    }
}
