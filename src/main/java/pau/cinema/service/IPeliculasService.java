package pau.cinema.service;

import java.util.List;
import pau.cinema.model.Pelicula;

public interface IPeliculasService {
	List<Pelicula> buscarTodas();
	Pelicula buscarPorId(Integer idPelicula);
}
