package GestionTurnos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionTurnosGUI {

    private GestionTurnos gestionTurnos;
    private JFrame frame;
    private JTextArea textArea;
    private JButton btnAgregar, btnAtender, btnMostrar;

    public GestionTurnosGUI() {
        gestionTurnos = new GestionTurnos();
        frame = new JFrame("Gestión de Turnos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        btnAgregar = new JButton("Agregar Turno");
        btnAtender = new JButton("Atender Turno");

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionTurnos.agregarTurno();
                actualizarLista();
            }
        });

        btnAtender.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionTurnos.atenderTurno();
                actualizarLista();
            }
        });


        frame.add(btnAgregar);
        frame.add(btnAtender);
        frame.add(scrollPane);
        frame.setVisible(true);
    }

    private void actualizarLista() {
        textArea.setText("");
        textArea.append("Turnos en espera: " + gestionTurnos.colaTurnos.toString());
    }

    public static void main(String[] args) {
        new GestionTurnosGUI();
    }
}