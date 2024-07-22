package gt.edu.miumg;

public class Humano extends Personaje implements Heroe {
    @Override
    public void defender() {

    }

    @Override
    public void desplazarse() {

    }

    @Override
    public void atacar() {

    }

    @Override
    public void mostrarPoder() {

    }

    @Override
    public void recibirAtaque() {

    }

    @Override
    public int mostrarVida() {
        return 0;
    }
    public String genero;

    public void respirar(){

    }

    public Humano(String nombre,  String descripcion, long tamano, int poder, int vida, String genero ){
        super(nombre,descripcion,poder,vida,tamano);
        this.genero = genero;
    }

}
