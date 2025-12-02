package com.akonicki26.catcoder.core.upgrade;

import java.math.BigInteger;

/**
 * Upgrades that multiples th value by a flat integer
 */
public class MultiplierUpgrade extends Upgrade {
    private final int multiplier;

    public MultiplierUpgrade(int multiplier) {
        this.multiplier = multiplier;
    }

    public int getMultiplier() {
        return multiplier;
    }


    @Override
    public BigInteger upgrade(BigInteger starting) {
        return starting.multiply(BigInteger.valueOf(getMultiplier()));
    }
}
