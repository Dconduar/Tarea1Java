package gt.edu.miumg;

public class Elfo extends Personaje implements Heroe {
    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }

    @Override
    public int mostrarVida() {
        return 0;
    }

    @Override
    public void desplazarse() {

    }

    @Override
    public void mostrarPoder() {

    }

    @Override
    public void recibirAtaque() {

    }
    public Elfo(String nombre, String descripcion, long tamano, int poder, int vida){
        super(nombre,descripcion,poder,vida,tamano);
    }
}
