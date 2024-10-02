
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.MenuEscuela;


public class ControladorMenuEscuela implements ActionListener{
    
    //ListaAlumno 
    MenuEscuela objMenuEscuela;

    public ControladorMenuEscuela(MenuEscuela objMenuEscuela) {
        this.objMenuEscuela = objMenuEscuela;
        objMenuEscuela.BoAgregarAlumno.addActionListener(this);
        objMenuEscuela.BoConsultaAlumno.addActionListener(this);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == objMenuEscuela.BoAgregarAlumno){
            
            
        }
    }
    
}
