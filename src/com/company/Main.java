package com.company;

public class Main {

    public static void main(String[] args) {


        IParticipant[] participants = {
                new Human("Человек", "Федя", 6000, 2.00),
                new Cat("Кот", "Яша", 4500, 2.30),
                new Robot("Робот", "Майкл", 8000, 1.2)
        };

        IObstacle[] obstacles = {
                new RunningTrack(5000),
                new Wall(1.5)
        };

        for (IObstacle o: obstacles) {
            for (IParticipant p: participants){
                if (!p.pass(o)) {
                    continue;
                }
            }

        }

    }
}
