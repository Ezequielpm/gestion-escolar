package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Alumno;
import vista.VistaAltaAlumno;
import vista.VistaConsultaAlumno;

public class ControladorVistaAltaAlumno implements ActionListener {

    VistaAltaAlumno objVistaAltaAlumno;
    Validaciones objValidaciones;
    ListaAlumno objListaAlumno;
    Alumno objAlumno;
    ArrayList<Alumno> arrayAlumno;

    public ControladorVistaAltaAlumno(VistaAltaAlumno objAltaAlumno) {
        objValidaciones = new Validaciones();
        objListaAlumno = new ListaAlumno();
        this.objVistaAltaAlumno = objAltaAlumno;
        objAltaAlumno.botonGuardar.addActionListener(this);
        objAltaAlumno.botonCancelar.addActionListener(this);
        objAltaAlumno.botonImprimir.addActionListener(this);
        objAltaAlumno.BotonConsulta.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        boolean c1, c2, c3, c4, c5;
        if (e.getSource() == objVistaAltaAlumno.botonGuardar) {
            c1 = objValidaciones.validarTexto(objVistaAltaAlumno.campoMatricula, "matricula");
            c2 = objValidaciones.validarTexto(objVistaAltaAlumno.campoNombre, "nombre");
            c3 = objValidaciones.validarTexto(objVistaAltaAlumno.campoApPaterno, "apellido paterno");
            c4 = objValidaciones.validarTexto(objVistaAltaAlumno.campoApMaterno, "apellido materno");
            c5 = objValidaciones.validarTexto(objVistaAltaAlumno.campoEdad, "edad");

            if (c1 == true && c2 == true && c3 == true && c4 == true && c5 == true) {
                objAlumno = new Alumno();
                objAlumno.setMatricula(Integer.parseInt(objVistaAltaAlumno.campoMatricula.getText()));
                objAlumno.setNombre(objVistaAltaAlumno.campoNombre.getText());
                objAlumno.setApPaterno(objVistaAltaAlumno.campoApPaterno.getText());
                objAlumno.setApMaterno(objVistaAltaAlumno.campoApMaterno.getText());
                objAlumno.setEdad(Integer.parseInt(objVistaAltaAlumno.campoEdad.getText()));
                
                objListaAlumno.setObjAlumno(objAlumno);
                objListaAlumno.create();

                objVistaAltaAlumno.campoMatricula.setText("");
                objVistaAltaAlumno.campoNombre.setText("");
                objVistaAltaAlumno.campoApPaterno.setText("");
                objVistaAltaAlumno.campoApMaterno.setText("");
                objVistaAltaAlumno.campoEdad.setText("");
            }
        }

        
        if (e.getSource() == objVistaAltaAlumno.botonCancelar) {
            System.out.println("Ahora se cancela desde ControladorVistaAltaAlumno");
        }
        
        if (e.getSource() == objVistaAltaAlumno.botonImprimir) {
            arrayAlumno = objListaAlumno.read();
            for(Alumno dato : arrayAlumno){
                System.out.println("-------------------------------------");
                System.out.println("Matricula: " + dato.getMatricula());
                System.out.println("Nombre: " + dato.getNombre());
                System.out.println("Apellido paterno: " + dato.getApPaterno());
                System.out.println("Apellido materno: " + dato.getApMaterno());
                System.out.println("Edad: " + dato.getEdad());
            }
        }
        
        if(e.getSource() == objVistaAltaAlumno.BotonConsulta){
            VistaConsultaAlumno objConsulta = new VistaConsultaAlumno(this.objListaAlumno);
            objConsulta.setSize(500, 500);
            objConsulta.setVisible(true);
        }
    }

}
