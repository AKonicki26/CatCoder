package com.akonicki26.catcoder.toolWindow

import com.akonicki26.catcoder.messages.KeyPressedMessage
import com.akonicki26.catcoder.messages.TotalKeyPressMessage
import com.akonicki26.catcoder.messages.TrueKeyPressMessage
import com.intellij.ui.components.JBPanel
import java.awt.Component
import javax.swing.BorderFactory
import javax.swing.BoxLayout

class NumbersWindow : ToolWindow {
    override fun getContent() = JBPanel<JBPanel<*>>().apply {

        layout = BoxLayout(this, BoxLayout.Y_AXIS)
        //border = BorderFactory.createTitledBorder("Messages")

        //add(KeyPressedMessage.label);
        add(TotalKeyPressMessage.label);
        add(TrueKeyPressMessage.label);
        alignmentX = Component.CENTER_ALIGNMENT
    }
}