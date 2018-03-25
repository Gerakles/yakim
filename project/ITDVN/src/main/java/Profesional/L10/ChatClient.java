package Profesional.L10;

import java.awt.*;
import javax.swing.*;

public class ChatClient {
    private JTextArea output;
    private JTextField input;
    private JButton sendButton;
    private JButton quitButtoun;

    public ChatClient() {
        this.output = new JTextArea( 10, 50 );
        this.input = new JTextField( 50 );
        this.sendButton = new JButton( "Send" );
        this.quitButtoun = new JButton( "Quite" );
    }

    public void launchFrame() {
        JFrame frame = new JFrame( "Bank chat room" );
        frame.setLayout( new BorderLayout() );

        frame.add( output, BorderLayout.CENTER );
        frame.add( input, BorderLayout.SOUTH );

        JPanel buttonPanel = new JPanel(  );
        buttonPanel.setLayout( new GridLayout( 2,1 ) );

        buttonPanel.add( sendButton );
        buttonPanel.add( quitButtoun );

        frame.add( buttonPanel,BorderLayout.EAST );

        frame.pack();
        frame.setVisible( true );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    public static void main(String[] args) {
        ChatClient myChat = new ChatClient();
        myChat.launchFrame();
    }
}
