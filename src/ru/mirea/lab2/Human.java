package ru.mirea.lab2;

public class Human {

    private Head head;
    private Leg lLeg;
    private Leg rLeg;
    private Hand lHand;
    private Hand rHand;

    public Human(String headColor, String eyeColor, int speed, int strong) {
        this.head = new Head(headColor, eyeColor);
        this.lLeg = new Leg(false, speed);
        this.rLeg = new Leg(true, speed);
        this.lHand = new Hand(false, strong);
        this.rHand = new Hand(true, strong);
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getlLeg() {
        return lLeg;
    }

    public void setlLeg(Leg lLeg) {
        this.lLeg = lLeg;
    }

    public Leg getrLeg() {
        return rLeg;
    }

    public void setrLeg(Leg rLeg) {
        this.rLeg = rLeg;
    }

    public Hand getlHand() {
        return lHand;
    }

    public void setlHand(Hand lHand) {
        this.lHand = lHand;
    }

    public Hand getrHand() {
        return rHand;
    }

    public void setrHand(Hand rHand) {
        this.rHand = rHand;
    }

}
