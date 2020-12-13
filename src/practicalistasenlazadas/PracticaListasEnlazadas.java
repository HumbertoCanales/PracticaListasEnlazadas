package practicalistasenlazadas;

import java.util.Scanner;

public class PracticaListasEnlazadas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        Lista list = new Lista();
        int val,val2;
        String next = "";
        
        System.out.println("Práctica de listas");
        do{
            System.out.println("Selecciona una opción\n1 - Inicializar\n2 - Mostrar\n3 - Buscar\n4 - Insertar\n"
                    + "5 - Eliminar\n6 - Modificar\n7 - Créditos\n8 - Salir");
            try {
               option = input.nextInt();
            } catch (Exception e) {
               option = 8;
            }
            switch (option){
                case 1:
                    list.clear();
                    System.out.println("Lista reiniciada");
                    msg();
                    next = input.next();
                break;
                case 2:
                    list.show();
                    msg();
                    next = input.next();
                break;
                case 3:
                    System.out.println("Inserta el valor a buscar");
                    try {
                        val = input.nextInt();
                        if (list.find(val)) {
                            System.out.println("El valor " + val + " fue encontrado en la lista");
                        } else {
                            System.out.println("El valor " + val + " no fue encontrado en la lista");
                        }
                        msg();
                        next = input.next();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                break;
                case 4:
                    System.out.println("Inserta una nuevo valor");
                    try {
                        val = input.nextInt();
                        list.add(val);
                        msg();
                        next = input.next();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                break;
                case 5:
                    System.out.println("Inserta el valor a eliminar");
                    val = input.nextInt();
                    list.delete(val);
                    msg();
                    next = input.next();
                break;
                case 6:
                    System.out.println("Inserta el valor a modificar");
                    val = input.nextInt();
                    
                    //list.edit(val, val2);
                    msg();
                    next = input.next();
                break;
                case 7: 
                    list.credits();
                    msg();
                    next = input.next();
                break;
                default:
                    option = 8;
                break;
            }
        }while (option !=8 && !next.equals(""));
        System.out.println("¡Adiós!");
    }
    
    public static void msg(){
        System.out.println("------------------------------------\nTeclea cualquier tecla para continuar");
    }
}

