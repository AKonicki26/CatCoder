package com.akonicki26.catcoder.toolWindow

import com.intellij.ui.components.JBPanel

interface ToolWindow {
    fun getContent(): JBPanel<JBPanel<*>>;
}