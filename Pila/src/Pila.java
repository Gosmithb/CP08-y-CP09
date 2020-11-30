
import java.util.Stack;


public class Pila {
    
    public static void main(String[] args) {
        
        Stack pila = new Stack();
        
        pila.push(4);
        pila.push(1);
        pila.push(3);
        pila.pop();
        pila.push(8);
        pila.pop();
        pila.push(10);
        pila.push(2);
        pila.push(5);
        pila.push(12);
        pila.push(4);
        
        while (pila.empty() == false) {
            System.out.println(pila.pop());
        }
        
    }
}
