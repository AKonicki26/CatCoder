package com.akonicki26.catcoder.messages

import com.akonicki26.catcoder.MyBundle
import com.intellij.ui.components.JBLabel

object KeyPressedMessage {
    private val label: JBLabel = JBLabel(MyBundle.message("lastkeytyped", "?"));

    private fun changeText(text: String) {
        label.text = text
    }

    fun setLetter(letter: Char) {
        changeText(MyBundle.message("lastkeytyped", letter))
    }

    fun getLabel(): JBLabel {
        return label
    }
}