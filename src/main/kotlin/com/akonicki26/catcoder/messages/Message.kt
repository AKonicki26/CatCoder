package com.akonicki26.catcoder.messages

import com.akonicki26.catcoder.MyBundle
import com.akonicki26.catcoder.core.GameManager
import com.intellij.ui.components.JBLabel

abstract class Message {

    abstract val label: JBLabel;

    protected fun changeText(text: String) {
        label.text = text
    }
}