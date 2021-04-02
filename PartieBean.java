package xosimple;

import java.util.ArrayList;

public class PartieBean{

    private int [] manche = new int[9];

    private JoueurBean j1, j2, jCourant, jGagnant;

    public PartieBean() {

    }

    public void remplirCase (int numeroCase){
        if (jCourant == j1){
            manche[numeroCase] = 1;
        }else {
            manche[numeroCase] = 2;
        }
    }

    public boolean isFinManche (){
        // Verifier si tableau plein
        int result = 0;
        for (int i = 0; i< manche.length; i++){
            if (manche[i] != 0){
                result ++;
            }
        }

        verifGagnant();

        if (result == 9 || jGagnant!=null){

            jGagnant.ajouter1pt();
            return true;
        } else {
            return false;
        }
    }

    public void verifGagnant(){
        if ((manche[0] == 1 && manche[1] == 1 && manche[2] == 1) ||
                (manche[0] == 1 && manche[3] == 1 && manche[6] == 1) ||
                (manche[0] == 1 && manche[4] == 1 && manche[8] == 1) ||
                (manche[3] == 1 && manche[4] == 1 && manche[5] == 1) ||
                (manche[6] == 1 && manche[7] == 1 && manche[8] == 1) ||
                (manche[1] == 1 && manche[4] == 1 && manche[7] == 1) ||
                (manche[2] == 1 && manche[5] == 1 && manche[8] == 1) ||
                (manche[2] == 1 && manche[4] == 1 && manche[6] == 1)) {
            jGagnant=j1;
        }else if ((manche[0] == 2 && manche[1] == 2 && manche[2] == 2) ||
                (manche[0] == 2 && manche[3] == 2 && manche[6] == 2) ||
                (manche[0] == 2 && manche[4] == 2 && manche[8] == 2) ||
                (manche[3] == 2 && manche[4] == 2 && manche[5] == 2) ||
                (manche[6] == 2 && manche[7] == 2 && manche[8] == 2) ||
                (manche[1] == 2 && manche[4] == 2 && manche[7] == 2) ||
                (manche[2] == 2 && manche[5] == 2 && manche[8] == 2) ||
                (manche[2] == 2 && manche[4] == 2 && manche[6] == 2)) {
            jGagnant=j2;
        }
    }

    public void changerJoueurCourant() {
        if (jCourant == j1) {
            jCourant = j2;
        } else {
            jCourant = j1;
        }
    }

    public void resetManche(){
        for (int i = 0; i < manche.length; i++){
            manche[i]= 0;
        }
    }

    public void resetPartieBean(){
        j1.setNom("Joueur 0");
        j1.setNom("Joueur X");
        setjGagnant(null);

    }

    //GETTER SETTER
    public JoueurBean getjGagnant() {
        return jGagnant;
    }

    public void setjGagnant(JoueurBean jGagnant) {
        this.jGagnant = jGagnant;
    }

    public int[] getManche() {
        return manche;
    }

    public void setManche(int[] manche) {
        this.manche = manche;
    }


    public JoueurBean getJ1() {
        return j1;
    }

    public void setJ1(JoueurBean j1) {
        this.j1 = j1;
    }

    public JoueurBean getJ2() {
        return j2;
    }

    public void setJ2(JoueurBean j2) {
        this.j2 = j2;
    }

    public JoueurBean getjCourant() {
        return jCourant;
    }

    public void setjCourant(JoueurBean jCourant) {
        this.jCourant = jCourant;
    }
}
