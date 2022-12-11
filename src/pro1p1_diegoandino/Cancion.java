
package pro1p1_diegoandino;

public class Cancion {
    
    private String cancion;
    private String album;
    private String artista;
    private int año;
    private int duracion;
//------------------------------------------------------------------------------
    Cancion(String cancion, String album, String artista, int año, int duracion){
        
        this.cancion = cancion;
        this.album = album;
        this.artista = artista;
        this.año = año;
        this.duracion = duracion;
    }
//------------------------------------------------------------------------------
    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
//------------------------------------------------------------------------------ 
    public String toString(){
        String cadena;
        cadena = this.getCancion() + "-" + this.getArtista();
        return cadena;
    }
    public String getInfo(){
        String cadena;
        cadena = String.format("Cancion: %s%nAlbum: %s%nArtista: %s%nAño : %d%nDuracion: %d%n",
                this.cancion, this.album, this.artista, this.año, this.duracion);
        
        return cadena;
    }
}
