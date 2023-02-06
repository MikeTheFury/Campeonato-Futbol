public class Jugador{
    private String nombre;
    private int edad;
    private String nacionalidad;


    public Jugador(String nom, int ed,String nac){
        this.nombre=nom;
        this.edad=ed;
        this.nacionalidad=nac;    

    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    @Override
        public String toString() {

            String texto = "\nJUGADOR: ";
            texto += "\nNOMBRE: " + nombre;
            texto += "\nEDAD:" + edad;
            texto += "\nNACIONALIDAD:" + nacionalidad+" \n";
    
            return texto;
        }
    }


