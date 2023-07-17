package factories

import ui.alertDialogue.AlertDialogue
import ui.button.Button
import ui.alertDialogue.MacOsAlertDialogue
import ui.button.MacOsButton

class MacGUIFactory : GUIFactory {
    override fun createButton(): Button {
        return MacOsButton()
    }

    override fun createAlertDialogue(): AlertDialogue {
        return MacOsAlertDialogue()
    }
}