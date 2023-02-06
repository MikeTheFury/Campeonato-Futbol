import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;

public class Partido extends PartidoPrevisto {
    private int gollocal;
    private int golvisitante;
    
    public Partido (int n, Equipo eql, Equipo eqv,LocalDate fe, LocalTime h) {
        super(n,eql,eqv,fe,h);
        
        this.gollocal = 0;
        this.golvisitante = 0;
    }
    

    public void jugarPartido() {
        this.gollocal = (int) (Math.random() * 6 + 0);
        this.golvisitante = (int) (Math.random() * 6 + 0);

    }

    @Override
    public String toString() {
        String texto = "\nRESULTADO PARTIDO nº" + numero + ": ";

        texto += "\nLOCAL: " + equipolocal.getNombre() + "- " + gollocal;
        texto += "\nVISITANTE: " + equipovisitante.getNombre() + "- " + golvisitante;
        texto += "\nESTADIO: " + equipolocal.getEstadio() + " \n";

        return texto;
    }

    public int getGollocal() {
        return gollocal;
    }

    public void setGollocal(int gollocal) {
        this.gollocal = gollocal;
    }

    public int getGolvisitante() {
        return golvisitante;
    }

    public int getNumero() {
        return numero;
    }

    public Equipo getEquipolocal() {
        return equipolocal;
    }

    public Equipo getEquipovisitante() {
        return equipovisitante;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setGolvisitante(int golvisitante) {
        this.golvisitante = golvisitante;
    }

}
