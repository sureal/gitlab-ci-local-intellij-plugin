package dk.cego.gitlabcilocal.plugin

import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.ui.LabeledComponent
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import javax.swing.JComponent
import javax.swing.JPanel

class GclRunConfigurationEditor : SettingsEditor<GclRunConfiguration>() {
  private lateinit var settingsPanel: JPanel
  private lateinit var scriptNameLabel: LabeledComponent<TextFieldWithBrowseButton>

  override fun resetEditorFrom(gclRunConfiguration: GclRunConfiguration) {
    scriptNameLabel.component.text = gclRunConfiguration.scriptName
  }

  override fun applyEditorTo(demoRunConfiguration: GclRunConfiguration) {
    demoRunConfiguration.scriptName = (scriptNameLabel.component.text)
  }

  override fun createEditor(): JComponent {
    return settingsPanel
  }

  private fun createUIComponents() {
    scriptNameLabel = LabeledComponent()
    scriptNameLabel.component = TextFieldWithBrowseButton()
  }
}