import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.Random;

public class Gui_yakim { //3.62 kb
    private static int iter = 1;
    private JTextArea output;
    private JTextField input;
    private JButton sendButton;
    private JButton newPlayer;

    private Gui_yakim() {
        output = new JTextArea( "Level 1. Write number 1 ", 20, 10 );
        input = new JTextField( 20 );
        sendButton = new JButton( "" );
        newPlayer = new JButton( "" );
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
        output.setBackground( gray1 );
        output.setForeground( yellow );
        input.setBackground( gray1 );
        input.setForeground( Color.WHITE );
        sendButton.setBorderPainted( false );
        sendButton.setFocusPainted( false );
        sendButton.setBackground( gray1 );
        newPlayer.setBorderPainted( false );
        newPlayer.setFocusPainted( false );
        newPlayer.setBackground( gray1 );
        sendButton.setIcon( new ImageIcon( "Yakim/src/main/java/res/n.png" ) );
        newPlayer.setIcon( new ImageIcon( "Yakim/src/main/java/res/s.png" ) );

        JPanel buttonpanel = new JPanel();
        buttonpanel.setLayout( new GridLayout( 1, 2 ) );
        buttonpanel.add( sendButton );
        buttonpanel.add( newPlayer );
        frame.add( buttonpanel, BorderLayout.NORTH );
        input.addActionListener( new Nums() );
        newPlayer.addActionListener( new BestScore() );
        sendButton.addActionListener( new Restarts() );
        frame.setSize( 350, 300 );
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

            if (iter > 10) {
                Integer keyValue = Integer.parseInt( input.getText() );
                String temp = String.format( "Level %s. Write number at 1 to %s ", iter, iter );

                if (keyValue == target) {
                    output.append( "........" + keyValue + " - Good! \n" );
                    output.append( temp );
                    input.setText( "" );
                } else {
                    output.append( "........" + keyValue + " - Game over! \n" );
                    output.append( "Answer : " + target );
                    input.setEnabled( false );
                }
            }
        }
    }

    private class Restarts implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            output.setText( "Level 1. Write number 1 " );
            input.setEnabled( true );
            iter = 1;
        }
    }

    private class BestScore implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            output.setText( "New player is\n" );
            input.setEnabled( true );
            String name = input.getText();
            try {
                TextReader.NewP( "Yakim/src/main/java/res/Gui.txt", "\n" + name + " " + iter );
            } catch (FileNotFoundException ep) {
                ep.printStackTrace();
            }
        }
    }
}