package practicalistasenlazadas;

public class Lista {
    private Nodo raiz;
    
    public Lista(){
        raiz = null;
    }
    
    public void clear(){
        Nodo recorrer = raiz;
        Nodo atras;
        while (recorrer != null){
            atras = recorrer;
            recorrer = recorrer.next;
            atras = null;
        }
        raiz = null;
    }
    
    public void show(){
        Nodo recorrer = raiz;
        if(recorrer == null){
            System.out.println("La lista está vacía");
        }
        while (recorrer != null){
            System.out.print("["+recorrer.value+"] ---> ");
            recorrer = recorrer.next;
        }
        System.out.println();
    }
    
    public boolean find(int value){
        boolean exists = false;
        Nodo recorrer = raiz;
        while (recorrer != null){
            if(recorrer.value == value){
                exists = true;
                return exists;
            }
            recorrer = recorrer.next;
        }
        return exists;
    }
    
    public void add(int value){
        Nodo nuevo = new Nodo(value);
        if(raiz == null){
            raiz = nuevo;
        }else{
            if(value < raiz.value){
                nuevo.next = raiz;
                raiz = nuevo;
            }else{
                Nodo recorrer = raiz;
                Nodo atras = raiz;
                while (value >= recorrer.value && recorrer.next != null){
                    atras = recorrer;
                    recorrer = recorrer.next;
                }
                if (value >= recorrer.value){
                    recorrer.next = nuevo;
                }else{
                    nuevo.next = recorrer;
                    atras.next = nuevo;
                }
            }
        }
    }
    
    public void delete(int value){
        Nodo recorrer = raiz;
        if (find(value)) {
            // Consulta si el nodo a eliminar es el pirmero
            if (raiz.value == value) {
                // El primer nodo apunta al siguiente.
                raiz = raiz.next;
            } else{
                // Crea ua copia de la lista.
                Nodo aux = raiz;
                // Recorre la lista hasta llegar al nodo anterior 
                // al de referencia.
                while(aux.getNext().value != value){
                    aux = aux.getNext();
                }
                // Guarda el nodo siguiente del nodo a eliminar.
                Nodo next = aux.getNext().getNext();
                // Enlaza el nodo anterior al de eliminar con el 
                // sguiente despues de el.
                aux.setNext(next);  
            }
            // Disminuye el contador de tamaño de la lista.
            System.out.println("Se ha eliminado correctamente el valor "+ value);
        }
        else
        {
            System.out.println("El valor introducido no existe en la lista");
        }
    }
    
    public void edit(int value_1, int value_2){
        if (find(value_1)) {
            delete(value_1);
            add(value_2);
            System.out.println("El valor "+value_1+" se ha editado correctamente a "+ value_2);
        }
        else
        {
            System.out.println("El valor introducido no existe en la lista");
        }
    }
    
    public void credits(){
        System.out.println("Estructuras de Datos\n19170025 - Alex Fernando Lozano Mendez\n19170042 - Jonathan Emanuel Luevano Velez\n"
                + "19170050 - Gustavo Adolfo Hernández Torres\n19170089 - Ariana Yamileth Esquivel Ruiz\n19170146 - Humberto Canales Martínez");
        System.out.println();
    }
}
