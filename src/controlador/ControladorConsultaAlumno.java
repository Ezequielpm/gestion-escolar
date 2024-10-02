package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VistaConsultaAlumno;


public class ControladorConsultaAlumno implements ActionListener{
    
    VistaConsultaAlumno objVistaConsulta;

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
        if(e.getSource() == objVistaConsulta.botonAgregar){
            System.err.println("error");
        }
        
    }

    public ControladorConsultaAlumno(VistaConsultaAlumno consultaAlumno) {
        this.objVistaConsulta=consultaAlumno;
        consultaAlumno.botonAgregar.addActionListener(this);
    }
    
}
