package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Gui_yakim { //2.38 kb
    private static int iter = 1;
    private JTextArea output;
    private JTextField input;
    private JButton sendButton;

    private Gui_yakim() {
        output = new JTextArea( "Level 1. Write number 1 ", 20, 10 );
        input = new JTextField( 20 );
        sendButton = new JButton( "Restart" );
    }

    public static void main(String[] args) {
        Gui_yakim yakim = new Gui_yakim();
        yakim.begins();
    }

    private void begins() {
        JFrame frame = new JFrame( "Prototip" );
        frame.setLayout( new BorderLayout() );
        frame.add( output, BorderLayout.CENTER );
        frame.add( input, BorderLayout.SOUTH );

        Font font = new Font( "Arial", Font.PLAIN, 15 );
        output.setFont( font );
        Color yellow = new Color( 212, 172, 13 );
        Color gray1 = new Color( 123, 125, 125 );
        Color gray2 = new Color( 151, 154, 154 );
        output.setBackground( gray1 );
        output.setForeground( yellow );
        input.setBackground( gray2 );
        input.setForeground( Color.WHITE );

        JPanel buttonpanel = new JPanel();
        buttonpanel.setLayout( new GridLayout( 1, 1 ) );
        buttonpanel.add( sendButton );

        frame.add( buttonpanel, BorderLayout.EAST );
        input.addActionListener( new Nums() );
        sendButton.addActionListener( new Restarts() );
        frame.setSize( 400, 300 );
        frame.setVisible( true );
        frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        frame.setAlwaysOnTop( true );
        frame.setLocationRelativeTo( null );
        output.setEditable( false );
    }

    private class Nums implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Random random = new Random();
            int target = random.nextInt( iter ) + 1;
            iter++;

            Integer keyValue = Integer.parseInt( input.getText() );
            String temp = String.format( "Level %s. Write number at 1 to %s ", iter, iter );

            if (keyValue == target) {
                output.append( "........" + keyValue + " - Good! \n" );
                output.append( temp );
                input.setText( "" );
            } else {
                output.append( "........" + keyValue + " - Game over! \n" );
                output.append( "Answer : " + target );
                output.setText( null );
                input.setText( "" );
            }
        }
    }

    private class Restarts implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            output.setText( null );
            output.setText( "Level 1. Write number 1 " );
            input.addActionListener( new Nums() );
        }
    }
}