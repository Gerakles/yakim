import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Gui_yakim { //6.24 kb
    private static int iter = 1;
    private static String playerName;
    private static Audio gameOver;
    private static Audio applause;
    private final String textFile = "Yakim/src/main/java/res/Gui.txt";
    private JTextArea output;
    private JTextField input;
    private JButton newGame;
    private JButton restart;
    private JFrame frame;
    private JPanel buttonsPanel;
    private JPanel mPanel;

    private Gui_yakim() {
        Color yellow = new Color(212, 172, 13);
        Color gray1 = new Color(123, 125, 125);

        frame = new JFrame("Prototip");
        frame.setSize(350, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        restart = new JButton("");
        newGame = new JButton("");
        restart.setBorderPainted(false);
        restart.setFocusPainted(false);
        restart.setBackground(gray1);
        newGame.setBorderPainted(false);
        newGame.setFocusPainted(false);
        newGame.setBackground(gray1);
        restart.setIcon(new ImageIcon("Yakim/src/main/java/res/n.png"));
        newGame.setIcon(new ImageIcon("Yakim/src/main/java/res/s.png"));
        newGame.addActionListener(e -> {
            playerName = JOptionPane.showInputDialog("Write your NickName");
            output.setText("Player " + playerName + "\nLevel 1. Write number 1 ");
            setVisionItems(true);
        });

        buttonsPanel = new JPanel(new BorderLayout());
        buttonsPanel.setLayout(new GridLayout(1, 2));
        buttonsPanel.add(newGame);
        frame.add(buttonsPanel, BorderLayout.NORTH);

        input = new JTextField(20);
        input.setBackground(gray1);
        input.setForeground(Color.WHITE);
        frame.add(input, BorderLayout.SOUTH);

        mPanel = new JPanel();
        mPanel.setLayout(new BorderLayout());

        output = new JTextArea();
        Font font = new Font("Arial", Font.PLAIN, 15);
        output.setFont(font);
        output.setBackground(gray1);
        output.setForeground(yellow);

        mPanel.add(output, BorderLayout.CENTER);
        frame.add(mPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Gui_yakim().start();
    }

    private void start() {
        setVisionItems(false);
        input.addActionListener(new Nums());
        restart.addActionListener(new Restarts());
    }

    private void setVisionItems(boolean pass) {
        input.setVisible(pass);
        output.setVisible(pass);

        if (pass) {
            buttonsPanel.add(restart, BorderLayout.EAST);
        }
    }

    private class Nums implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            applause = new Audio("Yakim/src/main/java/res/applause.wav", 1);
            gameOver = new Audio("Yakim/src/main/java/res/Game_over.wav", 1);
            Random random = new Random();
            int target = random.nextInt(iter) + 1;
            iter++;

            Integer keyValue = Integer.parseInt(input.getText());
            String temp = String.format("Level %s. Write number at 1 to %s ", iter, iter);

            if (keyValue == target) {
                output.append("........" + keyValue + " - Good! \n");
                output.append(temp);
                applause.sounds();
                applause.setVolumes();
                input.setText("");
            } else {
                output.append("........" + keyValue + " - Game over! \n");
                gameOver.sounds();
                gameOver.setVolumes();
                output.append("Answer : " + target);
                input.setEnabled(false);
                input.setText("");
                //ScoreList.service.createUser(playerName, iter - 1);
                DB app = new DB();
                app.insert(playerName,iter-1);
            }
        }
    }

    private class Restarts implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            output.setText("Player " + playerName + "\nLevel 1. Write number 1 ");
            input.setEnabled(true);
            iter = 1;
        }
    }

    private class Audio {
        private String track;
        private Clip clip = null;
        private FloatControl volumes = null;
        private double wt;

        Audio(String track, double wt) {
            this.track = track;
            this.wt = wt;
        }

        private void sounds() {
            File file = new File(this.track);
            AudioInputStream ais = null;
            try {
                ais = AudioSystem.getAudioInputStream(file);
            } catch (UnsupportedAudioFileException | IOException e) {
                e.printStackTrace();
            }

            try {
                clip = AudioSystem.getClip();
                clip.open(ais);
                volumes = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

                clip.setFramePosition(0);
                clip.start();
            } catch (LineUnavailableException | IOException e) {
                e.printStackTrace();
            }
        }

        void setVolumes() {
            if (wt < 0) wt = 0;
            if (wt > 1) wt = 1;
            float min = volumes.getMinimum();
            float max = volumes.getMaximum();
            volumes.setValue((max - min) * (float) wt + min);
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