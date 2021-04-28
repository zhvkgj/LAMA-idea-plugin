package ru.mse.itmo.lama.editor

import com.intellij.lang.Commenter

class LamaCommenter : Commenter {
    override fun getLineCommentPrefix() = "--"

    override fun getBlockCommentPrefix() = "(*"

    override fun getBlockCommentSuffix() = "*)"

    override fun getCommentedBlockCommentPrefix(): String? {
        return null
    }

    override fun getCommentedBlockCommentSuffix(): String? {
        return null
    }
}