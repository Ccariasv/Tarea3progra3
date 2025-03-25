package GestionTurnos;

import java.util.LinkedList;
import java.util.Queue;

public class GestionTurnos {


    public Queue<Integer> colaTurnos;
    private int numeroTurnoActual;

    public GestionTurnos() {
        this.colaTurnos = new LinkedList<>();
        this.numeroTurnoActual = 1;
    }

    public void agregarTurno() {
        colaTurnos.add(numeroTurnoActual);
        numeroTurnoActual++;
    }

    public void atenderTurno() {
        if (!colaTurnos.isEmpty()) {
            int turnoAtendido = colaTurnos.poll();
        } else {
        }
    }

}
