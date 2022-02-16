package formiga.leblanc;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Events implements Listener {
    @EventHandler

    public void varinha(PlayerInteractEvent event){
        if(!(event.getPlayer().getInventory().getItemInMainHand().getType()==(Material.STICK))) return;
        if(event.getAction()==(Action.LEFT_CLICK_AIR)) {
            event.getPlayer().setVelocity(event.getPlayer().getLocation().getDirection().multiply(4));

        }

    }
}
