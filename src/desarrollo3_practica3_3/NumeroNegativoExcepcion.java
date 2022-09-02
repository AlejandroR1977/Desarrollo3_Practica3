package desarrollo3_practica3;

public class NumeroNegativoExcepcion extends Exception {
    
    public NumeroNegativoExcepcion(String mensaje) {
        super(mensaje);
    }
    public NumeroNegativoExcepcion(String mensaje,Throwable causa){
        super(mensaje, causa);
    }
}
