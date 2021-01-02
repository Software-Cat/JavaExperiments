/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Observable interface
 **/
interface Observable {
    void release(String game);

    void addObserver(Gamer gamer);

    void removeObserver(Gamer gamer);
}

/**
 * Observer interface
 **/
interface Observer {
    void buyGame(String game);
}

/**
 * Concrete Observable - Rockstar Games
 **/
class RockstarGames implements Observable {

    public String releaseGame;
    ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void release(String game) {
        this.releaseGame = game;
        for (Observer observer : observers) {
            observer.buyGame(this.releaseGame);
        }
    }

    @Override
    public void addObserver(Gamer gamer) {
        observers.add(gamer);
    }

    @Override
    public void removeObserver(Gamer gamer) {
        observers.remove(gamer);
    }
}

/**
 * Concrete observer - Gamer
 **/
class Gamer implements Observer {

    private String name;
    private Observable observable;
    private Set<String> games = new HashSet<>();

    public Gamer(String name, Observable observable) {
        this.name = name;
        this.observable = observable;
    }

    @Override
    public void buyGame(String game) {
        System.out.println("Notification for gamer : " + name);
        if (games.contains(game)) {
            System.out.println("What? They've already released this game ... I don't understand");
        } else {
            System.out.println(name + " says : \"Oh, Rockstar releases new game " + game + " !\"");
            games.add(game);
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}

/**
 * Main class
 **/
public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String game = null;

        RockstarGames rockstarGames = new RockstarGames();

        Gamer garry = new Gamer("Garry Rose", rockstarGames);
        Gamer peter = new Gamer("Peter Johnston", rockstarGames);
        Gamer helen = new Gamer("Helen Jack", rockstarGames);

        rockstarGames.addObserver(garry);
        rockstarGames.addObserver(peter);
        rockstarGames.addObserver(helen);

        for (int i = 0; i < 2; i++) {
            game = scanner.nextLine();
            rockstarGames.release(game);
        }

        scanner.close();
    }
}