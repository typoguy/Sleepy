package phase.phase.sleepy;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class SleepyListener implements Listener {
    @EventHandler
    public void onEnterBed(PlayerBedEnterEvent event) {
        if (event.getBedEnterResult() == PlayerBedEnterEvent.BedEnterResult.OK) {
            new BukkitRunnable() {
                @Override
                public void run() {
                    event.getPlayer().getWorld().setTime(0L);
                    event.getPlayer().getWorld().setStorm(false);
                }
            }.runTaskLater(Sleepy.plugin, 101L);
        }
    }
}