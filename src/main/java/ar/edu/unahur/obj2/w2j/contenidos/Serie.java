package ar.edu.unahur.obj2.w2j.contenidos;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {

    private List<Temporada> temporadas = new ArrayList<>();

    public Serie(String titulo, Double costoBase) {
        super(titulo, costoBase);
    }

    public Serie(String titulo, Double costoBase, List<Temporada> Temporadas){
        super(titulo, costoBase);
        this.temporadas = temporadas;
    }

    public void agregarTemporada(Temporada temporada){
        Temporadas.add(temporada);
    }
}
