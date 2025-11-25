package com.akonicki26.catcoder.core;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private static GameManager instance = new GameManager();
    public static GameManager getInstance() {
        return instance;
    }
    private GameManager() {}

    private BigDecimal total_presses = BigDecimal.ZERO;

    public BigDecimal getTotalPresses() {
        return total_presses;
    }
    private BigDecimal true_presses = BigDecimal.ZERO;
    public BigDecimal getTruePresses() {
        return true_presses;
    }

    public void on_key_pressed(char c) {
        add_to_total_presses(1);
        add_to_true_presses(1);
    }

    private void add_to_total_presses(double val) {
        total_presses = total_presses.add(BigDecimal.valueOf(val));
        observers.forEach(GameManagerObserver::totalPressesChanged);
    }

    private void add_to_total_presses(int val) {
        total_presses = total_presses.add(BigDecimal.valueOf(val));
        observers.forEach(GameManagerObserver::totalPressesChanged);
    }

    private void add_to_true_presses(double val) {
        true_presses = true_presses.add(BigDecimal.valueOf(val));
        observers.forEach(GameManagerObserver::truePressesChanged);
    }

    private void add_to_true_presses(int val) {
        true_presses = true_presses.add(BigDecimal.valueOf(val));
        observers.forEach(GameManagerObserver::truePressesChanged);
    }

    List<GameManagerObserver> observers = new ArrayList();
    public void addObserver(GameManagerObserver observer) {
        observers.add(observer);

    }


}
