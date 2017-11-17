
package extra_empresa;


public class Traballador {
    private String nombre;
    private int nFillos;
    private int habsentismo;
    private float sueldo;
    
    Calculos calc= new Calculos();
    public Traballador(){
        
    }
    public Traballador(String nom,  int nf,int habs,float sue){
        nombre=nom;
        nFillos=nf;
        habsentismo=habs;
        sueldo=sue;
    }    

    @Override
    public String toString() {
        
        int eurosfillos=calc.metodoFillos(nFillos);
        int euroshoras=calc.metodoHoras(habsentismo);
        
        return "Gratificacion extra \n" + "nombre=" + nombre + "\n Fillos=" + nFillos + "\n horas de habsentismo=" + habsentismo + "\n sueldo=" 
                + sueldo + "\n extra por horas= " + euroshoras + "\n Total sueldo + extra de fillos + extra por horas " + (eurosfillos+euroshoras+sueldo) ;
    }
    
    
    
}
