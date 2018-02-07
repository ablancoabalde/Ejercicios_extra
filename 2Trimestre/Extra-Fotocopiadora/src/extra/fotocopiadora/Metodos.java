package extra.fotocopiadora;

import java.util.LinkedList;

public class Metodos {

    // Clase LinkedList
    LinkedList<Texto> impresion=new LinkedList<Texto>();

    public void enviar(Texto t) {
        //Agrega el elemento especificado al final de esta lista.
        impresion.add(t);

    }

    public void imprimir() {
        
        //Recupera, pero no elimina, el encabezado (primer elemento) de esta lista.        
        if (impresion.element().getTexto()==null) {
            System.out.println("No hay cola");
        } else {
            
            for (int i=0; i<impresion.element().getnCopias(); i++) {
                System.out.println(impresion.element().getTexto());
            }
            // Recupera y elimina el encabezado (primer elemento) de esta lista.
            impresion.poll();
        }

    }

    public void verCola() {
        // Devuelve la cantidad de elementos en esta lista.
        System.out.println("Hay "+impresion.size()+" elementos por imprimir");
    }

}
