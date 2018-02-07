
package extra.fotocopiadora;

public class Texto {
    private String texto;
    private int nCopias;

    public Texto(String texto, int nCopias) {
        this.texto=texto;
        this.nCopias=nCopias;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto=texto;
    }

    public int getnCopias() {
        return nCopias;
    }

    public void setnCopias(int nCopias) {
        this.nCopias=nCopias;
    }

    @Override
    public String toString() {
        return "Texto{"+"texto="+texto+", nCopias="+nCopias+'}';
    }
    
    
}
