package factories

import ui.alertDialogue.AlertDialogue
import ui.button.Button
import ui.alertDialogue.LinuxAlertDialogue
import ui.button.LinuxButton

class LinuxGUIFactory : GUIFactory {
    override fun createButton(): Button {
        return LinuxButton()
    }

    override fun createAlertDialogue(): AlertDialogue {
        return LinuxAlertDialogue()
    }
}