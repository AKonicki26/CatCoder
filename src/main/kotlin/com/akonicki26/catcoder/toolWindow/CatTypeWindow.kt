package com.akonicki26.catcoder.toolWindow

import com.akonicki26.catcoder.core.GameManagerObserver
import com.intellij.ui.components.JBPanel
import java.util.*

class CatTypeWindow : ToolWindow, GameManagerObserver {


    var timer: Timer = Timer()
    override fun truePressesChanged() {

    }

    override fun totalPressesChanged() {
        // do nothing
    }

    override fun getContent() = JBPanel<JBPanel<*>>().apply {

    }
}