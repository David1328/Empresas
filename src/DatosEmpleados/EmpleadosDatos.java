/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosEmpleados;

public class EmpleadosDatos {
    private String nom;
    private short edad;
    private String direccion;
    private String telefono;
    public EmpleadosDatos() {
    }

    public EmpleadosDatos(String nom, short edad, String direccion, String telefono) {
        this.nom = nom;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the edad
     */
    public short getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(short edad) {
        this.edad = edad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
