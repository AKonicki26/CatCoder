package com.akonicki26.catcoder.toolWindow

import com.akonicki26.catcoder.core.GameManager
import com.akonicki26.catcoder.messages.AddMultiplerMessage
import com.intellij.ui.components.JBPanel
import javax.swing.JButton
import javax.swing.JComboBox

class MultiplierAdderWindow : ToolWindow {

    private val options = arrayOf(2, 3, 4, 5, 6);
    private var upgrade: Int = options[0]
    override fun getContent() = JBPanel<JBPanel<*>>().apply {

        val dropdown = JComboBox(options)

        add(AddMultiplerMessage.label)
        add(dropdown)

        val button = JButton("Add")
        add(button)

        dropdown.addActionListener {
            upgrade = dropdown.selectedItem as Int
        }

        button.addActionListener {
            GameManager.getInstance().upgradeManager.devAddMultiplier(upgrade)
        }

    }
}