
package extra.boletin17;

import com.alberto.datos.Notas;
import com.alberto.mostrar.Mostrar;
import com.alberto.ordenar.Ordenar;

/** 
crear un programa que lea a altura de 20 persoas, que calcule a altura media 
e cantas persoas teñen altura superior á media, e a porcentaxe de persoas con 
altura inferior a media e ordear por altura de maior a menor.
 */
public class ExtraBoletin17 {

    public static void main(String[] args) {
        
        float[] lAltura={1.80f,2f,1.55f,1.66f,1.58f,1.45f,1.33f,1.48f,2.02f,1.78f,
        1.89f,1.95f,1.93f,1.84f,1.73f,1.88f,1.50f,1.63f,1.77f,2.10f};
        
        System.out.println("La media de las alturas es " + Notas.media(lAltura)); 
        
        System.out.println("Hay " + Notas.masAltas(lAltura, Notas.media(lAltura))+ "  más altos que la media");
        System.out.println("Porcentaje de gente más baja " + Notas.masBajas(lAltura, Notas.media(lAltura))+"%");
        Ordenar.ordenarReverse(lAltura);
        Mostrar.mostrarlnum(lAltura);
    }
    
}
