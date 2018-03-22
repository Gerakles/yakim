package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Gui_yakim { //2.4 kb
    private static int iter = 1;
    private JTextArea output;
    private JTextField input;
    private JButton sendButton;

    public Gui_yakim() {
        output = new JTextArea( "Level 1. Write number at 1 ",20, 10 );
        input = new JTextField( 20 );
        sendButton = new JButton( "Start" );
    }

    public static void main(String[] args) {
        Gui_yakim yakim = new Gui_yakim();
        yakim.begins();
    }

    public void begins() {
        JFrame frame = new JFrame( "Prototip" );
        frame.setLayout( new BorderLayout() );
        frame.add( output, BorderLayout.CENTER );
        frame.add( input, BorderLayout.SOUTH );

        JPanel buttonpanel = new JPanel();
        buttonpanel.setLayout( new GridLayout( 1, 1 ) );
        buttonpanel.add( sendButton );

        frame.add( buttonpanel, BorderLayout.EAST );
        input.addActionListener( new Nums() );
        sendButton.addActionListener( new SendHandler() );
        frame.setSize( 400, 300 );
        frame.setVisible( true );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
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
            String temp = String.format( "Leve %s. Write number at 1 to %s ", iter, iter );

            if (keyValue == target) {
                output.append( "........" + keyValue + " - Good! \n" );
                output.append( temp );
                input.setText( "" );
            } else {
                output.append( "........" + keyValue + " - Game over! \n" );
                output.append( "Answer : " + target );
            }
        }
    }

    private class SendHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = input.getText();
            output.append( message + "\n" );
            input.setText( "" );
        }
    }
}