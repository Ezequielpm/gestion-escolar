package controlador;

import javax.swing.JOptionPane;

public class Validaciones {

    public Validaciones() {
    }

    public boolean validarTexto(javax.swing.JTextField cadenaTexto, String campo) {
        if (cadenaTexto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(cadenaTexto, "El campo " + campo + " es requerido");
            return false;
        }
        return true;
    }
    
    
}
