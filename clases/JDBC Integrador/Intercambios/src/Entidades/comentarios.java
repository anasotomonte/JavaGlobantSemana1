package Entidades;

public class comentarios {
    
    int id_comentario;
    int id_casa;
    String comentario;
    
    public comentarios() {
    }

    public comentarios(int id_casa, String comentario) {
        this.id_casa = id_casa;
        this.comentario = comentario;
    }

    public int getId_comentario() {
        return id_comentario;
    }

    public int getId_casa() {
        return id_casa;
    }

    public void setId_casa(int id_casa) {
        this.id_casa = id_casa;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "comentarios [id_comentario=" + id_comentario + ", id_casa=" + id_casa + ", comentario=" + comentario
                + "]";
    }

    
}
