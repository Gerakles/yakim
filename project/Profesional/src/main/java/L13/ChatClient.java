package L13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.net.*;
import java.io.*;

public class ChatClient { //1.75 kb
    private JTextArea output;
    private JTextField input;
    private JButton sendButton;
    private JButton quitButtoun;

    private Socket connection = null;
    private BufferedReader serverIn = null;
    private PrintStream serverOut = null;

    public ChatClient() {
        this.output = new JTextArea( 10, 50 );
        this.input = new JTextField( 50 );
        this.sendButton = new JButton( "Send" );
        this.quitButtoun = new JButton( "Quite" );
    }

    private void doConect() {
        String serverIP = System.getProperty( "serverIP", "127.0.0.1" );
        String serverPort = System.getProperty( "serverPort", "2000" );

        try {
            connection = new Socket( serverIP, Integer.parseInt( serverPort ) );
            InputStream is = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader( is );
            serverIn = new BufferedReader( isr );
            serverOut = new PrintStream( connection.getOutputStream() );
            Thread t = new Thread( new RemoteReader() );
            t.start();
        } catch (Exception e) {
            System.err.println( "ERROR: unable to connect to server!" );
            e.printStackTrace();
        }
    }

    public void launchFrame() {
        JFrame frame = new JFrame( "Bank chat room" );
        frame.setLayout( new BorderLayout() );

        frame.add( output, BorderLayout.CENTER );
        frame.add( input, BorderLayout.SOUTH );

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout( new GridLayout( 2, 1 ) );
        buttonPanel.add( sendButton );
        buttonPanel.add( quitButtoun );

        frame.add( buttonPanel, BorderLayout.EAST );
        input.addActionListener( new SendHandler() );
        sendButton.addActionListener( new SendHandler() );
        quitButtoun.addActionListener( e -> System.exit( 0 ) );

        frame.pack();
        frame.setVisible( true );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setAlwaysOnTop( true );
        frame.setLocationRelativeTo( null );
        output.setEditable( false );

        doConect();
    }
    public static void main(String[] args) {
        ChatClient myChat = new ChatClient();
        myChat.launchFrame();
    }

    private class SendHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String message = input.getText();
            //output.append( message + "\n" );
            serverOut.print( "New message: " + message +"\n");
            input.setText( "" );
        }
    }

    private class RemoteReader implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    String nextLine = serverIn.readLine();
                    output.append( nextLine+"\n" );
                }
            } catch (Exception e) {
                System.err.println( "ERROR: can't read from the server");
                e.printStackTrace();
            }
        }
    }
}
