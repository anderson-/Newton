/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3f.newton;

import s3f.core.plugin.PluginManager;
import s3f.core.ui.MainUI;

/**
 *
 * @author gnome3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PluginManager pm = PluginManager.getInstance(args, Main.class);
        pm.loadSoftPlugin("s3f/pyrite/plugin.cfg", null);
        pm.loadSoftPlugin("s3f/newton/plugin.cfg", null);
        MainUI.buildAndRun();
    }
    
}
