package desarrollo3_practica3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws NumeroNegativoExcepcion {
        Scanner teclado = new Scanner(System.in);
        double n;
        System.out.println("Introduce un valor");
        n = teclado.nextInt();
        if(n>=0){
            System.out.println("La raiz es: " + Math.sqrt(n));
        }
        else{
            throw new NumeroNegativoExcepcion("El numero no es valido",
            new Throwable("El numero es negativo"));
        }
    }
}
    
