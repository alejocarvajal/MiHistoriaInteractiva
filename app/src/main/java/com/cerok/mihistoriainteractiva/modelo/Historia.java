package com.cerok.mihistoriainteractiva.modelo;

import com.cerok.mihistoriainteractiva.R;

/**
 * Created by cerok on 10/02/2017.
 */

public class Historia {
    private Pagina[] mPaginas;

    public Historia(){
        mPaginas = new Pagina[7];
        mPaginas[0] = new Pagina(
                R.drawable.historiaespacial01,
                "prueba",
                new Eleccion("Para e investiga",1),
                new Eleccion("Continua tu camino",2)
        );
        mPaginas[1] = new Pagina(
                R.drawable.historiaespacial02,
                "H\u00e1bilmente ha podido aterrizar su nave cerca del lugar donde se origin\u00f3 la se\u00f1al de auxilio. Y se encuentra con un extra\u00f1o aparato que parece una nave distinta a todas las que hab\u00eda visto hasta ahora.",
                new Eleccion("Para e investiga",3),
                new Eleccion("Continua tu camino",4)
        );
        mPaginas[2] = new Pagina(
                R.drawable.historiaespacial03,
                "H\\u00e1bilmente ha podido aterrizar su nave cerca del lugar donde se origin\\u00f3 la se\\u00f1al de auxilio. Y se encuentra con un extra\\u00f1o aparato que parece una nave distinta a todas las que hab\\u00eda visto hasta ahora.\"",
                new Eleccion("Vuelve a la nave y sigue su camino",2),
                new Eleccion("Busca la anomalia",5)
        );
        mPaginas[3] = new Pagina(
                R.drawable.historiaespacial04,
                "Su nave emite un mensaje diciendo que han detectado alg\\u00fan tipo de anomal\\u00eda en la superficie de Marte, cerca de una estaci\\u00f3n m\\u00f3vil abandonada. Le pide que investigue, pero en \\u00faltima instancia la decisi\\u00f3n es suya porque su misi\\u00f3n ya ha estado mucho tiempo en el espacio y los suministros est\\u00e1n bajos\".",
                new Eleccion("Volver a la nave y recargar bateria",2),
                new Eleccion("Continua la busqueda de la anomalia",6)
        );
        mPaginas[4] = new Pagina(
                R.drawable.historiaespacial05,
                "Su traje est\u00e1 equipado con un mapa y un radar, que utiliza para guiarse sobre la superficie de ese planeta. Despu\u00e9s de buscar por un tiempo, sus niveles de energ\u00eda est\u00e1n empezando a agotarse. El sabe que debe recargar sus bater\u00edas, pero hay una luz muy tenue por delante.",
                new Eleccion("Buscar las coordenadas",6),
                new Eleccion("Continua la busqueda de la anomalia",2)
        );
        mPaginas[5] = new Pagina(
                R.drawable.historiaespacial06,
                "La nave est\u00e1 cubierta de polvo y la mayor\u00eda de los paneles solares est\u00e1n rotos, pero queda sorprendido al ver que el sistema de a bordo sigue funcionando. De hecho, hay un mensaje en la pantalla: \"%1$s, dir\u00edgete a las coordenadas 28.543436, -81.369031 \". Esas coordenadas no est\u00e1n muy lejos, pero no sabe si su ox\u00edgeno durar\u00e1 suficiente."
        );
        mPaginas[6] = new Pagina(
                R.drawable.historiaespacial07,
                "Despu\u00e9s de un largo paseo, termina en la parte superior de un peque\u00f1o cr\u00e1ter. Mira a su alrededor, y se encuentra con una criatura de extra\u00f1o aspecto. Su nave se averio y necesita ayuda para volver a su planeta de origen llamado \"Tierra\"."
        );

    }
}
