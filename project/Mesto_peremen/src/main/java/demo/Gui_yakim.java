package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Gui_yakim {
    private JTextArea output;
    private JTextField input;
    private JButton sendButton;

    public Gui_yakim() {
        output = new JTextArea( "Level 1 write number at 1 to 1: ", 20,10);
        input = new JTextField( 20 );
        sendButton = new JButton( "Start" );
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
    public static void main(String[] args) {
        Gui_yakim yakim = new Gui_yakim();
        yakim.begins();
    }

    private class Nums implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Random rn = new Random();

            int aa = rn.nextInt( 1 ) + 1;
            int ab = rn.nextInt( 2 ) + 1;
            String a = Integer.toString( aa );
            String b = Integer.toString( ab );
            String local1 = input.getText();
            if (local1.equals( a )) {
                output.append( local1 +"\n"+"GOOD & level 2: ");
                input.setText( "" );
                String local2 = input.getText();
                if (local2.equals( b )) {
                    output.append( local2+"\n"+"VERY GOOD" );
                } else
                    output.append( "GAME OVER" );
            } else
                output.append( "GAME OVER" );
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

