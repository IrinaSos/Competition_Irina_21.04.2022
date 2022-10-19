package com.company;

public class Human implements IParticipant{

    private String type;
    private String name;

    private int maxDistance;
    private double maxHeight;


    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMaxDistance() {
        return maxDistance;
    }
    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public double getMaxHeight() {
        return maxHeight;
    }
    public void setMaxHeight(double maxHeight) {
        this.maxHeight = maxHeight;
    }

    public Human(String type, String name, int maxDistance, double maxHeight) {
        this.type = type;
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;

    }

    @Override
    public boolean pass(IObstacle obstacle) {

        return obstacle.complete(this);
    }

    @Override
    public int getDistance(int distance) {
        if (distance < maxDistance){
            System.out.println(getType() + " " + getName() +  " успешно пробежал " + distance + " м");
        } else {
            System.out.println(getType() + " " + getName() + " выбывает из соревнований");
        }
        return distance;
    }

    @Override
    public double getHeight(double height) {

        if (height < maxHeight){
            System.out.println(getType() + " " + getName() +  " успешно перепрыгнул на высоту " + height + " м");
        } else {
            System.out.println(getType() + " " + getName() + " выбывает из соревнований");
        }
        return height;
    }

    @Override
    public String toString() {
        return getType() + " " + getName();
    }
}

