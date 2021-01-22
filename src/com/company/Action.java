package com.company;

public class Action {
    Integer playerPoint = 0;
    Integer compPoint = 0;
    Status status;



    public void setStatus(Status status) {
        this.status = status;
    }

    public void choiceRock() throws Exception {
        status.choiceRock(this);
    }

    public void choicePaper() throws Exception {
        status.choicePaper(this);
    }
    public void choiceScissors() throws Exception {
        status.choiceScissors(this);
    }
    public void winRound(){
        playerPoint+=1;
        compPoint-=1;
    }
    public void loseRound(){
        playerPoint-=1;
        compPoint+=1;
    }
    public static Action action(Status status, Integer playerPoint, Integer compPoint){
        Action a = new Action();
        a.status = status;
        a.playerPoint = playerPoint;
        a.compPoint = compPoint;
        return a;
    }
}
