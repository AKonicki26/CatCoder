package com.akonicki26.catcoder.core.upgrade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpgradeManager {
    List<Upgrade> upgrades = Arrays.asList(new MultiplierUpgrade(2), new MultiplierUpgrade(2));
    List<Upgrade> unlockedUpgrades = new ArrayList<>();

    public List<Upgrade> getAllUpgrades() {
        return upgrades;
    }

    public List<Upgrade> getUnlockedUpgrades() {
        return unlockedUpgrades;
    }

    public void devAddMultiplier(int multiplier) {
        unlockedUpgrades.add(new MultiplierUpgrade(multiplier));
    }
}
