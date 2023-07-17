package factories

import ui.alertDialogue.AlertDialogue
import ui.button.Button

interface GUIFactory {
    fun createButton(): Button
    fun createAlertDialogue(): AlertDialogue
}