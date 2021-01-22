package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Action act = new Action();
        Action[] actions = {
            Action.action(Status.ROCK, 0, 0),
        };
        act.playerPoint = 0;
        act.compPoint = 0;
        Integer a = 0;
        int c = 0;
        int x = 0;
        int sumP = 0;
        int sumC = 0;
        System.out.println("Игра камень ножница бумага");
        while (true){
            System.out.println("Для начало игры введите цифру 1, а для того чтобы закончить игру введите цифру 2 или любую другую:");
            int b = scanner.nextInt();
            if (b == 1){
                while (true){
                    System.out.println("Для выбора камня нажмите на 1, для ножницы 2, для бумаги 3:");
                    a = scanner.nextInt();
                    if (a == 1){
                        System.out.println("Вы вбрали камень.");
                        actions[0] = Action.action(Status.ROCK, c, x);
                        break;
                    }
                    if (a == 2){
                        System.out.println("Вы вбрали ножницы.");
                        actions[0] = Action.action(Status.SCISSORS, c, x);
                        break;
                    }
                    if (a == 3){
                        System.out.println("Вы вбрали бумагу.");
                        actions[0] = Action.action(Status.PAPER, c, x);
                        break;
                    }
                    else {
                        System.out.println("Введено неверное значение. Введите сново:");
                        continue;
                    }
                }
                Random random = new Random();
                System.out.println("Ход компьютера:");
                int r = random.nextInt(3)+1;
                if (r == 1){
                    System.out.println("Компьютер выбрал камень.");
                    for (Action s : actions) {
                        try {
                            s.choiceRock();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
                if (r == 2){
                    System.out.println("Компьютер выбрал ножницы.");
                    for (Action s : actions) {
                        try {
                            s.choiceScissors();

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
                if (r == 3){
                    System.out.println("Компьютер выбрал бумагу.");
                    for (Action s : actions) {
                        try {
                            s.choiceScissors();

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
                sumP+=actions[0].playerPoint;
                sumC+=actions[0].compPoint;
                System.out.println("Вы закончили раунд. \nСчет Игрока: "+ sumP+"\nСчет компьютера: "+sumC);
                }

            else {
                System.out.println("Вы закончили играть. \nСчет Игрока: "+sumP+"\nСчет компьютера: "+sumC);
                break;
            }


        }










    }
}
