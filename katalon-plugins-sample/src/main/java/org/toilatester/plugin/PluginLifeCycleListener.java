package org.toilatester.plugin;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.katalon.platform.api.Plugin;
import com.katalon.platform.api.extension.PluginActivationListener;

public class PluginLifeCycleListener implements PluginActivationListener {

    @Override
    public void afterActivation(Plugin plugin) {
        final Shell activeShell = Display.getCurrent().getActiveShell();
        // final FileDialog dialog = new FileDialog(activeShell);
        System.out.println("MinhHoangTest");
        MessageDialog.openInformation(activeShell, "Minh Hoang Test", "MH Custom Plugin successfully installed");
    }

    @Override
    public void beforeDeactivation(Plugin plugin) {

    }

}
