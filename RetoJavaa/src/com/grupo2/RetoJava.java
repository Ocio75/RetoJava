package com.grupo2;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import com.grupo2.ventanas.Inicio;

public class RetoJava {

    public static void main(String[] args) {
        FlatArcDarkIJTheme.setup();
        Inicio p1 = new Inicio();
        p1.setVisible(true);
        p1.setLocationRelativeTo(null);

    }
    
}
