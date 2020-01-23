import com.intellij.ide.ui.LafManager;

import javax.swing.*;

public class DashApplicationComponent {
    public DashApplicationComponent() {
        LafManager.getInstance().addLafManagerListener(__ -> updateProgressBarUi());
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", DashProgressBarUi.class.getName());
        UIManager.getDefaults().put(DashProgressBarUi.class.getName(), DashProgressBarUi.class);
    }
}
