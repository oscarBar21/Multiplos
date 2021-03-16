
/**
 * Write a description of class ComprobadorDeMultiplos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComprobadorDeMultiplos
{
    public boolean esMultiploDe2(int numero){
        boolean resultado = false;
        if((numero % 2 == 0) && (numero >= 2)){
            resultado = true;
        }
        return resultado;
    }
    
    public boolean esMultiploDe5(int numero){
        boolean resultado = false;
        if((numero % 5 == 0) && (numero >= 5)){
            resultado = true;
        }
        return resultado;
    }
    
    public boolean esMultiploDe(int a, int b){
        boolean resultado = false;
        if((b != 0) && (a >= b) && (b > 0) && (a >= 0) && (a % b == 0 )){
            resultado = true;
        }
        return resultado;
    }
}
