package com.akonicki26.catcoder.messages

import com.akonicki26.catcoder.MyBundle
import com.akonicki26.catcoder.core.GameManager
import com.akonicki26.catcoder.core.GameManagerObserver
import com.intellij.ui.components.JBLabel

object TrueKeyPressMessage : Message(), GameManagerObserver {
    init {
        GameManager.getInstance().addObserver(this);
    }

    private fun update() {
        changeText(MyBundle.message("trueKeysPressed", GameManager.getInstance().truePresses));
    }

    override val label: JBLabel = JBLabel(MyBundle.message("trueKeysPressed", GameManager.getInstance().truePresses));

    override fun truePressesChanged() {
        update();
    }

    override fun totalPressesChanged() {
        // Do nothing
    }
}