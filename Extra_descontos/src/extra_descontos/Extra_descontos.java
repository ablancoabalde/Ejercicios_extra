
package extra_descontos;

import java.util.Scanner;

public class Extra_descontos {
//Teclear el precio unitario de un artigo y el número de unidades vendidas y obtener la cantidad a pagar, nas seguintes condicions:
//1º Si el número de unidades es menor de 100 no hay desconto
//2º Si está entre 100 y 200 y precio unitario mayor que 4000 se aplica un descuento de un 5%,No resto dos casos un 2%.
//3º Si el número de unidades es mayor o igual a 200 y precio unitario mayor de 4000 se aplica un descuento de un 10% no resto de los casos un 8%.
//Visualizar precio total sin descuento, descuento y precio final.

    public static void main(String[] args) {
        
        Metodo obj = new Metodo();
        Metodo obj2 = new Metodo();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca unidades");
        obj.setUnidades(entrada.nextInt());
        System.out.println("Introduzca precio unitario");
        obj.setPrecio(entrada.nextInt());
          
        obj2.funMetodo(obj);
        
        
        
    }
    
}
