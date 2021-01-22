package com.company;

public enum Status {
    ROCK{
        @Override
        public void choiceRock(Action a) throws Exception {
            throw new Exception("Оппонент тоже выбрал камень(Rock). Ничья.");
        }

        @Override
        public void choicePaper(Action a) throws Exception {
            System.out.println("Оппонент выбрал бумагу(Paper). Вы проиграли. Очко в пользу Компьютера.");
            a.loseRound();
        }

        @Override
        public void choiceScissors(Action a) throws Exception {
            System.out.println("Оппонент выбрал ножницы(Scissors) А вы камень(Rock). Вы выйграли. Очко в пользу Игрока.");
            a.winRound();


        }
    },
    PAPER{
        @Override
        public void choiceRock(Action a) throws Exception {
            System.out.println("Оппонент выбрал камень(Rock). Вы выйграли. Очко в пользу Игрока.");
            a.winRound();

        }

        @Override
        public void choicePaper(Action a) throws Exception {
            throw new Exception("Оппонент тоже выбрал бумагу(Paper). Ничья.");
        }

        @Override
        public void choiceScissors(Action a) throws Exception {
            System.out.println("Оппонент выбрал ножницы(Scissors). Вы проиграли. Очко в пользу Компьютера.");
            a.loseRound();
        }
    },
    SCISSORS{
        @Override
        public void choiceRock(Action a) throws Exception {
            System.out.println("Оппонент выбрал камень(Rock). Вы проиграли. Очко в пользу Компьютера.");
            a.loseRound();
        }

        @Override
        public void choicePaper(Action a) throws Exception {
            System.out.println("Оппонент выбрал бумагу(Paper). Вы выйграли. Очко в пользу Игрока.");
            a.winRound();
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
