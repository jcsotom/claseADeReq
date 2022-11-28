/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apppruebacodigo;

/**
 *
 * @author jcsotom
 */


public class Orden {

    private int cantidad;
    private boolean pagosConTC;

    public Orden(int _cantidad, boolean _pagoContTC){
       setCantidad(_cantidad);
         this.pagosConTC = _pagoContTC;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the pagosConTC
     */
    public boolean isPagosConTC() {
        return pagosConTC;
    }

    /**
     * @param pagosConTC the pagosConTC to set
     */
    public void setPagosConTC(boolean pagosConTC) {
        this.pagosConTC = pagosConTC;
    }
    
}


