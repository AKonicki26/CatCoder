package com.akonicki26.catcoder.messages

import com.akonicki26.catcoder.MyBundle
import com.akonicki26.catcoder.core.GameManager
import com.intellij.ui.components.JBLabel
import java.awt.Font

object AddMultiplerMessage : Message() {
    override val label: JBLabel = JBLabel(
        MyBundle.message(
            "addMultiplier"));

}