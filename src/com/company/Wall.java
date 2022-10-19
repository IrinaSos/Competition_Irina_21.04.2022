package com.company;

public class Wall implements IObstacle{

    private double height;

    public Wall (double height){
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean complete(IParticipant participant) {

        return participant.getHeight(height) > this.height;
    }
}
