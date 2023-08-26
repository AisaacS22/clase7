package pkgAlumnos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] arg){
        List<CursoAsignado> cat_cursos = new ArrayList<>();
        cat_cursos.add(new CursoAsignado (101,  "programacion",  500));
        cat_cursos.add( new CursoAsignado (105,  "Derecho", 1));
        cat_cursos.add(new CursoAsignado (110,  "Estadistica", 450));
        cat_cursos.add(new CursoAsignado (120,  "Electronica", 400));



        Alumnos al1 = new Alumnos ("2023015", "Andrea ", "55555555", "5 calle 8-36 zona 1 ");
        al1.agregarCursoAsignado(cat_cursos.get(1));
        al1.agregarCursoAsignado(cat_cursos.get(2));
        System.out.println("Total del alumno: "+al1.getNombre()+"Q."+al1.getTotalCurso());

        Alumnos al2 = new Alumnos("2023016", "Isaac ", "12340678", "2 avenida 10-20 zona 2");
        al2.agregarCursoAsignado(cat_cursos.get(0));
        al2.agregarCursoAsignado(cat_cursos.get(2));
        System.out.println("Total del alumno: "+al2.getNombre()+"Q."+al2.getTotalCurso());

        Alumnos al3 = new Alumnos("2023017", "Yamileth ", "98765432", "3 calle 15-45 zona 3");
        al3.agregarCursoAsignado(cat_cursos.get(2));
        al3.agregarCursoAsignado(cat_cursos.get(3));
        System.out.println("Total del alumno: "+al3.getNombre()+"Q."+al3.getTotalCurso());

        System.out.println(+al1.getTotalCurso()+al2.getTotalCurso()+al3.getTotalCurso());
    }
}

