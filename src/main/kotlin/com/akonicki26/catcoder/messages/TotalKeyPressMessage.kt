package com.akonicki26.catcoder.messages

import com.akonicki26.catcoder.MyBundle
import com.akonicki26.catcoder.core.GameManager
import com.akonicki26.catcoder.core.GameManagerObserver
import com.intellij.ui.components.JBLabel
import java.awt.Font
import java.math.BigDecimal

object TotalKeyPressMessage : GameManagerObserver, Message() {

    init {
        GameManager.getInstance().addObserver(this)
    }
    private fun update() {
        changeText(MyBundle.message("totalKeysPressed", GameManager.getInstance().totalPresses));
    }

    override fun truePressesChanged() {
        // Do nothing
    }

    override fun totalPressesChanged() {
        update();
    }

    override val label: JBLabel = JBLabel(
        MyBundle.message(
            "totalKeysPressed",
            GameManager.getInstance().totalPresses))
        .apply {
            font = font.deriveFont(Font.BOLD)
        };
}