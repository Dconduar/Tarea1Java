package gt.edu.miumg;

public class Enano extends Personaje implements Heroe {
    @Override
    public void recibirAtaque() {

    }

    @Override
    public void mostrarPoder() {

    }

    @Override
    public void desplazarse() {

    }

    @Override
    public int mostrarVida() {
        return 0;
    }

    @Override
    public void atacar() {

    }
    public int percepcion;

    public void empatia(){

    }

    @Override
    public void defender() {

    }
    public Enano(String nombre,  String descripcion, long tamano, int poder, int vida, int percepcion ){
        super(nombre,descripcion,poder,vida,tamano);
        this.percepcion = percepcion;
    }
}

