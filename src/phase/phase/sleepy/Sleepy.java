package phase.phase.sleepy;

import org.bukkit.plugin.java.JavaPlugin;

public class Sleepy extends JavaPlugin {
    public static Sleepy plugin;

    @Override
    public void onEnable() {
        plugin = this;

        getServer().getPluginManager().registerEvents(new SleepyListener(), this);
    }
}
