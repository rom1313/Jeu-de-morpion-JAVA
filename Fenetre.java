package xosimple;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.Component;
import java.util.Arrays;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Fenetre {

    private JFrame frame;

    private JPanel panel;

    private JButton case0;
    private JButton case1;
    private JButton case2;
    private JButton case3;
    private JButton case4;
    private JButton case5;
    private JButton case6;
    private JButton case7;
    private JButton case8;

    private JTextField inputj1;
    private JTextField inputj2;

    private JLabel score1;
    private JLabel score2;

    private JButton reset;

    private JLabel ctontour1;
    private JLabel ctontour2;


    private  PartieBean partie;





    /**
     * Create the application.
     */
    public Fenetre() {
        partie = new PartieBean();
        initialize();


    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 921, 622);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new CardLayout(0, 0));

        panel = new JPanel();
        panel.setBackground(Color.ORANGE);
        panel.setToolTipText("MonkeyDev Morpion");
        panel.setForeground(Color.WHITE);
        frame.getContentPane().add(panel, "name_66814250623100");
        panel.setLayout(null);

        JDesktopPane desktopPane = new JDesktopPane();
        desktopPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        desktopPane.setBackground(Color.BLACK);
        desktopPane.setBounds(749, 201, -732, -115);
        panel.add(desktopPane);

        JLabel lblNewLabel = new JLabel("Morpion");
        lblNewLabel.setFont(new Font("Bombing", Font.PLAIN, 85));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(279, 27, 313, 87);
        panel.add(lblNewLabel);

        JLabel lblNewLabel_2 = new JLabel("Joueur O :");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 39));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(10, 71, 192, 31);
        panel.add(lblNewLabel_2);

        inputj1 = new JTextField();
        inputj1.setBounds(38, 126, 117, 31);
        panel.add(inputj1);
        inputj1.setColumns(10);
        String input_nom_joueur1 = "Joueur O";
        JoueurBean j1 = new JoueurBean(input_nom_joueur1);
        partie.setJ1(j1);
        partie.setjCourant(j1);

        inputj1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j1.setNom(inputj1.getText());
                System.out.println("Nom entré par utilisateur " + inputj1.getText());
                // partie.setJ1(j1);
                //  partie.setjCourant(j1);
            }
        });

        inputj2 = new JTextField();
        inputj2.setColumns(10);
        inputj2.setBounds(748, 126, 117, 31);
        panel.add(inputj2);
        String input_nom_joueur2 = "Joueur X";
        JoueurBean j2 = new JoueurBean(input_nom_joueur2);
        partie.setJ2(j2);
        inputj2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j2.setNom(inputj2.getText());
                System.out.println("Nom entré par utilisateur " + inputj2.getText());
               // partie.setJ2(j2);
            }
        });

        case0 = new JButton("");
        case0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Boutton 0 appué par  " + partie.getjCourant().getNom());
              partie.remplirCase(0);
              partie.changerJoueurCourant();
              updateTonTour();
              remplirBtn(case0);
              verifSiMancheTermine();
            }
        });
        case0.setBounds(265, 168, 125, 118);
        panel.add(case0);

        case1 = new JButton("");
        case1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Boutton 1 appué par  " + partie.getjCourant().getNom());
                partie.remplirCase(1);
                partie.changerJoueurCourant();
                updateTonTour();
                remplirBtn(case1);
                verifSiMancheTermine();
            }
        });
        case1.setBounds(389, 168, 125, 118);
        panel.add(case1);

        case2 = new JButton("");
        case2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Boutton 2 appué par  " + partie.getjCourant().getNom());
                partie.remplirCase(2);
                partie.changerJoueurCourant();
                updateTonTour();
                remplirBtn(case2);
                verifSiMancheTermine();
            }
        });
        case2.setBounds(514, 168, 125, 118);
        panel.add(case2);

        case3 = new JButton("");
        case3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Boutton 3 appué par  " + partie.getjCourant().getNom());
                partie.remplirCase(3);
                partie.changerJoueurCourant();
                updateTonTour();
                remplirBtn(case3);
                verifSiMancheTermine();
            }
        });
        case3.setBounds(265, 285, 125, 118);
        panel.add(case3);

        case4 = new JButton("");
        case4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Boutton 4 appué par  " + partie.getjCourant().getNom());
                partie.remplirCase(4);
                partie.changerJoueurCourant();
                updateTonTour();
                remplirBtn(case4);
                verifSiMancheTermine();
            }
        });
        case4.setBounds(389, 285, 125, 118);
        panel.add(case4);

        case5 = new JButton("");
        case5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Boutton 5 appué par  " + partie.getjCourant().getNom());
                partie.remplirCase(5);
                partie.changerJoueurCourant();
                updateTonTour();
                remplirBtn(case5);
                verifSiMancheTermine();
            }
        });
        case5.setBounds(514, 285, 125, 118);
        panel.add(case5);

        case6 = new JButton("");
        case6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Boutton 6 appué par  " + partie.getjCourant().getNom());
                partie.remplirCase(6);
                partie.changerJoueurCourant();
                updateTonTour();
                remplirBtn(case6);
                verifSiMancheTermine();
            }
        });
        case6.setBounds(265, 401, 125, 118);
        panel.add(case6);

        case7 = new JButton("");
        case7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Boutton 7 appué par  " + partie.getjCourant().getNom());
                partie.remplirCase(7);
                partie.changerJoueurCourant();
                updateTonTour();
                remplirBtn(case7);
                verifSiMancheTermine();
            }
        });
        case7.setBounds(389, 401, 125, 118);
        panel.add(case7);

        case8 = new JButton("");
        case8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Boutton appué  8 par  " + partie.getjCourant().getNom());
                partie.remplirCase(8);
                partie.changerJoueurCourant();
                updateTonTour();
                remplirBtn(case8);
                verifSiMancheTermine();
            }
        });
        case8.setBounds(514, 401, 125, 118);
        panel.add(case8);

        JLabel lblNewLabel_1 = new JLabel("Score : ");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblNewLabel_1.setBounds(66, 221, 89, 31);
        panel.add(lblNewLabel_1);

        score1 = new JLabel("0");
        score1.setFont(new Font("Tahoma", Font.PLAIN, 25));
        score1.setHorizontalAlignment(SwingConstants.CENTER);
        score1.setBounds(76, 263, 60, 23);
        panel.add(score1);


        JLabel lblNewLabel_2_1 = new JLabel("Joueur X :");
        lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 39));
        lblNewLabel_2_1.setBounds(703, 71, 192, 31);
        panel.add(lblNewLabel_2_1);

        JLabel lblNewLabel_1_1 = new JLabel("Score : ");
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblNewLabel_1_1.setBounds(738, 221, 89, 31);
        panel.add(lblNewLabel_1_1);

        score2 = new JLabel("0");
        score2.setHorizontalAlignment(SwingConstants.CENTER);
        score2.setFont(new Font("Tahoma", Font.PLAIN, 25));
        score2.setBounds(749, 263, 60, 23);
        panel.add(score2);

        reset = new JButton("Reset");
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Notre Manche actuelle: " + Arrays.toString(partie.getManche()));
                partie.resetManche();
                partie.resetPartieBean();
                cleanAllBtn();
                cleanScore();
                cleanJoueurs();
            }
        });
        reset.setBounds(409, 549, 89, 23);
        panel.add(reset);

        ctontour1 = new JLabel("C'est ton tour !");
        ctontour1.setHorizontalAlignment(SwingConstants.CENTER);
        ctontour1.setFont(new Font("Tahoma", Font.PLAIN, 25));
        ctontour1.setBounds(29, 319, 173, 41);
        panel.add(ctontour1);
        ctontour1.setVisible(true);

        ctontour2 = new JLabel("C'est ton tour !");
        ctontour2.setHorizontalAlignment(SwingConstants.CENTER);
        ctontour2.setFont(new Font("Tahoma", Font.PLAIN, 25));
        ctontour2.setBounds(692, 319, 173, 41);
        panel.add(ctontour2);
        ctontour2.setVisible(false);

    }

    public  void remplirBtn(JButton btnARemplir)
    {
        if (partie.getjCourant() == partie.getJ1()){
            btnARemplir.setText("X");
        }
        else{
            btnARemplir.setText("O");
        }
    }

    public void verifSiMancheTermine(){

        if (partie.isFinManche())
        {
            if (partie.getjGagnant() != null)
            {
                JOptionPane.showMessageDialog(frame,
                        "Manche terminé, le gagnant est " + partie.getjGagnant().getNom());
                if (partie.getjGagnant()==partie.getJ1())
                {
                  score1.setText(String.valueOf(partie.getJ1().getScore()));
                }
                else{
                    score2.setText(String.valueOf(partie.getJ2().getScore()));
                }
            }
            else
            {
                JOptionPane.showMessageDialog(frame,
                        "Manche terminé, pas de gagnant, on recommence!");
            }

            partie.resetManche();
            partie.setjGagnant(null);
            cleanAllBtn();
        }
    }


    public void cleanScore() {
            score1.setText("0");
            score2.setText("0");
    }

    public void cleanJoueurs() {
       inputj1.setText("");
       inputj2.setText("");
    }


    public void cleanAllBtn(){
        case0.setText("");
        case1.setText("");
        case2.setText("");
        case3.setText("");
        case4.setText("");
        case5.setText("");
        case6.setText("");
        case7.setText("");
        case8.setText("");
    }

    public void updateTonTour(){
        if (partie.getjCourant() == partie.getJ1()){
            ctontour1.setVisible(true);
            ctontour2.setVisible(false);

        }
        else{
            ctontour2.setVisible(true);
            ctontour1.setVisible(false);
        }
    }

    public JFrame getFrame() {
        return frame;
    }


    public JTextField getInputj1() {
        return inputj1;
    }

    public void setInputj1(JTextField inputj1) {
        this.inputj1 = inputj1;
    }

    public JTextField getInputj2() {
        return inputj2;
    }

    public void setInputj2(JTextField inputj2) {
        this.inputj2 = inputj2;
    }
}
