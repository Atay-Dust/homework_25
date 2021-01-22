package com.company;

public enum Status {
    ROCK{
        @Override
        public void choiceRock(Action a) throws Exception {
            throw new Exception("Оппонент тоже выбрал камень(Rock). Ничья.");
        }

        @Override
        public void choicePaper(Action a) throws Exception {
            a.loseRound();
            System.out.println("Оппонент выбрал бумагу(Paper). Вы проиграли. Очко в пользу Компьютера.");

        }

        @Override
        public void choiceScissors(Action a) throws Exception {
            a.winRound();
            System.out.println("Оппонент выбрал ножницы(Scissors) А вы камень(Rock). Вы выйграли. Очко в пользу Игрока.");



        }
    },
    PAPER{
        @Override
        public void choiceRock(Action a) throws Exception {
            a.winRound();
            System.out.println("Оппонент выбрал камень(Rock). Вы выйграли. Очко в пользу Игрока.");


        }

        @Override
        public void choicePaper(Action a) throws Exception {
            throw new Exception("Оппонент тоже выбрал бумагу(Paper). Ничья.");
        }

        @Override
        public void choiceScissors(Action a) throws Exception {
            a.loseRound();
            System.out.println("Оппонент выбрал ножницы(Scissors). Вы проиграли. Очко в пользу Компьютера.");

        }
    },
    SCISSORS{
        @Override
        public void choiceRock(Action a) throws Exception {
            a.loseRound();
            System.out.println("Оппонент выбрал камень(Rock). Вы проиграли. Очко в пользу Компьютера.");

        }

        @Override
        public void choicePaper(Action a) throws Exception {
            a.winRound();
            System.out.println("Оппонент выбрал бумагу(Paper). Вы выйграли. Очко в пользу Игрока.");

        }

        @Override
        public void choiceScissors(Action a) throws Exception {
            throw new Exception("Оппонент тоже выбрал ножницы(Scissors). Ничья.");
        }
    };

    public abstract void choiceRock(Action a) throws Exception;
    public abstract void choicePaper(Action a) throws Exception;
    public abstract void choiceScissors(Action a) throws Exception;


}
