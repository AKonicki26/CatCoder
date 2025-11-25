package com.akonicki26.catcoder.toolWindow

import com.intellij.ui.components.JBPanel

abstract class ToolWindow {
    abstract fun getContent(): JBPanel<JBPanel<*>>;
}