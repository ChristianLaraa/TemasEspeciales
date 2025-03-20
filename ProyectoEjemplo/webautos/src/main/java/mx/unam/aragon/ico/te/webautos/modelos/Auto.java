package mx.unam.aragon.ico.te.webautos.controladores.modelos;

public class Auto {
    public Auto() {

    }
    private String marca;
    private String descripcion;
    private String urlFoto;
    private String urlDetalle;

    public String marca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String descripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String urlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String urlDetalle() {
        return urlDetalle;
    }

    public void setUrlDetalle(String urlDetalle) {
        this.urlDetalle = urlDetalle;
    }
}