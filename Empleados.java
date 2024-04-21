/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author arodr
 */
public class Empleados extends Persona {

    /**
     * @return the codEmpleado
     */
    public String getCodEmpleado() {
        return codEmpleado;
    }

    /**
     * @param codEmpleado the codEmpleado to set
     */
    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }
    private String codEmpleado;
    private String area;
    
    public Empleados(){}
    
    public Empleados(String nombre, String apellidos, int edad,String codEmpleado,String area){
        super(nombre,apellidos,edad);
        this.codEmpleado=codEmpleado;
        this.area=area;
    }
}
