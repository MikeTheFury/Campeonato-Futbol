import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Campeonato {
    private ArrayList<PartidoPrevisto> cuartos;
    private ArrayList<PartidoPrevisto> semifinales;
    private ArrayList<PartidoPrevisto> finales;
    private ArrayList<Partido> cuartosj;
    private ArrayList<Partido> semifinalesj;
    private ArrayList<Partido> finalesj;
    private ArrayList<Equipo> equipos;
    private ArrayList<Equipo> equiposse;
    private ArrayList<Equipo> equiposfi;

    public Campeonato() {
        this.cuartos = new ArrayList<>();
        this.semifinales = new ArrayList<>();
        this.finales = new ArrayList<>();
        this.equipos = crearEquipos();
        this.equiposse = new ArrayList<>();
        this.equiposfi = new ArrayList<>();
        this.cuartosj = new ArrayList<>();
        this.semifinalesj = new ArrayList<>();
        this.finalesj = new ArrayList<>();

    }

    public ArrayList<Equipo> crearEquipos() { // Este método crea los objetos equipo y ficha a los jugadores generados de manera aleatoria.
                                        
        ArrayList<Equipo> equipos = new ArrayList<>();
        equipos.add(new Equipo("Real Madrid", "Madrid", "España", "Santiago Bernabéu", "06/03/1902"));
        equipos.add(new Equipo("Juventus", "Turín", "Italia", "Allianz", "01/11/1897"));
        equipos.add(new Equipo("Manchester City", "Manchester", "Inglaterra", "Etihad Stadium", "23/11/1880"));
        equipos.add(new Equipo("Atlético de Madrid", "Madrid", "España", " Wanda Metropolitano", "26/04/1903"));
        equipos.add(new Equipo("Carcelén", "Carcelén", "España", "Prado del Pueblo", "01/01/1980"));
        equipos.add(new Equipo("Barcelona FC", "Barcelona", "España", "Camp Nou", "22/10/1899"));
        equipos.add(new Equipo("Valencia CF", "Valencia", "España", "Mestalla", "18/03/1919"));
        equipos.add(new Equipo("Albacete Balompié", "Albacete", "España", "Carlos Belmonte", "01/08/1940"));
        for (int i = 0; i < equipos.size(); i++) {
            equipos.get(i).ficharJugador();
        }
        return equipos;

    }

    public void verAlineación() { // Este método te devuelve el arraylist con los jugadores del equipo
                                  // seleccionado, o continua a la siguiente fase.

        Scanner tc = new Scanner(System.in);
        boolean out = false;
        while (out == false) {
            int op = 0;
            System.out.println( "\nIntroduce el número del equipo si quieres ver su alineación, pulsa 9 para jugar el campeonato");                  
            System.out.println("1.Real Madrid");
            System.out.println("2.Juventus");
            System.out.println("3.Manchester City");
            System.out.println("4.Atlético de Madrid");
            System.out.println("5.Carcelén");
            System.out.println("6.Barcelona FC");
            System.out.println("7.Valencia CF");
            System.out.println("8.Albacete Balompié");
            System.out.println("9.Crear campeonato");
            boolean repetir = true;
            do {
                try {
                    op = tc.nextInt();
                } catch (InputMismatchException e) {
                    tc.nextLine();
                    System.out.println("Introduce un número de los anteriores");
                }
                if (op >= 1 && op <= 9) {
                    repetir = false;
                }

            } while (repetir == true);
            switch (op) {

                case 1:
                    System.out.println("Real Madrid\n" + equipos.get(0).verJugadores());           
                    break;
                case 2:
                    System.out.println("Juventus\n" + equipos.get(1).verJugadores());                   
                    break;
                case 3:
                    System.out.println("Manchester City\n" + equipos.get(2).verJugadores());
                    break;
                case 4:
                    System.out.println("Atlético de Madrid\n" + equipos.get(3).verJugadores());
                    break;
                case 5:
                    System.out.println("Carcelén\n" + equipos.get(4).verJugadores());
                    break;
                case 6:
                    System.out.println("Barcelona FC\n" + equipos.get(5).verJugadores());
                    break;
                case 7:
                    System.out.println("Valencia CF\n" + equipos.get(6).verJugadores());           
                    break;
                case 8:
                    System.out.println("Albacete Balompié\n" + equipos.get(7).verJugadores());                   
                    break;
                case 9:
                    System.out.println("Se va a organizar el campeonato");
                    out = true;
                    break;
                default:
                    System.out.println("Tienes que elegir una de las opciones anteriores.");                  
                    break;
            }
        }
                
    }

    public void cuartosFinal() { // Este método devuelve un ArrayList con los emparejamientos para
                                                       // los cuartos de final.
        LocalDate fecha = LocalDate.of(2023, 8, 10);
        LocalTime hora = LocalTime.of(20, 00);

        Collections.shuffle(equipos);
        cuartos.add(new PartidoPrevisto(1, equipos.get(0), equipos.get(1), fecha, hora));
        cuartos.add(new PartidoPrevisto(2, equipos.get(2), equipos.get(3), fecha, hora));
        cuartos.add(new PartidoPrevisto(3, equipos.get(4), equipos.get(5), fecha, hora));
        cuartos.add(new PartidoPrevisto(4, equipos.get(6), equipos.get(7), fecha, hora));
        System.out.println("Se han planificado los cuartos de final");

        System.out.println("CUARTOS DE FINAL" + cuartos.toString());
       
    }

    public void jugarCuartos() { // Este método decide los resultados de los cuartos de final.

        cuartosj.add(new Partido(1, cuartos.get(0).getEquipolocal(), cuartos.get(0).getEquipovisitante(),
                cuartos.get(0).getFecha(), cuartos.get(0).getHora()));
        cuartosj.add(new Partido(2, cuartos.get(1).getEquipolocal(), cuartos.get(1).getEquipovisitante(),
                cuartos.get(1).getFecha(), cuartos.get(1).getHora()));
        cuartosj.add(new Partido(3, cuartos.get(2).getEquipolocal(), cuartos.get(2).getEquipovisitante(),
                cuartos.get(2).getFecha(), cuartos.get(2).getHora()));
        cuartosj.add(new Partido(4, cuartos.get(3).getEquipolocal(), cuartos.get(3).getEquipovisitante(),
                cuartos.get(3).getFecha(), cuartos.get(3).getHora()));
        avanZA();

        for (int i = 0; i < 4; i++) {
            cuartosj.get(i).jugarPartido();
            if (cuartosj.get(i).getGollocal() == cuartosj.get(i).getGolvisitante()) {
                int x = (int) (Math.random() * 1 + 0);
                if (x == 0) {
                    cuartosj.get(i).setGollocal(cuartosj.get(i).getGollocal() + 1);
                    String e = cuartosj.get(i).getEquipolocal().getNombre();
                    System.out.println("El " + e + " ha ganado en la prórroga");
                } else {
                    cuartosj.get(i).setGolvisitante(cuartosj.get(i).getGolvisitante() + 1);
                    String e = cuartosj.get(i).getEquipovisitante().getNombre();
                    System.out.println("El " + e + " ha ganado en la prórroga");
                }
            }
            if (cuartosj.get(i).getGollocal() > cuartosj.get(i).getGolvisitante()) {
                equiposse.add(cuartosj.get(i).getEquipolocal());
            } else {
                equiposse.add(cuartosj.get(i).getEquipovisitante());
            }
            System.out.println(cuartosj.get(i).toString());
        }
        
    }

    public void semiFinal() {// Este método devuelve un ArrayList con los emparejamientos para las
                                                   // semifinales.
        LocalDate fecha = LocalDate.of(2023, 8, 17);
        LocalTime hora = LocalTime.of(20, 00);
        semifinales.add(new PartidoPrevisto(5, equiposse.get(0), equiposse.get(1), fecha, hora));
        semifinales.add(new PartidoPrevisto(6, equiposse.get(2), equiposse.get(3), fecha, hora));
        System.out.println("Estos serán los partidos de la semifinal");
        System.out.println("\nSEMIFINALES\n" + semifinales);

    }

    public void jugarSemis() { // Este método decide los resultados de las semifinales.
        avanZA();
        semifinalesj.add(new Partido(5, semifinales.get(0).getEquipolocal(), semifinales.get(0).getEquipovisitante(),
                semifinales.get(0).getFecha(), semifinales.get(0).getHora()));
        semifinalesj.add(new Partido(6, semifinales.get(1).getEquipolocal(), semifinales.get(1).getEquipovisitante(),
                semifinales.get(1).getFecha(), semifinales.get(1).getHora()));
        for (int i = 0; i < 2; i++) {
            semifinalesj.get(i).jugarPartido();
            if (semifinalesj.get(i).getGollocal() == semifinalesj.get(i).getGolvisitante()) {
                int x = (int) (Math.random() * 1 + 0);
                if (x == 0) {
                    semifinalesj.get(i).setGollocal(semifinalesj.get(i).getGollocal() + 1);
                    String e = semifinalesj.get(i).getEquipolocal().getNombre();
                    System.out.println("El " + e + " ha ganado en la prórroga");
                } else {
                    semifinalesj.get(i).setGolvisitante(semifinalesj.get(i).getGolvisitante() + 1);
                    String e = semifinalesj.get(i).getEquipovisitante().getNombre();
                    System.out.println("El " + e + " ha ganado en la prórroga");
                }
            }
            if (semifinalesj.get(i).getGollocal() > semifinalesj.get(i).getGolvisitante()) {
                equiposfi.add(semifinalesj.get(i).getEquipolocal());
            } else {
                equiposfi.add(semifinalesj.get(i).getEquipovisitante());
            }
            System.out.println(semifinalesj.get(i).toString());
        }
    }

    public void laFinal() { // Este método devuelve un ArrayList con los emparejamientos para la final.   

        LocalDate fecha = LocalDate.of(2023, 8, 24);
        LocalTime hora = LocalTime.of(20, 00);
        finales.add(new PartidoPrevisto(7, equiposfi.get(0), equiposfi.get(1), fecha, hora));
        System.out.println("Esta será la gran final");
        System.out.println("\nFINAL\n" + finales);

    }

    public void jugarFinal() { // Este método decide el resultado de la final.
        avanZA();

        finalesj.add(new Partido(7, finales.get(0).getEquipolocal(), finales.get(0).getEquipovisitante(),
                finales.get(0).getFecha(), finales.get(0).getHora()));
        finalesj.get(0).jugarPartido();
        if (finalesj.get(0).getGollocal() == finalesj.get(0).getGolvisitante()) {
            int x = (int) (Math.random() * 1 + 0);
            if (x == 0) {
                finalesj.get(0).setGollocal(finalesj.get(0).getGollocal() + 1);
                String e = finalesj.get(0).getEquipolocal().getNombre();
                System.out.println("El " + e + " ha ganado en la prórroga");
            } else {
                finalesj.get(0).setGolvisitante(finalesj.get(0).getGolvisitante() + 1);
                String e = finalesj.get(0).getEquipovisitante().getNombre();
                System.out.println("El " + e + " ha ganado en la prórroga");
            }
        }
        if (finalesj.get(0).getGollocal() > finalesj.get(0).getGolvisitante()) {
            System.out.println(finalesj.get(0).getEquipolocal().getNombre()
                    + " ha ganado el campeonato, muchas felicidades a los jugadores por el triunfo");
            System.out.println(finalesj.get(0).toString());
            System.out.println("Datos del ganador:" + finalesj.get(0).getEquipolocal().verDatos());
            mVp(finalesj.get(0).getEquipolocal());
        } else {
            System.out.println(finalesj.get(0).getEquipovisitante().getNombre()
                    + " ha ganado el campeonato, muchas felicidades a los jugadores por el triunfo");
            System.out.println(finalesj.get(0).toString());
            System.out.println("Datos del ganador:" + finalesj.get(0).getEquipovisitante().verDatos());
            mVp(finalesj.get(0).getEquipovisitante());
        }

    }

    public void avanZA() {// Este método pregunta al usuario si quiere continuar con el campeonato, 
                          //debe introducir un 1 si quiere continuar.
        boolean repetir = false;
        do {
            try {
                Scanner tc = new Scanner(System.in);
                int x = 0;
                System.out.println("Introduce 1 para que se jueguen los partidos.");
                while (x != 1) {
                    x = tc.nextInt();
                    repetir = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir el número 1 para que el campeonato continue");
                repetir = true;
            }
        } while (repetir == true);

    }
   
    public void mVp(Equipo v) {//Este método elije un jugador aleatorio de el equipo ganador y lo nombra MVP del campeonato (Jugador más valioso)
        int probap = (int) (Math.random() * 10 + 0);
        System.out.println("\nEste es el MVP del campeonato:" + v.getJugadores().get(probap).toString() + " \n");

    }
    public ArrayList<PartidoPrevisto> getCuartos() {
        return cuartos;
    }

    public ArrayList<PartidoPrevisto> getSemifinales() {
        return semifinales;
    }

    public ArrayList<PartidoPrevisto> getFinales() {
        return finales;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

}