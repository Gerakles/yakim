package Profesional.L10;

import L9.*;
import Profesional.L9.Bank;
import Profesional.L9.CheckingAccount;
import Profesional.L9.Costumer;
import Profesional.L9.SavingsAccount;

import javax.swing.*;

public class myBankATM  extends javax.swing.JFrame{  //14.356 kb
    public myBankATM() {
        initComponents();
    }
    @SuppressWarnings( "unchecked" )

    public static void main(String[] args) {

        Bank bank = Bank.getBank();
        Costumer first = new Costumer( "John", "Doe" );
        Costumer second = new Costumer( "Jane","Doe" );
        SavingsAccount johnSaving = new SavingsAccount( 1000, 7 );
        CheckingAccount johnAccount = new CheckingAccount( 5000, 1000 );
        CheckingAccount janeAccount = new CheckingAccount( 500, 100 );
        first.addAccount( johnSaving );
        first.addAccount( johnAccount );
        second.addAccount( janeAccount );

        java.awt.EventQueue.invokeLater( new Runnable() {
            @Override
            public void run() {
                new myBankATM().setVisible( true );
            }
        } );
    }

    private void initComponents() {
    }

    private JPanel panel1;
    private JButton balanceButton;
    private JButton withdrawButton;
    private JTextField amountField;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton fourButton;
    private JButton sevenButton;
    private JButton zeroButton;
    private JButton enterButton;
    private JButton eithButton;
    private JButton dummybutton;
    private JButton nineButton;
    private JButton sixButton;
    private JButton fiveButton;
    private JTextArea historyArea;
    private JTextField statusField;
    private JButton depositButton;
}

