package com.grupo2.objetos;

import java.util.Date;

/**
 * Clase que representa a un empleado con atributos como DNI, puesto, nombre, apellidos, antigüedad, número de seguridad social y contraseña.
 */
public class Empleado {
    private String dni;
    private String puesto;
    private String nombre;
    private String apellidos;
    private Date antiguedad;
    private int nSeguridadSocial;
    private String paswd;

    /**
     * Constructor que inicializa un objeto Empleado con los atributos proporcionados.
     *
     * @param dni               El número de DNI del empleado.
     * @param puesto            El puesto o cargo del empleado.
     * @param nombre            El nombre del empleado.
     * @param apellidos         Los apellidos del empleado.
     * @param antiguedad        La fecha de antigüedad del empleado.
     * @param nSeguridadSocial  El número de seguridad social del empleado.
     * @param paswd             La contraseña del empleado.
     */
    public Empleado(String dni, String puesto, String nombre, String apellidos, Date antiguedad, int nSeguridadSocial, String paswd) {
        this.dni = dni;
        this.puesto = puesto;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.antiguedad = antiguedad;
        this.nSeguridadSocial = nSeguridadSocial;
        this.paswd = paswd;
    }

    /**
     * Constructor sin argumentos que crea un objeto Empleado vacío.
     */
    public Empleado() {
    }

    /**
     * Obtiene el número de DNI del empleado.
     *
     * @return El número de DNI del empleado.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el número de DNI del empleado.
     *
     * @param dni El número de DNI a establecer.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene el puesto o cargo del empleado.
     *
     * @return El puesto o cargo del empleado.
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Establece el puesto o cargo del empleado.
     *
     * @param puesto El puesto o cargo a establecer.
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * Obtiene el nombre del empleado.
     *
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     *
     * @param nombre El nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene los apellidos del empleado.
     *
     * @return Los apellidos del empleado.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos del empleado.
     *
     * @param apellidos Los apellidos a establecer.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtiene la fecha de antigüedad del empleado.
     *
     * @return La fecha de antigüedad del empleado.
     */
    public Date getAntiguedad() {
        return antiguedad;
    }

    /**
     * Establece la fecha de antigüedad del empleado.
     *
     * @param antiguedad La fecha de antigüedad a establecer.
     */
    public void setAntiguedad(Date antiguedad) {
        this.antiguedad = antiguedad;
    }

    /**
     * Obtiene el número de seguridad social del empleado.
     *
     * @return El número de seguridad social del empleado.
     */
    public int getnSeguridadSocial() {
        return nSeguridadSocial;
    }

    /**
     * Establece el número de seguridad social del empleado.
     *
     * @param nSeguridadSocial El número de seguridad social a establecer.
     */
    public void setnSeguridadSocial(int nSeguridadSocial) {
        this.nSeguridadSocial = nSeguridadSocial;
    }

    /**
     * Obtiene la contraseña del empleado.
     *
     * @return La contraseña del empleado.
     */
    public String getPaswd() {
        return paswd;
    }

    /**
     * Establece la contraseña del empleado.
     *
     * @param paswd La contraseña a establecer.
     */
    public void setPaswd(String paswd) {
        this.paswd = paswd;
    }
}
