import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

/**
 * Observable
 */
interface Observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void release(String game);
}

/**
 * Observer
 */
interface Observer {
    void buyGame(String game);
}

/**
 * Concrete Observable
 */
class RockstarGames implements Observable {

    public String releaseGame;

    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void release(String game) {
        this.releaseGame = game;
        for (Observer observer : observers) {
            System.out.println("Inform message to : " + observer.toString());
            observer.buyGame(game);
        }
    }

}

/**
 * Concrete Observer
 */
class Gamer implements Observer {

    private Observable observable;
    private String name;
    private String reaction;
    private Set<String> games = new HashSet<>();

    public Gamer(String name, String reaction, Observable observable) {
        this.reaction = reaction;
        this.observable = observable;
        this.name = name;
    }

    @Override
    public void buyGame(String game) {
        games.add(game);
        System.out.println(this.name + " says: " + reaction);
    }

    @Override
    public String toString() {
        return this.name;
    }
}

/**
 * Main Class
 */
public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        String game = null;

        Observable rockstarGames = new RockstarGames();

        Gamer garry = new Gamer("Garry Rose", "I want to pre-order", rockstarGames);
        Gamer peter = new Gamer("Peter Johnston", "Pinch me...", rockstarGames);
        Gamer helen = new Gamer("Helen Jack", "Jesus, it's new game from Rockstar!", rockstarGames);

        rockstarGames.addObserver(garry);
        rockstarGames.addObserver(peter);
        rockstarGames.addObserver(helen);

        game = scanner.nextLine();
        System.out.println("It's happened! RockstarGames releases new game - " + game + "!");

        rockstarGames.release(game);

        scanner.close();
    }
}