package xosimple;

public class JoueurBean {

    private String nom;
    private int score=0;

    public JoueurBean(){}

    public JoueurBean(String nom){
        this.nom = nom;
    }

    public JoueurBean(String nom, int score) {
        this.nom = nom;
        this.score = score;
    }

    public void ajouter1pt() {
        score++;
    }

    //GETTER & SETTER
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
