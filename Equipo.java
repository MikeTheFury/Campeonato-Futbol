import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String sede;
    private String pais;
    private String estadio;
    private String fecha;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nom, String se, String pa, String es, String fe) { // Constructor de objetos.
        this.nombre = nom;
        this.sede = se;
        this.pais = pa;
        this.estadio = es;
        this.fecha = fe;
        this.jugadores = new ArrayList<>();
    }

    public void ficharJugador() { // Este método crea jugadores con datos aleatorios y los asigna a los equipos.
        String nombre[] = { "Raúl", "Ronaldo", "Guti", "Rafa", "Paco", "Marcos", "Johan", "Max", "Insulayah",
                "Evaristo", "Pepón", "Graham", "Thomas", "Ayrton", "Miguel","Iker","Vladimir","Juan Carlos","Curro","El Bicho" };
        String apellido[] = { "Gómez", "Alonso", "El pernales", "Sánchez ", "Terredos", "Jackson", "Epstein", "Popeye",
                "Ibrahim", "Putin", "Pla", "Zubizarreta", "Thomas", "ben Sulayem", "Archuleta","Zapatero","Bush","Nixon","Reagan"};
        String pais[] = { "España", "Mónaco", "Islas Caimán", "Belice", "Inglaterra", "Irlanda", "Bolivia", "Somalia" };

        for (int i = 0; i <= 10; i++) {
            int probap = (int) (Math.random() * apellido.length + 0);
            int probnom = (int) (Math.random() * nombre.length + 0);
            int edad1 = (int) (Math.random() * (35 - 15) + 15);
            int nac = (int) (Math.random() * pais.length + 0);
            String nacionalidad = pais[nac];
            String nombre1 = nombre[probnom] + " " + apellido[probap];

            jugadores.add(new Jugador(nombre1, edad1, nacionalidad));
        }

    }

    public String verJugadores() {
        return jugadores.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public String getSede() {
        return sede;
    }

    public String getPais() {
        return pais;
    }

    public String getEstadio() {
        return estadio;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void addJugador(Jugador j) {
        this.jugadores.add(j);
    }
    public String verDatos() {

         
        String texto =  "\n"+nombre;
        texto += "\nPAÍS:" + pais;
        texto += "\nESTADIO:" + estadio ;
        texto += "\nSEDE:" + sede;
        texto += "\nPAÍS:" + pais;
        texto += "\nFUNDACIÓN:" + fecha;

        return texto;
    }
    @Override
    public String toString() {

        String texto = "\nEQUIPO: ";
        texto += "\nNOMBRE: " + nombre;
        texto += "\nPAÍS:" + pais;
        texto += "\nESTADIO:" + estadio + " \n";

        return texto;
    }
}
