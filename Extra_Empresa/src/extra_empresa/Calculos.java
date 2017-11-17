
package extra_empresa;

public class Calculos {
   
    public Calculos() {
    }
    
    
    public int metodoFillos(int fillos){
        
        switch (fillos) {
            case 0:
                return 180;
            case 1:
                return 240;
            case 2:
                return 300;
            default:
                return 360;
        }
    }
    
    public int metodoHoras(int horas){
        int euros=360;
        for(int i=0; i<=horas;i++){
            if(euros>1 && horas!=0){
                euros-=6;
            }else if(horas==0){
                euros=360;
            }else{
                euros=0;
            }
        }
        return euros;
    }
    
    
}
