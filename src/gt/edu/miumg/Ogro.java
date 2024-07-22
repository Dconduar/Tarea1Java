package gt.edu.miumg;

public class Ogro extends Personaje implements Villano{
    @Override
    public void mostrarPoder() {

    }

    @Override
    public int mostrarVida() {
        return 0;
    }

    @Override
    public void desplazarse() {

    }

    @Override
    public void atacar() {

    }

    @Override
    public void destruir() {

    }
    public int fuerza;

    public void movimiento(){

    }
    public Ogro(String nombre, String descripcion, int poder, int vida, long tamano, int fuerza){
        super(nombre,descripcion,poder,vida,tamano);
        this.fuerza = fuerza;
    }
}
