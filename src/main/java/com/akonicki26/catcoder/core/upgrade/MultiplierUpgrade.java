package com.akonicki26.catcoder.core.upgrade;

public class MultiplierUpgrade extends Upgrade {
    private final int multiplier;

    public MultiplierUpgrade(int multiplier) {
        this.multiplier = multiplier;
    }

    public int getMultiplier() {
        return multiplier;
    }
}
