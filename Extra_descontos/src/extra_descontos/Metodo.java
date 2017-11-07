
package extra_descontos;

public class Metodo {
    private int precio;
    private int unidades;
    public Metodo(){
        
    }
    
    public Metodo(int pre, int uni){
       precio=pre;
       unidades=uni;
    }
    
    public void setPrecio(int pre){
        precio=pre;
    }
    
    public int getPrecio(){
        return precio;
    }
    
    public void setUnidades(int uni){
        unidades=uni;
    }
    
    public int getUnidades (){
        return unidades;
    }
    
    public void funMetodo(Metodo obj){
        
        if(obj.getUnidades()<100){
            System.out.println(obj.getPrecio());
        }else if(obj.getUnidades()>100 && obj.getUnidades()<200){
            if(obj.getPrecio()>4000){
                System.out.println("Precio total " + obj.getPrecio() + 
                        " descuento " + obj.getPrecio()*0.05 + " precio final " + (obj.getPrecio()-(obj.getPrecio()*0.05)));
            }else{
                 System.out.println("Precio total " + obj.getPrecio() + 
                        " descuento " + obj.getPrecio()*0.02 + " precio final " + (obj.getPrecio()-(obj.getPrecio()*0.02)));
            }
        }else if(obj.getUnidades()>= 200){
            if(obj.getPrecio()>4000){
                System.out.println("Precio total " + obj.getPrecio() + 
                        " descuento " + obj.getPrecio()*0.10 + " precio final " + (obj.getPrecio()-(obj.getPrecio()*0.05)));
            }else{
                 System.out.println("Precio total " + obj.getPrecio() + 
                        " descuento " + obj.getPrecio()*0.08 + " precio final " + (obj.getPrecio()-(obj.getPrecio()*0.02)));
            }
        }
        
        
        
    }
    
    
}
