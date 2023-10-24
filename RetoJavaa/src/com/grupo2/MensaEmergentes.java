package com.grupo2;

import javax.swing.JOptionPane;

/**
 * Esta clase proporciona métodos para mostrar ventanas de diálogo emergentes utilizando JOptionPane.
 */
public class MensaEmergentes {

    /**
     * Muestra una ventana de diálogo de alerta con un tipo de icono personalizado.
     *
     * @param tipoIcono Tipo de icono a mostrar (1: Información, 2: Advertencia, 3: Pregunta, 4: Error, 5: Otro).
     * @param mensaje   El mensaje a mostrar en la ventana de diálogo.
     * @param cabecera  El título de la ventana de diálogo.
     * @return Un entero que representa la opción seleccionada por el usuario.
     */
    public static int alerta(int tipoIcono, String mensaje, String cabecera) {
        int cancelar = 1;
        Object[] options = {"Aceptar"};
        int respuesta = JOptionPane.showOptionDialog(null, mensaje, cabecera, JOptionPane.DEFAULT_OPTION,
                getIcono(tipoIcono), null, options, cancelar);
        return respuesta;
    }

    /**
     * Muestra una ventana de diálogo con opciones "Sí" y "No".
     *
     * @param tipo     Tipo de icono a mostrar (1: Información, 2: Advertencia, 3: Pregunta, 4: Error, 5: Otro).
     * @param mensaje  El mensaje a mostrar en la ventana de diálogo.
     * @param cabecera El título de la ventana de diálogo.
     * @return Un entero que representa la opción seleccionada por el usuario (0 para "Sí" y 1 para "No").
     */
    public static int siNo(int tipo, String mensaje, String cabecera) {
        Object[] options = {"Sí", "No"};
        int respuesta = JOptionPane.showOptionDialog(null, mensaje, cabecera, JOptionPane.YES_NO_OPTION,
                getIcono(tipo), null, options, options[1]);
        return respuesta;
    }

    /**
     * Muestra una ventana de diálogo con opciones "Aceptar" y "Cancelar".
     *
     * @param tipo     Tipo de icono a mostrar (1: Información, 2: Advertencia, 3: Pregunta, 4: Error, 5: Otro).
     * @param mensaje  El mensaje a mostrar en la ventana de diálogo.
     * @param cabecera El título de la ventana de diálogo.
     * @return Un entero que representa la opción seleccionada por el usuario (0 para "Aceptar" y 1 para "Cancelar").
     */
    public static int aceptarCancelar(int tipo, String mensaje, String cabecera) {
        Object[] options = {"Aceptar", "Cancelar"};
        int respuesta = JOptionPane.showOptionDialog(null, mensaje, cabecera, JOptionPane.OK_CANCEL_OPTION,
                getIcono(tipo), null, options, options[1]);
        return respuesta;
    }

    /**
     * Muestra una ventana de diálogo con opciones "Sí", "No" y "Cancelar".
     *
     * @param tipo     Tipo de icono a mostrar (1: Información, 2: Advertencia, 3: Pregunta, 4: Error, 5: Otro).
     * @param mensaje  El mensaje a mostrar en la ventana de diálogo.
     * @param cabecera El título de la ventana de diálogo.
     * @return Un entero que representa la opción seleccionada por el usuario (0 para "Sí", 1 para "No" y 2 para "Cancelar").
     */
    public static int siNoCancelar(int tipo, String mensaje, String cabecera) {
        Object[] options = {"Sí", "No", "Cancelar"};
        int respuesta = JOptionPane.showOptionDialog(null, mensaje, cabecera, JOptionPane.YES_NO_CANCEL_OPTION,
                getIcono(tipo), null, options, options[2]);
        return respuesta;
    }

    /**
     * Muestra una ventana de diálogo con opciones "Modificar", "Eliminar" y "Cancelar".
     *
     * @param tipo     Tipo de icono a mostrar (1: Información, 2: Advertencia, 3: Pregunta, 4: Error, 5: Otro).
     * @param mensaje  El mensaje a mostrar en la ventana de diálogo.
     * @param cabecera El título de la ventana de diálogo.
     * @return Un entero que representa la opción seleccionada por el usuario (0 para "Modificar", 1 para "Eliminar" y 2 para "Cancelar").
     */
    public static int modificarEliminar(int tipo, String mensaje, String cabecera) {
        Object[] options = {"Modificar", "Eliminar", "Cancelar"};
        int respuesta = JOptionPane.showOptionDialog(null, mensaje, cabecera, JOptionPane.YES_NO_CANCEL_OPTION,
                getIcono(tipo), null, options, options[2]);
        return respuesta;
    }

    /**
     * Obtiene el valor correspondiente al tipo de icono de JOptionPane.
     *
     * @param tipoIcono Tipo de icono (1: Información, 2: Advertencia, 3: Pregunta, 4: Error, 5: Otro).
     * @return El valor del tipo de icono de JOptionPane.
     */
    private static int getIcono(int tipoIcono) {
        switch (tipoIcono) {
            case 1:
                return JOptionPane.INFORMATION_MESSAGE;
            case 2:
                return JOptionPane.WARNING_MESSAGE;
            case 3:
                return JOptionPane.QUESTION_MESSAGE;
            case 4:
                return JOptionPane.ERROR_MESSAGE;
            case 5:
            default:
                return JOptionPane.PLAIN_MESSAGE;
        }
    }
}
