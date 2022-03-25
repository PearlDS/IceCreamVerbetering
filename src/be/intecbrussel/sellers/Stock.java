package be.intecbrussel.sellers;

public class Stock {

    private int magni;
    private int cones;
    private int balls;
    private int rockets;


    public Stock(int magni, int cones, int balls, int rockets) {
        this.magni = magni;
        this.cones = cones;
        this.balls = balls;
        this.rockets = rockets;
    }

    public int getMagni() {
        return magni;
    }

    public void setMagni(int magni) {
        this.magni = magni;
    }

    public int getCones() {
        return cones;
    }

    public void setCones(int cones) {
        this.cones = cones;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getRockets() {
        return rockets;
    }

    public void setRockets(int rockets) {
        this.rockets = rockets;
    }
}
