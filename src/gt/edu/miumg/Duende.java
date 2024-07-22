package gt.edu.miumg;

public class Duende extends Personaje implements Villano{
    @Override
    public void destruir() {

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
    public int mostrarVida() {
        return 0;
    }
    public int velocidad;
    public void movimiento(){

    }
    public Duende(String nombre, String descripcion, int poder, int velocidad, long tamano, int vida){
        super(nombre,descripcion,poder,vida,tamano);
        this.velocidad = velocidad;
    }

}

