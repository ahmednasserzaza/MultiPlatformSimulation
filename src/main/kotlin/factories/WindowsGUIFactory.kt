package factories

import ui.alertDialogue.AlertDialogue
import ui.button.Button
import ui.alertDialogue.WindowsAlertDialogue
import ui.button.WindowsButton

class WindowsGUIFactory : GUIFactory {
    override fun createButton(): Button {
        return WindowsButton()
    }

    override fun createAlertDialogue(): AlertDialogue {
        return WindowsAlertDialogue()
    }
}