
package modelo;

public class Nodo {
    private char caracter;
    private int frecuencia;
    private String cadena;
    Nodo nodoAnt;
    
    Nodo nodoSig,nodoIzq,nodoDer;

    public Nodo(){
        this.caracter = 0;
        this.frecuencia = 0;
        this.nodoAnt = null;
        this.nodoSig = null;
        this.nodoIzq = null;
        this.nodoDer = null;
        this.cadena = "";
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public Nodo getNodoAnt() {
        return nodoAnt;
    }

    public void setNodoAnt(Nodo nodoAnt) {
        this.nodoAnt = nodoAnt;
    }

    public Nodo getNodoSig() {
        return nodoSig;
    }

    public void setNodoSig(Nodo nodoSig) {
        this.nodoSig = nodoSig;
    }

    public Nodo getNodoIzq() {
        return nodoIzq;
    }

    public void setNodoIzq(Nodo nodoIzq) {
        this.nodoIzq = nodoIzq;
    }

    public Nodo getNodoDer() {
        return nodoDer;
    }

    public void setNodoDer(Nodo nodoDer) {
        this.nodoDer = nodoDer;
    }
    
    public void imprimeDatos(){
        System.out.print("|'"+this.getCaracter()+"' "+this.getFrecuencia()+" "+this.getCadena()+"| ");
    }
    
    public void imprimeArbol(){
        System.out.println("|'"+this.getCaracter()+"' "+this.getFrecuencia()+"| ");
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    public void ruta(){
        System.out.println("|'"+this.getCaracter()+"': "+this.getCadena()+"| ");
    }
    
}
