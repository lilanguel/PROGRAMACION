import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Chirigota chirigota1 = new Chirigota("Las olas","Mamerto","Angel","Alberto","Tunica",9,10);
        Comparsa comparsa1 = new Comparsa("Ole ole los caracoles","Ivan","Miguel","Manuel","Abrigo",3,"LIDL");
        Coro coro1=new Coro("Vida alegre","Javier","Fernando","Mariana","Bata",7,7,9);
        Cuarteto cuarteto1=new Cuarteto("La rima del teto","Alfonso","Diego","Claudia","Camisa",25,7);
        Romancero romancero1= new Romancero("San Valentin","Checo","Joaquin","Ibai","Calzoncillos","Amor");

        Integrante integrante1=new Integrante(1,"Juanito",19,"Umbrete");
        Integrante integrante2=new Integrante(2,"Veli",52,"Bormujos");

        System.out.println("----Mostrar el tipo----");
        chirigota1.hacer_tipo();
        comparsa1.hacer_tipo();
        coro1.hacer_tipo();
        cuarteto1.hacer_tipo();
        romancero1.hacer_tipo();

        System.out.println("----Cantar la presentación----");
        chirigota1.cantar_la_presentacion();
        comparsa1.cantar_la_presentacion();
        coro1.cantar_la_presentacion();
        cuarteto1.cantar_la_presentacion();
        romancero1.cantar_la_presentacion();

        System.out.println("----Añadir integrantes----");
        chirigota1.insertar_integrante(integrante1);
        chirigota1.insertar_integrante(integrante2);

        System.out.println(chirigota1);

        System.out.println("----Eliminar integrantes----");

        chirigota1.eliminar_integrante(integrante1);

        System.out.println(chirigota1);

        System.out.println("----Caminito del falla----");
        chirigota1.caminito_del_falla();
        comparsa1.caminito_del_falla();
        coro1.caminito_del_falla();
        cuarteto1.caminito_del_falla();

        System.out.println("----Amo a escuchar----");
        chirigota1.amo_a_escucha();
        cuarteto1.amo_a_escucha();
        romancero1.amo_a_escucha();

        System.out.println("----Ordenar Agrupacion por autor----");
        Agrupacion[] agrupacions = {chirigota1,comparsa1,coro1,cuarteto1,romancero1};

        Arrays.sort(agrupacions, new Comparator<Agrupacion>() {
            @Override
            public int compare(Agrupacion a1, Agrupacion a2) {
                return a1.getAutor().compareTo(a2.getAutor());
            }
        });

        System.out.println(Arrays.toString(agrupacions));

        System.out.println("----Ordenar Agrupacion Oficial por puntos----");
        AgrupacionOficial[] agrupacionOficials = {chirigota1,comparsa1,coro1,cuarteto1};

        Arrays.sort(agrupacionOficials, new Comparator<AgrupacionOficial>() {
            @Override
            public int compare(AgrupacionOficial a1, AgrupacionOficial a2) {
                return a1.getPuntos_obtenidos()-a2.getPuntos_obtenidos();
            }
        });

        System.out.println(Arrays.toString(agrupacionOficials));

        System.out.println("----Inscribir Agrupacion----");

        COAC coac1=new COAC();

        coac1.inscribir_agrupacion(chirigota1);
        coac1.inscribir_agrupacion(comparsa1);
        coac1.inscribir_agrupacion(coro1);

        System.out.println(coac1);

        System.out.println("----Eliminar Agrupacion----");
        coac1.eliminar_agrupacion(comparsa1);

        System.out.println(coac1);

        System.out.println("----Ordenar por puntos----");

        coac1.ordenar_por_puntos();
        System.out.println(coac1);

        System.out.println("----Ordenar por nombre----");

        coac1.ordenar_por_nombre();
        System.out.println(coac1);

        System.out.println("----Ordenar por autor----");

        coac1.ordenar_por_autor();
        System.out.println(coac1);

        System.out.println("----Mostrar número de agrupaciones creadas----");

        Agrupacion.mostrar_numero_agrupaciones();
    }
}