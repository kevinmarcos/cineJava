
package pau.cinema.model;

import java.util.Date;

public class Pelicula {
    
    
    private Integer id;
    private String nombre;
    private String duracion;
    private String clasificacion;
    private String idioma;
    private String genero;
    private String formato;
    private String sinopsis;
    private String imagen="no-imagen.png";
    private Date fecha;
    private Integer destacado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getDestacado() {
        return destacado;
    }

    public void setDestacado(Integer destacado) {
        this.destacado = destacado;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", nombre=" + nombre + ", duracion=" + duracion + ", clasificacion=" + clasificacion + ", idioma=" + idioma + ", genero=" + genero + ", formato=" + formato + ", sinopsis=" + sinopsis + ", imagen=" + imagen + ", fecha=" + fecha + ", destacado=" + destacado + '}';
    }

    
    
    
    
    
    
    
    
    
   
    
    
    
}
