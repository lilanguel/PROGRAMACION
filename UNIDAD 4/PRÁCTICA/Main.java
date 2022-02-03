import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Examen ex1=new Examen(Calendar.getInstance(),"ALIXAR","https://alixar.es");
        Sedes sede1=new Sedes("62367243678",Capitales.SEVILLA);
        Sedes sede2=new Sedes("78675543332",Capitales.GRANADA);
        Opositor opositor1=new Opositor("Angel","de los Rios",2002,false,null);
        Opositor opositor2=new Opositor("Mamerto","Galan",1978,true,"Repetidor");
        Opositor opositor3=new Opositor("Kike","Montilla",2000,true,"Nini");
        Opositor opositor4=new Opositor("Manuel","Fajardo",1989,false,null);

        System.out.println(Opositor.getNumOpositores());
        System.out.println(Opositor.getNumOpositoresConAdaptacion());

        sede1.addOpositor(opositor1);
        sede1.addOpositor(opositor2);
        sede1.elimOpositor(opositor1);
        sede1.mostrarInformacion();

        sede2.addOpositor(opositor3);
        sede2.addOpositor(opositor4);
        sede2.mostrarInformacion();

        Preguntas p1=new Preguntas("¿2+2?");
        Preguntas p2=new Preguntas("¿3+4?");
        Opciones op1=new Opciones("4",true);
        Opciones op2=new Opciones("5",false);
        Opciones op3=new Opciones("6",false);
        Opciones op4=new Opciones("5",false);
        Opciones op5=new Opciones("7",true);
        Opciones op6=new Opciones("8",false);

        p1.addOpciones(op1);
        p1.addOpciones(op2);
        p1.addOpciones(op3);
        p1.elimOpcion(op2);
        p1.mostrarInformacion();

        p2.addOpciones(op4);
        p2.addOpciones(op5);
        p2.addOpciones(op6);
        p2.elimOpcion(op6);
        p2.mostrarInformacion();

        ex1.addPregunta(p1);
        ex1.addPregunta(p2);
        ex1.addSede(sede1);
        ex1.addSede(sede2);

        ex1.mostrarInformacion();
    }
}
