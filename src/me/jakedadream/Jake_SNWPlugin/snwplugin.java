package me.jakedadream.Jake_SNWPlugin;

import me.jakedadream.Jake_SNWPlugin.commands.snwcommands;
import me.jakedadream.Jake_SNWPlugin.events.snwevents;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class snwplugin extends JavaPlugin {

    public static void main(String[] args) {
        System.out.println("Jake is a nerd");
    }

    @Override
    public void onEnable() {
        getCommand("mhat").setExecutor(new snwcommands());
        getCommand("mgive").setExecutor(new snwcommands());
        getCommand("launch").setExecutor(new snwcommands());
        getCommand("givecoin").setExecutor(new snwcommands());
        getCommand("givestarcoin").setExecutor(new snwcommands());
        getCommand("llamazbanwand").setExecutor(new snwcommands());
        getCommand("thruwand").setExecutor(new snwcommands());
        getCommand("idlist").setExecutor(new snwcommands());
        getCommand("sc").setExecutor(new snwcommands());
        getCommand("gms").setExecutor(new snwcommands());
        getCommand("gmc").setExecutor(new snwcommands());
        getCommand("gmsp").setExecutor(new snwcommands());
        getCommand("gma").setExecutor(new snwcommands());
        getCommand("nickname").setExecutor(new snwcommands());
        getCommand("enderchest").setExecutor(new snwcommands());
        getCommand("workbench").setExecutor(new snwcommands());
        getCommand("invsee").setExecutor(new snwcommands());
        getCommand("invis").setExecutor(new snwcommands());
        getCommand("uninvis").setExecutor(new snwcommands());
        getServer().getPluginManager().registerEvents(new snwevents(),this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[SNW] Plugin is now enabled :D");
        this.saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[SNW] Plugin is now disabled :(");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[SNW] Fuck you");
    }
}

//    ░█▀▀▀█ ░█─░█ ░█▀▀█ ░█▀▀▀ ░█▀▀█ 　 ░█▄─░█ ▀█▀ ░█▄─░█ ▀▀█▀▀ ░█▀▀▀ ░█▄─░█ ░█▀▀▄ ░█▀▀▀█ 　 ░█──░█ ░█▀▀▀█ ░█▀▀█ ░█─── ░█▀▀▄    ░█▀▀█ ░█─── ░█─░█ ░█▀▀█ ▀█▀ ░█▄─░█
//    ─▀▀▀▄▄ ░█─░█ ░█▄▄█ ░█▀▀▀ ░█▄▄▀ 　 ░█░█░█ ░█─ ░█░█░█ ─░█── ░█▀▀▀ ░█░█░█ ░█─░█ ░█──░█ 　 ░█░█░█ ░█──░█ ░█▄▄▀ ░█─── ░█─░█    ░█▄▄█ ░█─── ░█─░█ ░█─▄▄ ░█─ ░█░█░█
//    ░█▄▄▄█ ─▀▄▄▀ ░█─── ░█▄▄▄ ░█─░█ 　 ░█──▀█ ▄█▄ ░█──▀█ ─░█── ░█▄▄▄ ░█──▀█ ░█▄▄▀ ░█▄▄▄█ 　 ░█▄▀▄█ ░█▄▄▄█ ░█─░█ ░█▄▄█ ░█▄▄▀    ░█─── ░█▄▄█ ─▀▄▄▀ ░█▄▄█ ▄█▄ ░█──▀█


//    ░█▀▄▀█ █▀▀█ █▀▀▄ █▀▀ 　 █▀▀▄ █──█ 　 ───░█ █▀▀█ █─█ █▀▀ ░█▀▀▄ █▀▀█ ░█▀▀▄ █▀▀█ █▀▀ █▀▀█ █▀▄▀█
//    ░█░█░█ █▄▄█ █──█ █▀▀ 　 █▀▀▄ █▄▄█ 　 ─▄─░█ █▄▄█ █▀▄ █▀▀ ░█─░█ █▄▄█ ░█─░█ █▄▄▀ █▀▀ █▄▄█ █─▀─█
//    ░█──░█ ▀──▀ ▀▀▀─ ▀▀▀ 　 ▀▀▀─ ▄▄▄█ 　 ░█▄▄█ ▀──▀ ▀─▀ ▀▀▀ ░█▄▄▀ ▀──▀ ░█▄▄▀ ▀─▀▀ ▀▀▀ ▀──▀ ▀───▀




//                          ░█▀▀█ ─▀─ █▀▀▀ 　 ▀▀█▀▀ █──█ █▀▀█ █▀▀▄ █─█ █▀▀ 　 ▀▀█▀▀ █▀▀█ 　 █▀▀█ █▀▀▄ █▀▀▄ █──█ ─▀─ █▀▀▄ █▀▀▄ ─▀─ █▀▀
//                          ░█▀▀▄ ▀█▀ █─▀█ 　 ──█── █▀▀█ █▄▄█ █──█ █▀▄ ▀▀█ 　 ──█── █──█ 　 █▄▄█ █──█ █──█ █▄▄█ ▀█▀ █──█ █──█ ▀█▀ █▀▀
//                          ░█▄▄█ ▀▀▀ ▀▀▀▀ 　 ──▀── ▀──▀ ▀──▀ ▀──▀ ▀─▀ ▀▀▀ 　 ──▀── ▀▀▀▀ 　 ▀──▀ ▀──▀ ▀▀▀─ ▄▄▄█ ▀▀▀ ▀──▀ ▀──▀ ▀▀▀ ▀▀▀
//
//                               █▀▀█ █▀▀▄ █▀▀▄ 　 ░█▀▀█ █▀▀ █▀▀█ █── ▀█▀ █▀▀▄ █▀▀ ▀▀█▀▀ █▀▀█ █▀▀▄ ▀▀█▀▀ ░█▀▀█ █▀▀█ █▀▄▀█ █▀▀ █▀▀▄
//                               █▄▄█ █──█ █──█ 　 ░█▄▄▀ █▀▀ █▄▄█ █── ░█─ █──█ ▀▀█ ──█── █▄▄█ █──█ ──█── ░█▄▄▀ █▄▄█ █─▀─█ █▀▀ █──█
//                               ▀──▀ ▀──▀ ▀▀▀─ 　 ░█─░█ ▀▀▀ ▀──▀ ▀▀▀ ▄█▄ ▀──▀ ▀▀▀ ──▀── ▀──▀ ▀──▀ ──▀── ░█─░█ ▀──▀ ▀───▀ ▀▀▀ ▀──▀



