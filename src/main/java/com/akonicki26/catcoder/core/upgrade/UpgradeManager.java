package com.akonicki26.catcoder.core.upgrade;

import java.util.ArrayList;
import java.util.List;

public class UpgradeManager {
    List<Upgrade> upgrades = new ArrayList<>();
    List<Upgrade> unlockedUpgrades = new ArrayList<>();

    public List<Upgrade> getAllUpgrades() {
        return upgrades;
    }

    public List<Upgrade> getUnlockUpgrades() {
        return unlockedUpgrades;
    }
}
