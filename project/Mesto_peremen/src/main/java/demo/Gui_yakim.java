package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Gui_yakim { //2.4 kb
    private JTextArea output;
    private JTextField input;
    private JButton sendButton;

    public Gui_yakim() {
        output = new JTextArea( 20, 10 );
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

        frame.pack();
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

            for (int i = 1; i < 10; i++) {
                String keyValues = input.getText();
                output.append( String.format( "LEVEL %s : " + keyValues, i ) );
                int keyValue = Integer.parseInt( keyValues );

                int randomValue = random.nextInt( i ) + 1;
                if (keyValue == randomValue) {
                    output.append( " GOOD " );
                    output.append( "\n" );
                    try {
                        Thread.sleep( 800 );
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                } else {
                    output.append( " GAME OVER " + "\n" );
                    output.append( "ANSWER: " + randomValue + "\n" );
                    input.setText( "" );
                    break;
                }
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

