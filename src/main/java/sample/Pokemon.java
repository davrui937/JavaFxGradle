package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Objects;

public class Pokemon{

    private int nivel;
    private String nombre;
    private int vidamax;
    private int vidaact;
    private Image imagen;
    private Image imagenpelea;
    private String efecto;
    private Image estado;

    public Pokemon(int nivel, String nombre, int vidamax, int vidaact, Image imagen, Image imagenpelea, Image estado, String efecto) {
        this.nivel = nivel;
        this.nombre = nombre;
        this.vidamax = vidamax;
        this.vidaact = vidaact;
        this.imagen = imagen;
        this.imagenpelea=imagenpelea;
        this.estado=estado;
        this.efecto=efecto;
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

    public Image getImagen() {return imagen;}

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public Image getImagenpelea() {
        return imagenpelea;
    }

    public void setImagenpelea(Image imagenpelea) {
        this.imagenpelea = imagenpelea;
    }

    public Image getEstado() {
        return estado;
    }

    public void setEstado(Image estado) {
        this.estado = estado;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public void curacion(Pokemon pokemon){
        pokemon.setVidaact((int) (pokemon.getVidaact()+ Math.random()*50 + 25));
        if(pokemon.vidaact>pokemon.vidamax){pokemon.vidaact=pokemon.vidamax;}

    }


    public void ataqueseguro(Pokemon enemigo){
        enemigo.setVidaact(enemigo.getVidaact()-20);
        if(Objects.equals(enemigo.getEfecto(), "fuego")){
            enemigo.setVidaact(enemigo.getVidaact()-10);
            System.out.println("El fuego hace que reciba un 50% mas de daño");
        }

    }

    public int ataquepocoseguro(Pokemon enemigo){
        int dano = (int) (Math.random()*15 + 10);
        enemigo.setVidaact((enemigo.getVidaact()-dano));

        if(Objects.equals(enemigo.getEfecto(), "fuego")){
            enemigo.setVidaact(enemigo.getVidaact()-(dano/2));
            System.out.println("El fuego hace que reciba un 50% mas de daño");
        }

        if(Objects.equals(enemigo.getEfecto(), "frio")){
            return dano/2;
        }
        return 0;
    }

    public int ataquenadaseguro(Pokemon enemigo){
        int dano = (int) (Math.random()*51 + 0);
        enemigo.setVidaact( (enemigo.getVidaact()- dano));

        if(Objects.equals(enemigo.getEfecto(), "fuego")){
            enemigo.setVidaact(enemigo.getVidaact()-(dano/2));
            System.out.println("El fuego hace que reciba un 50% mas de daño");
        }

        if(Objects.equals(enemigo.getEfecto(), "frio")){
            return dano/2;
        }
        return 0;
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
