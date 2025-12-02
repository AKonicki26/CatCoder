package com.akonicki26.catcoder.core.upgrade;

import java.math.BigInteger;

/**
 * Bas class for all upgrades to inherit
 */
public abstract class Upgrade {
    protected boolean isVisible;
    protected boolean isUnlocked;

    protected BigInteger cost;

    public abstract BigInteger upgrade(BigInteger starting);


}
