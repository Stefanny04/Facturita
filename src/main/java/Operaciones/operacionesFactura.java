
package Operaciones;


public class operacionesFactura {

    private long valorTProd;
    private long valorTFact;
    
    public long getValorTotal() {
        return valorTProd;
    }

    public void setValorTotal(long valorTotal) {
        this.valorTProd = valorTotal;
    }

    public long getValorTFact() {
        return valorTFact;
    }

    public void setValorTFact(long valorTFact) {
        this.valorTFact = valorTFact;
    }

    public long getValorTProd() {
        return valorTProd;
    }

    public void setValorTProd(long valorTProd) {
        this.valorTProd = valorTProd;
    }
    
    public int cantidad(int cant, int canInv){
        canInv = canInv - cant;
        return canInv;
    }
    
    public long totalFactura(long valorT){
        valorTFact += valorT;
        return valorTFact;
    }
    
    public long totalProd(int cant, long valUnit){
        valorTProd = valUnit*cant;
        return valorTProd;        
    }
}
