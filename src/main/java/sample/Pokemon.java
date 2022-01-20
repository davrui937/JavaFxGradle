package sample;

import javafx.scene.image.Image;

public class Pokemon{

    private int nivel;
    private String nombre;
    private int vidamax;
    private int vidaact;
    private Image imagen;
    private Image imagenpelea;
    public Pokemon(int nivel, String nombre, int vidamax, int vidaact, Image imagen, Image imagenpelea) {
        this.nivel = nivel;
        this.nombre = nombre;
        this.vidamax = vidamax;
        this.vidaact = vidaact;
        this.imagen = imagen;
        this.imagenpelea=imagenpelea;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidamax() {
        return vidamax;
    }

    public void setVidamax(int vidamax) {
        this.vidamax = vidamax;
    }

    public int getVidaact() {
        return vidaact;
    }

    public void setVidaact(int vidaact) {
        this.vidaact = vidaact;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public Image getImagenpelea() {
        return imagenpelea;
    }

    public void setImagenpelea(Image imagenpelea) {
        this.imagenpelea = imagenpelea;
    }



    public void curacion(Pokemon pokemon){
        pokemon.setVidaact((int) (pokemon.getVidaact()+ Math.random()*50 + 25));
        if(pokemon.vidaact>pokemon.vidamax){pokemon.vidaact=pokemon.vidamax;}
    }


    public void ataqueseguro(Pokemon enemigo){
        enemigo.setVidaact(enemigo.getVidaact()-20);
    }

    public void ataquepocoseguro(Pokemon enemigo){
        enemigo.setVidaact((int) (enemigo.getVidaact()- (Math.random()*15 + 10)));
    }

    public void ataquenadaseguro(Pokemon enemigo){
        enemigo.setVidaact((int) (enemigo.getVidaact()- Math.random()*51 + 0));
    }

    public boolean estavivo(Pokemon pokemon){
        boolean vivo=true;
        if (pokemon.vidaact<=0){
            pokemon.vidaact=0;
            vivo=false;
        }
        return vivo;
    }
}
