package controlador;

import java.util.ArrayList;
import modelo.Alumno;
import modelo.CRUD;

public class ListaAlumno extends CRUD {
    public ArrayList<Alumno> objListaAlumno;
    Alumno objAlumno;

    public ListaAlumno() {
        objListaAlumno = new ArrayList<>();
    }
    
    

    @Override
    public void create() {
        //objAlumno = new Alumno(); aqui tenia un error, como se creaba un nuevo alumno a cada rato, no me guardaba mis entradas :(
        objListaAlumno.add(objAlumno);
        
    }

    @Override
    public ArrayList read() {
        return objListaAlumno;
    }

    @Override
    public void update() {
    }

    @Override
    public void delete() {
    }

    public Alumno getObjAlumno() {
        return objAlumno;
    }

    public void setObjAlumno(Alumno objAlumno) {
        this.objAlumno = objAlumno;
    }
    
    
}
