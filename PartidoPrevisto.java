import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class PartidoPrevisto  {
    private LocalDate fecha;
    private LocalTime hora;
    protected int numero;
    protected Equipo equipolocal;
    protected Equipo equipovisitante;
    public ArrayList<Equipo> equipos = new ArrayList<Equipo>();

    public PartidoPrevisto(int n,Equipo eql, Equipo eqv, LocalDate fe, LocalTime h) {
        this.numero = n;
        this.equipolocal = eql;
        this.equipovisitante = eqv;
        this.fecha=fe;
        this.hora=h;
        this.equipos=new ArrayList<>();
    }
    
    @Override
    public String toString() {

        String texto = "\nPARTIDO PREVISTO nº"+numero+": ";
       
        texto += "\nLOCAL:" + equipolocal.getNombre();
        texto += "\nVISITANTE:" + equipovisitante.getNombre();
        texto += "\nESTADIO:" + equipolocal.getEstadio();        
        texto += "\nFECHA:" + this.getFecha();
        texto += "\nHORA:" + this.getHora()+ " \n";
 
        return texto;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }
 }
      
    
