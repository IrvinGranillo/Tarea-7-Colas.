
package colas;
public class principal {
    public static void main(String[] args) {
      Colas fila= new Colas<>();
        fila.enqueue(5);
        fila.enqueue(4);
        fila.enqueue(8);
        fila.enqueue(9);
        fila.enqueue(10);
        fila.enqueue(99);
        fila.enqueue(58);
        fila.enqueue(555);
        System.out.println(fila);
        System.out.println("////////////"+fila.dequeue());
        System.out.println("////////////"+fila.dequeue());
        System.out.println("////////////"+fila.dequeue());
        System.out.println(fila);
    }
    
}
