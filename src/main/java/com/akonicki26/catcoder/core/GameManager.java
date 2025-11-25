package com.akonicki26.catcoder.core;


import java.math.BigDecimal;

public class GameManager {
    private static GameManager instance = new GameManager();
    public static GameManager getInstance() {
        return instance;
    }
    private GameManager() {}

    private BigDecimal total_presses = BigDecimal.ZERO;
    private BigDecimal true_presses = BigDecimal.ZERO;

    public void on_key_pressed(char c) {
        add_to_total_presses(1);
        add_to_true_presses(1);
    }

    private void add_to_total_presses(double val) {
        total_presses = total_presses.add(BigDecimal.valueOf(val));
    }

    private void add_to_total_presses(int val) {
        total_presses = total_presses.add(BigDecimal.valueOf(val));
    }

    private void add_to_true_presses(double val) {
        true_presses = true_presses.add(BigDecimal.valueOf(val));
    }

    private void add_to_true_presses(int val) {
        true_presses = true_presses.add(BigDecimal.valueOf(val));
    }
}
