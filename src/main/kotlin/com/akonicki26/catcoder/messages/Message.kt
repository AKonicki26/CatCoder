package com.akonicki26.catcoder.messages

import com.akonicki26.catcoder.MyBundle
import com.intellij.ui.components.JBLabel

abstract class Message {
    abstract val label: JBLabel;

    private fun changeText(text: String) {
        label.text = text
    }

    fun setLetter(letter: Char) {
        this.changeText(MyBundle.message("lastKeyTyped", letter))
    }
}