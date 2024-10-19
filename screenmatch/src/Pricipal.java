import com.aluracursos.screenmatch.calculos.CalculaTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modulos.Episodio;
import com.aluracursos.screenmatch.modulos.Pelicula;
import com.aluracursos.screenmatch.modulos.Serie;

public class Pricipal {
    public static void main(String[] args) {
        var pelicula1 = new Pelicula();
        pelicula1.setNombre("Matrix");
        pelicula1.setDuracionMinutos(182);
        pelicula1.setFechaLanzamiento(2006);
        pelicula1.setHasPlan(true);
        pelicula1.setDirector("Lilly Wachowski, Lana Wachowski");
        pelicula1.evalua(10);
        pelicula1.evalua(8.5);
        pelicula1.evalua(10);
        pelicula1.evalua(7.3);

        System.out.println("*** Detalle de la película ***");
        pelicula1.muestraFichaTecnica();
        System.out.println("Director: "  + pelicula1.getDirector());
        System.out.println("Cantidad de calificaciones: " + pelicula1.getTotalCalificaciones());
        System.out.println("Media: " + pelicula1.calculaMedia());
        System.out.println("Estrellas: " + pelicula1.getClasificacion());

        var filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(pelicula1);

        System.out.println("-----------------------------------------------------------------------");
        // Series
        System.out.println("*** Detalle de la Serie ***");
        Serie serie1 = new Serie();
        serie1.setNombre("Pálpito");
        serie1.setFechaLanzamiento(2022);
        serie1.setHasPlan(true);
        serie1.evalua(9.5);
        serie1.evalua(10);
        serie1.evalua(8.2);
        serie1.setTemporadas(2);
        serie1.setEpisodiosPorTemporada(23);
        serie1.setMinutosPorEpisodio(45);

        serie1.muestraFichaTecnica();
        System.out.println("Número de temporadas: " + serie1.getTemporadas());
        System.out.println("Episodios por temporada: " + serie1.getEpisodiosPorTemporada());
        System.out.println("Duración por episodio: " + serie1.getMinutosPorEpisodio());
        System.out.println("Cantidad de calificaciones: " + serie1.getTotalCalificaciones());
        System.out.println("Media: " + serie1.calculaMedia());

        // Episodio
        var episodio1 = new Episodio();
        episodio1.setNumero(1);
        episodio1.setNombre("Cuchilla ataca");
        episodio1.setSerie(serie1);
        episodio1.setTotalVisualizaciones(300);
        filtroRecomendacion.filtra(episodio1);

        System.out.println();

        // Tiempo total
        var tiempoTotalLista = new CalculaTiempo();
        tiempoTotalLista.incluye(pelicula1);
        tiempoTotalLista.incluye(serie1);
        System.out.println("Tiempo total lista: " + tiempoTotalLista.getTiempoTotal() + " minutos");

    }
}
