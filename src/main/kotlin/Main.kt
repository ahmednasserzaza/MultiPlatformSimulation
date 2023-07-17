import factories.GUIFactory
import factories.LinuxGUIFactory
import factories.MacGUIFactory
import factories.WindowsGUIFactory
import ui.alertDialogue.AlertDialogue
import ui.button.Button
import java.util.*

fun main() {
    val osName = System.getProperty("os.name").lowercase(Locale.getDefault())

    val guiFactory: GUIFactory = when {
        osName.contains("win") -> WindowsGUIFactory()
        osName.contains("nix") || osName.contains("nux") -> LinuxGUIFactory()
        osName.contains("mac") || osName.contains("darwin") -> MacGUIFactory()
        else -> throw UnsupportedOperationException("Unsupported operating system.")
    }

    val button: Button = guiFactory.createButton()
    val alertDialogue: AlertDialogue = guiFactory.createAlertDialogue()

    button.render()
    alertDialogue.render()
}