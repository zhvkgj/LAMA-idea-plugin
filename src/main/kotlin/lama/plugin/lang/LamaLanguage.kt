package lama.plugin.lang

import com.intellij.lang.Language

class LamaLanguage : Language("Lama") {
    companion object {
        val INSTANCE = LamaLanguage()
    }
}