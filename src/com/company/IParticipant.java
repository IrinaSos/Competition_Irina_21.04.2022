package com.company;

public interface IParticipant extends IRunnable, IJumpable {

    boolean pass(IObstacle obstacle);

}
