package App;

public class Main2 {
     public static void main(String[] args) {
        Pila pila = new Pila();

        System.out.println("¿Está vacía? " + pila.estaVacia()); 

        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.print("Pila tras push 10, 20, 30: ");
        pila.imprimir();                                 

        System.out.println("peek():  " + pila.peek());     
        System.out.println("pop():   " + pila.pop());      
        System.out.print("Pila tras pop: ");
        pila.imprimir();                                 

        System.out.println("Tamaño: " + pila.tamaño());    
        System.out.println("pop():   " + pila.pop());      
        System.out.println("pop():   " + pila.pop());     
        System.out.println("¿Está vacía? " + pila.estaVacia()); 
    }
}
