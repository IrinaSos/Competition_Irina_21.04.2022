package com.company;

public class RunningTrack implements IObstacle {

    private int distance;


    public RunningTrack(int distance) {
        this.distance = distance;
    }

    public int getDistance(int distance) {
        return this.distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }


    @Override
    public boolean complete(IParticipant participant) {

        return participant.getDistance(distance) > this.distance;
    }
}