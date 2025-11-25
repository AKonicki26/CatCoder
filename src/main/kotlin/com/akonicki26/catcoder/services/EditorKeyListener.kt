package com.akonicki26.catcoder.services

import com.akonicki26.catcoder.MyBundle
import com.akonicki26.catcoder.core.GameManager
import com.akonicki26.catcoder.messages.KeyPressedMessage
import com.intellij.codeInsight.editorActions.TypedHandlerDelegate
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFile

class EditorKeyListener : TypedHandlerDelegate() {
    override fun charTyped(c: Char, project: Project, editor: Editor, file: PsiFile): Result {
        GameManager.getInstance().onKeyPressed(c)

        return Result.CONTINUE
    }
}