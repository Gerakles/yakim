import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    private JLabel label;
    private JButton newGame;
    private JButton restartGame;
    private JFrame frame;
    private JPanel mainPanel;
    private JPanel buttonsPanel;
    private JTextField input;
    private JTextArea textArea;

    private static String playerName;
    private final String textFile = "src/game/res/score.txt";

    Window() {
        frame = new JFrame("Prototype");
        frame.setSize(500, 300);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        restartGame = new JButton("RESTART GAME");

        newGame = new JButton("NEW GAME");
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("введите имя игрока");
                playerName = name;
                label.setText("player " + playerName);
                setVisionItems(true);
            }
        });

        buttonsPanel = new JPanel(new BorderLayout());
        buttonsPanel.setLayout( new GridLayout( 1,2 ) );
        buttonsPanel.add(newGame);
        frame.add(buttonsPanel, BorderLayout.NORTH);

        input = new JTextField(20);
        frame.add(input, BorderLayout.SOUTH);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        label = new JLabel("");
        textArea = new JTextArea(10,50);
        textArea.setBackground(Color.PINK);
        mainPanel.add(label, BorderLayout.NORTH);
        mainPanel.add(textArea, BorderLayout.SOUTH);

        frame.add(mainPanel, BorderLayout.CENTER);

    }

    private void start() {
        setVisionItems(false);
    }

    private void setVisionItems(boolean flag) {
        label.setVisible(flag);
        input.setVisible(flag);
        textArea.setVisible(flag);

        if (flag) {
            buttonsPanel.add(restartGame);
        }
    }

    public static void main(String[] args) {
        new Window().start();
    }
}