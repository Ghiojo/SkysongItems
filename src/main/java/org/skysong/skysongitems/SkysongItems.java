package org.skysong.skysongitems;

import com.bergerkiller.bukkit.common.cloud.CloudSimpleHandler;
import org.bukkit.plugin.java.JavaPlugin;
import org.skysong.skysongitems.commands.BaseCommands;

public final class SkysongItems extends JavaPlugin {


    private CloudSimpleHandler commandHandler = new CloudSimpleHandler();

    @Override
    public void onEnable() {
        getLogger().info("Hello from Ghiojo");
        commandHandler.enable(this);
        commandHandler.getParser().parse(new BaseCommands(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
