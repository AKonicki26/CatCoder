package com.akonicki26.catcoder.messages

import com.akonicki26.catcoder.MyBundle
import com.intellij.ui.components.JBLabel

object KeyPressedMessage : Message() {
    override val label: JBLabel = JBLabel(MyBundle.message("lastKeyTyped", "?"));
}