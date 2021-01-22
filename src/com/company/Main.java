package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Action a = new Action();

        Action[] actions = {
                Action.action(Status.ROCK, 0,0),

        };
        for (Action s : actions){
            try {
                s.choiceScissors();

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
        System.out.println(actions[0].playerPoint);








    }
}
