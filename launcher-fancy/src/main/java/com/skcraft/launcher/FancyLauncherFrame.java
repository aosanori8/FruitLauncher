/*
 * SKCraft Launcher
 * Copyright (C) 2010-2014 Albert Pham <http://www.sk89q.com> and contributors
 * Please see LICENSE.txt for license information.
 */

package com.skcraft.launcher;

import javax.swing.BorderFactory;

import com.skcraft.launcher.dialog.LauncherFrame;
import com.skcraft.launcher.swing.SwingHelper;
import com.skcraft.launcher.swing.WebpagePanel;

import lombok.NonNull;

public class FancyLauncherFrame extends LauncherFrame {

    /**
     * Create a new frame.
     *
     * @param launcher the launcher
     */
    public FancyLauncherFrame(@NonNull final Launcher launcher) {
        super(launcher);

        //setSize(800, 500);
        setLocationRelativeTo(null);

        SwingHelper.removeOpaqueness(getInstancesTable());
        SwingHelper.removeOpaqueness(getInstanceScroll());
        getInstanceScroll().setBorder(BorderFactory.createEmptyBorder());
    }

    @Override
    protected WebpagePanel createNewsPanel() {
        final WebpagePanel panel = super.createNewsPanel();
        panel.setBrowserBorder(BorderFactory.createEmptyBorder());
        return panel;
    }

}
