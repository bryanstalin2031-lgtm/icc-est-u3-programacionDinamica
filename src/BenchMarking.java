import java.util.concurrent.Callable;
import models.Results;

public class BenchMarking {

    public static Results medirTiempos(Callable<Void> funcion) {
        try {
            // Calcular tiempo inincio
            long ininio = System.nanoTime();
            // Ejecutar la funcion
            funcion.call();
            // Calcular fin
            long fin = System.nanoTime();
            // Calcular timepo ejecucion
            double duracion = (fin - ininio)/1_000_000_000.0;
            // Devolver resulatos
            Results results = new Results(duracion);
            return results;

        } catch (Exception e) {
            throw new RuntimeException("Error en la funcion");
            //System.out.println("Error en la funcion");
            //return null;
            //comentario 

        }

    }
}
