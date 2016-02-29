package com.jjsoftware.fitaddiction;

import com.jjsoftware.fitaddiction.NavigationDrawerFragment;

/**
 * Created by Jai on 2/28/2016.
 */
public class NavigationDrawerItem {
    private int iconID;
    private String title;

    public NavigationDrawerItem (int iconID, String title) {
        this.iconID = iconID;
        this.title = title;
    }

    public int getIconID() {
        return iconID;
    }

    public String getTitle() {
        return title;
    }
}
