package practicalistasenlazadas;

public class Nodo {
    public int value;
    public  Nodo next;
    
    public Nodo(int value){
        this.value = value;
    }
    public Nodo getNext() {
        return next;
    }
    public void setNext(Nodo next) {
        this.next = next;
    }  
}
