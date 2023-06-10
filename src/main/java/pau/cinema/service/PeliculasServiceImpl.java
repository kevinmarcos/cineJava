package pau.cinema.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;
import pau.cinema.model.Pelicula;

@Service
public class PeliculasServiceImpl implements IPeliculasService {

    //Atributo Privado a nivel de la clase
    public List<Pelicula> lista = null;

    public PeliculasServiceImpl() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        lista = new LinkedList<Pelicula>();

        try {
            //1 pelicula
            Pelicula pelicula = new Pelicula();

            pelicula.setId(1);
            pelicula.setNombre("THE SUPER MARIO BROS");
            pelicula.setDuracion("90 Min");
            pelicula.setClasificacion("APT");
            pelicula.setIdioma("Ingles");
            pelicula.setGenero("Aventura-Ciencia Ficcion-Comedia");
            pelicula.setFormato("4D");
            pelicula.setSinopsis("Los hermanos Mario y Luigi se embarcan en una peligrosa misión para rescatar a la princesa Peach y derrotar al malvado Bowser.");
            pelicula.setImagen("SuperMario.png");
            pelicula.setFecha(sdf.parse("11-05-2023"));
            pelicula.setDestacado(1);

            //2 pelicula
            Pelicula pelicula2 = new Pelicula();

            pelicula2.setId(2);
            pelicula2.setNombre("Inception");
            pelicula2.setDuracion("148 minutos");
            pelicula2.setClasificacion("13+");
            pelicula2.setIdioma("Inglés");
            pelicula2.setGenero("Acción, Ciencia ficción");
            pelicula2.setFormato("Cine");
            pelicula2.setSinopsis("Dom Cobb es un ladrón de información hábil en el arte de la extracción de los sueños. Ahora, enfrenta su último desafío: la inserción de una idea en lugar de extraerla.");
            pelicula2.setImagen("inception.jpg");
            pelicula2.setDestacado(0);

            //3 pelicula
            Pelicula pelicula3 = new Pelicula();

            pelicula3.setId(3);
            pelicula3.setNombre("La La Land");
            pelicula3.setDuracion("128 minutos");
            pelicula3.setClasificacion(" 13+");
            pelicula3.setIdioma(" Inglés");
            pelicula3.setGenero("Musical, Romance");
            pelicula3.setFormato("Cine");
            pelicula3.setSinopsis("Mia, una aspirante a actriz, y Sebastian, un talentoso pianista de jazz, se enamoran en Los Ángeles mientras persiguen sus sueños en una ciudad conocida por destruir esperanzas y romances.");
            pelicula3.setImagen("lalaland.jpg");
            pelicula3.setDestacado(1);

            //4 pelicula
            Pelicula pelicula4 = new Pelicula();

            pelicula4.setId(4);
            pelicula4.setNombre("El Padrino");
            pelicula4.setDuracion("175 minutos");
            pelicula4.setClasificacion("18+");
            pelicula4.setIdioma("Ingles");
            pelicula4.setGenero("Crimen, drama");
            pelicula4.setFormato("Cine");
            pelicula4.setSinopsis("Don Vito Corleone, líder de una poderosa familia criminal, lucha por mantener su imperio mientras se enfrenta a rivalidades y traiciones en el peligroso mundo de la mafia.");
            pelicula4.setImagen("elpadrino.jpg");
            pelicula4.setDestacado(1);

            //5 pelicula
            Pelicula pelicula5 = new Pelicula();

            pelicula5.setId(5);
            pelicula5.setNombre("Coco");
            pelicula5.setDuracion("105 minutos");
            pelicula5.setClasificacion("APT");
            pelicula5.setIdioma("Español-Ingles");
            pelicula5.setGenero("Animación, Aventura");
            pelicula5.setFormato("4d");
            pelicula5.setSinopsis("Miguel, un joven apasionado por la música, se embarca en una extraordinaria aventura en la Tierra de los Muertos para descubrir la verdad sobre su familia y seguir su pasión musical.");
            pelicula5.setImagen("coco.jpg");
            pelicula5.setDestacado(0);

            //6 pelicula
            Pelicula pelicula6 = new Pelicula();

            pelicula6.setId(6);
            pelicula6.setNombre("El Laberinto del Fauno");
            pelicula6.setDuracion("118 minutos");
            pelicula6.setClasificacion("18+");
            pelicula6.setIdioma("Español");
            pelicula6.setGenero("Fantasía, Drama");
            pelicula6.setFormato("Cine");
            pelicula6.setSinopsis("En la posguerra española, una niña llamada Ofelia se adentra en un laberinto mágico y peligroso donde se enfrenta a criaturas fantásticas mientras lucha por escapar de la realidad brutal que la rodea.");
            pelicula6.setImagen("laberintofauno.jpg");
            pelicula6.setDestacado(1);

            lista.add(pelicula);
            lista.add(pelicula2);
            lista.add(pelicula3);
            lista.add(pelicula4);
            lista.add(pelicula5);
            lista.add(pelicula6);

        } catch (ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    @Override
    public List<Pelicula> buscarTodas() {
        //TODO auto-generated method stub
        return lista;
    }

    @Override
    public Pelicula buscarPorId(Integer idPelicula) {
        for (Pelicula p : lista) {
            if (p.getId() == idPelicula) {
                return p;
            }
        }
        return null;
    }


}
