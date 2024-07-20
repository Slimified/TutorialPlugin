package me.slimified.tutorialplugin;

import me.slimified.tutorialplugin.listener.FallDamageListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class TutorialPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("This is my first plugin!");
        getServer().getPluginManager().registerEvents(new FallDamageListener(), this);
    }
}
