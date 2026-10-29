package co.umariana.equipo;

import java.util.ArrayList;
import java.util.List;

/**
 * LA TARJETA DE CADA INTEGRANTE SE AGREGA EN ESTE ARCHIVO (el mismo para todo el equipo).
 *
 * Agregue UNA línea con su tarjeta, justo debajo del comentario ">>> AGREGUE ...".
 * Los datos son: su usuario de GitHub, su nombre, un mensaje corto (máximo 80 caracteres)
 * y un color (por ejemplo #EF476F, #118AB2, #06D6A0, #FFD166).
 *
 * Si dos compañeros agregan su línea en el mismo lugar, Git avisará de un conflicto al unir
 * los Pull Requests: cómo resolverlo se explica en clase.
 */
public final class Integrantes {

    /** Título que muestra la ventana (no es necesario cambiarlos). */
    public static final String NOMBRE_EQUIPO = "Los Isaacs";
    public static final String LEMA = "Te extrañamos Isaac";

    private Integrantes() {
    }

    public static List<Tarjeta> tarjetas() {
        List<Tarjeta> lista = new ArrayList<>();

        lista.add(new Tarjeta("valeryta2910", "Tatiana Acosta", "Nunca te rindas, cumple tus sueños!", "#ec9ee6"));
        lista.add(new Tarjeta("jceron125", "Jose Ceron", "tatianic", "#e02b21"));
        lista.add(new Tarjeta("simon-mejia", "Simón Mejía", "El éxito es la suma de pequeños esfuerzos repetidos día tras día.", "#120131"));
        lista.add(new Tarjeta("orlando-arcos", "Orlando Arcos", "Persevera y alcanzaras", "#c98103"));
        lista.add(new Tarjeta("Camiids3", "Camilo Ojeda", "Dios creee en ti", "#0ab1ff"));

        return lista;
    }
}
