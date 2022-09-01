/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo3_practica3_3;

/**
 *
 * @author PC
 */
public class NumeroNegativoExcepcion extends Exception {
    public NumeroNegativoExcepcion(){
        super();
    }
    public NumeroNegativoExcepcion(String mensaje){
        super(mensaje);
    }
}
//No logre invocar la el metodo ya que por alguna razon me arrojaba error