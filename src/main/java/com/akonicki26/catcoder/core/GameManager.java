package com.akonicki26.catcoder.core;

import com.akonicki26.catcoder.core.upgrade.UpgradeManager;
import com.akonicki26.catcoder.messages.KeyPressedMessage;
import com.google.common.util.concurrent.ServiceManager;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private final static GameManager instance = new GameManager();

    private final UpgradeManager upgradeManager = new UpgradeManager();

    public UpgradeManager getUpgradeManager() {
        return upgradeManager;
    }

    public boolean keep_incrementing = true;
    public static GameManager getInstance() {
        return instance;
    }
    private GameManager() {
    }

    private BigDecimal total_presses = BigDecimal.ZERO;

    public BigDecimal getTotalPresses() {
        return total_presses;
    }
    private BigDecimal true_presses = BigDecimal.ZERO;
    public BigDecimal getTruePresses() {
        return true_presses;
    }

    // -------------------- TOTAL ADDERS ---------------------------
    private void add_to_total_presses(BigDecimal val) {
        total_presses = total_presses.add(val);
        observers.forEach(GameManagerObserver::totalPressesChanged);
    }
    private void add_to_total_presses(BigInteger val) {
        add_to_total_presses(new BigDecimal(val));
    }

    private void add_to_total_presses(double val) {
        add_to_total_presses(BigDecimal.valueOf(val));
    }
    private void add_to_total_presses(int val) {
        add_to_total_presses(BigDecimal.valueOf(val));
    }

    // -------------------- TRUE ADDERS ---------------------------

    private void add_to_true_presses(int val) {
        true_presses = true_presses.add(BigDecimal.valueOf(val));
        observers.forEach(GameManagerObserver::truePressesChanged);
    }

    List<GameManagerObserver> observers = new ArrayList<>();
    public void addObserver(GameManagerObserver observer) {
        observers.add(observer);

    }

    public void onKeyPressed(char c) {
        BigInteger pressCount = BigInteger.ONE;

        for (var upgrader : getUpgradeManager().getUnlockedUpgrades()) {
            pressCount = upgrader.upgrade(pressCount);
        }

        add_to_total_presses(pressCount);
        add_to_true_presses(1);
        KeyPressedMessage.INSTANCE.setLetter(c);
    }
}