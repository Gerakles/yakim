import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Gui_yakim { //4.84 kb
    private static int iter = 1;
    private static String playerName;
    private final String textFile = "Yakim/src/main/java/res/Gui.txt";
    private JTextArea output;
    private JTextField input;
    private JButton newGame;
    private JButton restart;
    private JFrame frame;
    private JLabel label;
    private JPanel buttonsPanel;
    private JPanel mPanel;

    private Gui_yakim() {
        frame = new JFrame( "Prototip" );
        frame.setSize( 350, 300 );
        frame.setVisible( true );
//        frame.setResizable( false );
        frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        frame.setLocationRelativeTo( null );
        frame.setLayout( new BorderLayout() );
        //frame.setAlwaysOnTop( true );

        Color yellow = new Color( 212, 172, 13 );
        Color gray1 = new Color( 123, 125, 125 );

        restart = new JButton( "" );
        newGame = new JButton( "" );
        restart.setBorderPainted( false );
        restart.setFocusPainted( false );
        restart.setBackground( gray1 );
        newGame.setBorderPainted( false );
        newGame.setFocusPainted( false );
        newGame.setBackground( gray1 );
        restart.setIcon( new ImageIcon( "Yakim/src/main/java/res/n.png" ) );
        newGame.setIcon( new ImageIcon( "Yakim/src/main/java/res/s.png" ) );
        newGame.addActionListener( e -> {
            playerName = JOptionPane.showInputDialog( "Write your NickName" );
            output.setText( "Player " + playerName+"\nLevel 1. Write number 1 " );
            setVisionItems( true );
        } );

        buttonsPanel = new JPanel( new BorderLayout() );
        buttonsPanel.setLayout( new GridLayout( 1, 2 ) );
        buttonsPanel.add( newGame );
        frame.add( buttonsPanel, BorderLayout.NORTH );

        input = new JTextField( 20 );
        input.setBackground( gray1 );
        input.setForeground( Color.WHITE );
        frame.add( input, BorderLayout.SOUTH );

        mPanel = new JPanel();
        mPanel.setLayout( new BorderLayout() );

        //label = new JLabel( "" );
        output = new JTextArea();
        Font font = new Font( "Arial", Font.PLAIN, 15 );
        output.setFont( font );
        output.setBackground( gray1 );
        output.setForeground( yellow );

        //mPanel.add( label, BorderLayout.NORTH );
        mPanel.add( output, BorderLayout.CENTER );
        frame.add( mPanel, BorderLayout.CENTER );
    }

    public static void main(String[] args) {
        new Gui_yakim().start();
    }

    private void start() {
        setVisionItems( false );
        input.addActionListener( new Nums() );
        restart.addActionListener( new Restarts() );
    }

    private void setVisionItems(boolean pass) {
        //label.setVisible( pass );
        input.setVisible( pass );
        output.setVisible( pass );

        if (pass) {
            buttonsPanel.add( restart, BorderLayout.EAST );
        }
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
                input.setEnabled( false );
            }
        }
    }

    private class Restarts implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            output.setText( "Player " + playerName+"\nLevel 1. Write number 1 " );
            input.setEnabled( true );
            iter = 1;
        }
    }
}
//    private class BestScore implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            output.setText( "New player is\n" );
//            input.setEnabled( true );
//            String name = input.getText();
//            try {
//                TextReader.NewP( "Yakim/src/main/java/res/Gui.txt", "\n" + name + " " + iter );
//            } catch (FileNotFoundException ep) {
//                ep.printStackTrace();
//            }
//        }
//    }