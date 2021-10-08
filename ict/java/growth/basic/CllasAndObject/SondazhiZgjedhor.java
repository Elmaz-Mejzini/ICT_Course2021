package ict.kosovo.growth.basic.ora3.ict.java.growth.OOP.CllasAndObject;

public class SondazhiZgjedhor {
    private String partia;
    private String komuna;
    private String kandidati;
    private int numriVotueseve;
    private int perqindjaVotueseve;
    private int rezultati;

    public SondazhiZgjedhor() {

    }

    public SondazhiZgjedhor(String partia, String komuna, String kandidati, int numriVotueseve, int perqindjaVotueseve, int rezultati) {
        this.partia = partia;
        this.komuna = komuna;
        this.kandidati = kandidati;
        this.numriVotueseve = numriVotueseve;
        this.perqindjaVotueseve = perqindjaVotueseve;
        this.rezultati = rezultati;
    }

    public String getPartia() {
        return partia;
    }

    public void setPartia(String partia) {
        this.partia = partia;
    }

    public void setKomuna(String komuna) {
        this.komuna = komuna;
    }

    public void setKandidati(String kandidati) {
        this.kandidati = kandidati;
    }

    public void setNumriVotueseve(int numriVotueseve) {
        this.numriVotueseve = numriVotueseve;
    }

    public void setPerqindjaVotueseve(int perqindjaVotueseve) {
        this.perqindjaVotueseve = perqindjaVotueseve;
    }

    public void setRezultati(int rezultati) {
        this.rezultati = rezultati;
    }

    public String getKomuna() {
        return komuna;
    }

    public String getKandidati() {
        return kandidati;
    }

    public int getNumriVotueseve() {
        return numriVotueseve;
    }

    public int getPerqindjaVotueseve() {
        return perqindjaVotueseve;
    }

    public int getRezultati() {
        return rezultati;
    }
}