/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author arodr
 */
public class Cliente extends Persona {

    /**
     * @return the codCliente
     */
    public String getCodCliente() {
        return codCliente;
    }

    /**
     * @param codCliente the codCliente to set
     */
    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    /**
     * @return the cantCompras
     */
    public int getCantCompras() {
        return cantCompras;
    }

    /**
     * @param cantCompras the cantCompras to set
     */
    public void setCantCompras(int cantCompras) {
        this.cantCompras = cantCompras;
    }
private String codCliente;
private int cantCompras;
public Cliente(){}
public Cliente(String nombre, String apellidos, int edad,String codCliente,int cantCompras){
super(nombre,apellidos,edad);
this.codCliente=codCliente;
this.cantCompras=cantCompras;

}

    void setnombre(String juan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
