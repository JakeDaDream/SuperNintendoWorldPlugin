package me.jakedadream.snwplugin.commands;

import me.jakedadream.snwplugin.events.PluginInventories;
import me.jakedadream.snwplugin.items.ItemManager;
import me.jakedadream.snwplugin.snwplugin;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;


public class snwcommands implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only players can use that command!");
            return true;
        }
        Player player = (Player) sender;

        short id;

        switch (cmd.getName().toLowerCase()) {


            case "givecoin":
                if (player.hasPermission("snw.givecoin")) {
                    player.getInventory().addItem(ItemManager.createCoin());
                }
                return true;

            case "givestarcoin":
                if (player.hasPermission("snw.givestarcoin")) {
                    player.getInventory().addItem(ItemManager.createStarCoin());
                }
                return true;


            case "mgive":
                if (player.hasPermission("snw.mdoels")) {
                    try {
                        id = Short.parseShort(args[0]);
                        player.getInventory().addItem(ItemManager.createmodel(id));
                    } catch (Exception ex) {
                        player.sendMessage("§e§l<!> §cDumbass, this isn't a registered number. Please try again, or don't.");
                    }
                }
                return true;

            case "mhat":
                if (player.hasPermission("snw.mdoels")) {
                    try {
                        id = Short.parseShort(args[0]);

                        ItemStack[] armor = player.getInventory().getArmorContents();
                        armor[3] = ItemManager.createmodel(id);
                        player.getInventory().setArmorContents(armor);

                    } catch (Exception ex) {
                        player.sendMessage("§e§l<!> §cDumbass, this isn't a registered number. Please try again, or don't.");

                    }
                }
                return true;

            case "idlist":
                if (player.hasPermission("snw.mdoels")) {
                    player.sendMessage("" +
                            "§7| §c§lMODEL ID LIST\n" +
                            "§7|---------------------\n" +
                            "§7|  §aWarp Pipe, §6§l//1\n" +
                            "§7|  §a1/2 Warp Pipe, §6§l//2\n" +
                            "§7|  §7Spawn Lights, §6§l//3\n" +
                            "§7|  §cRed §fLollipop, §6§l//4\n" +
                            "§7|  §cPirahna §aPlant §fUrinal, §6§l//5\n" +
                            "§7|  §eStar §cPost, §6§l//6\n" +
                            "§7|  §4Ribbon, §6§l//7\n" +
                            "§7|  §dPeach's Castle §bStained Glass Window, §6§l//8\n" +
                            "§7|  §f§lNint Sign, §6§l//9\n" +
                            "§7|  §f§lSuper Sign, §6§l//10\n" +
                            "§7|  §f§lEndo Sign, §6§l//11\n" +
                            "§7|  §f§lWorld Sign, §6§l//12\n" +
                            "§7|  §f§lJake's §7§lLong §8§lSword, §6§l//13\n" +
                            "§7|  §e§lQuestion Block, §6§l//14\n" +
                            "§7|  §bPeach's Castle §eWindow, §6§l//15\n" +
                            "§7|  §6Pirahana Plant Spike, §6§l//16\n" +
                            "§7|  §6(NOT CURRENCY) §eGold Coin Prop, §6§l//17\n" +
                            "§7|  §e§lQUESTION MARK COIN, §6§l//18\n" +
                            "§7|  §3§lSNW Light Post #1 (Bottom Half), §6§l//19\n" +
                            "§7|  §3§lSNW Light Post #1 (Top Half), §6§l//20\n" +
                            "§7|  §4Piranha Plant Main (Aero), §6§l//21\n" +
                            "§7|  §4Piranha Plant Jaw (Aero), §6§l//22\n" +
                            "§7|  §aGreen §2Shell, §6§l//23\n" +
                            "§7|  §716 Bit §c§lMario §9§lCap, §6§l//24\n" +
                            "§7|  §3[§cBuilder§3] §e§lHard Hat, §6§l//25\n" +
                            "§7|  §716 Bit §a§lLuigi §9§lCap, §6§l//26\n" +
                            "§7|  §dPeach's §eCrown, §6§l//27\n" +
                            "§7|  §3Sailor §bMoons §ehair, §6§l//28\n" +
                            "§7|  §7§lShark §f§lCap, §6§l//29\n" +
                            "§7|  §3Jaws Boat §fFront, §6§l//30\n" +
                            "§7|  §3Jaws Boat §fBack, §6§l//31\n" +
                            "§7|  §c§lMushroom §f§lTable §7(Medium), §6§l//32\n" +
                            "§7|  §c§lMushroom §f§lTable §7(Small), §6§l//33\n" +
                            "§7|  §c§lMushroom §f§lTable §7(Large), §6§l//34\n" +
                            "§7|  §f§lClouds §f☻, §6§l//35\n" +
                            "§7|  §7§lBullet §7Bill, §6§l//36\n" +
                            "§7|  §a3 Way Warp Pipe, §6§l//37\n" +
                            "§7|  §cMario §eFlag, §6§l//38\n" +
                            "§7|  §cF§6i§er§ce §6F§el§co§6w§ee§cr, §6§l//39\n" +
                            "§7|  §6§lKey §e§lCoin, §6§l//40\n" +
                            "§7|  §eGoodbye §b20§f20 §eGlasses, §6§l//41\n" +
                            "§7|  §7§lDarksaber, §6§l//42\n" +
                            "§7|  §6§lPOW! §4§lBlock, §6§l//43\n" +
                            "§7|  §b§lPOW! §3§lBlock, §6§l//44\n" +
                            "§7|  §7§lJaws §f§lDisplay Shark, §6§l//45\n" +
                            "§7|  §7§lBROKEN MODEL, §6§l//46\n" +
                            "§7|  §fFull White Fence, §6§l//47\n" +
                            "§7|  §fHalf White Fence, §6§l//48\n" +
                            "§7|  §7§lBullet §7Bill Cannon, §6§l//49\n" +
                            "§7|  §c§lMario §9§lWristband, §6§l//50\n" +
                            "§7|  §a§lLuigi §9§lWristband, §6§l//51\n" +
                            "§7|  §a§lYoshi's §f§lEgg, §6§l//52\n" +
                            "§7|  §a§lYoshi, §6§l//53\n" +
                            "§7|  §7§lThwomp!, §6§l//54\n" +
                            "§7|  §c§lMario's §9§lCap §fStrawberry Shortcake sandwich, §6§l//55\n" +
                            "§7|  §a§lLuigi's §9§lCap §fNo-Bake Cheesecake sandwhich, §6§l//56\n" +
                            "§7|  §c§lMario's §f§lStrawberry Soda, §6§l//57\n" +
                            "§7|  §a§lLuigi's §f§lGreen Apple Soda, §6§l//58\n" +
                            "§7|  §e§lPrincess Peach's §f§lPeach Soda, §6§l//59\n" +
                            "§7|  §fZero §4Twos §cHeadband, §6§l//60\n" +
                            "§7|  §aPalutena's §6Magic §3Staff, §6§l//61\n" +
                            "§7|  §7ODM §2Gear, §6§l//62\n" +
                            "§7|  §7ODM §2Gear §7Blade, §6§l//63\n" +
                            "§7|  §eElizabeth §fthe §5§lGoomba, §6§l//64\n" +
                            "§7|  §eBrad §fthe §c§lGoomba, §6§l//65\n" +
                            "§7|  §eHissy §fthe §2§lGoomba, §6§l//66\n" +
                            "§7|  §cPirahna §aPlant §fJaw, §6§l//67\n" +
                            "§7|  §cPirahna §aPlant §fStem, §6§l//68\n" +
                            "§7|  §cPirahna §aPlant §fMouth, §6§l//69\n" +
                            "§7|  §fTex's §dSimp §6Compass, §6§l//70\n" +
                            "§7|  §fSalty's §dSimp §6Compass, §6§l//71\n" +
                            "§7|  §fUnconfirmable's §dSimp §6Compass, §6§l//72\n" +
                            "§7|  §fEboy's §dSimp §6Compass, §6§l//73\n" +
                            "§7|  §fJake's §dSimp §6Compass, §6§l//74\n" +
                            "§7|  §4§lShy §f§lGuy §6§l//75\n" +
                            "§7|  §4§lWanda's Headband §6§l//76\n" +
                            "§7|  §0§lMais §8§lBunny Ears §6§l//77\n" +
                            "§7|  §6§lLlama Hat §6§l//78\n" +
                            "§7|  §b§lLight Blue §fYoshi Ride Cart §6§l//79\n" +
                            "§7|  §a§lLight Green §fYoshi Ride Cart §6§l//80\n" +
                            "§7|  §5§lPurple §fYoshi Ride Cart §6§l//81\n" +
                            "§7|  §6§lOrange §fYoshi Ride Cart §6§l//82\n" +
                            "§7|  §c§lRed §fYoshi Ride Cart §6§l//83\n" +
                            "§7|  §d§lPink §fYoshi Ride Cart §6§l//84\n" +
                            "§7|  §3§lBlue §fYoshi Ride Cart §6§l//85\n" +
                            "§7|  §e§lYellow §fYoshi Ride Cart §6§l//86\n" +
                            "§7|  §fYoshi Ride Cart §cBars §6§l//87\n" +
                            "§7|  §8§lBowser's Castle §7Recycle Can §6§l//88\n" +
                            "§7|  §8§lBowser's Castle §7Trash Can §6§l//89\n" +
                            "§7|  §3§lSuper Nintendo World §fRecycle Can §6§l//90\n" +
                            "§7|  §3§lSuper Nintendo World §fTrash Can §6§l//91\n" +
                            "§7|  §a§lYoshi §fMerchandise §aKart §6§l//92\n" +
                            "§7|  §3§lWater§9§lWorld §f§lSpinner §6§l//92");
                }
                return true;


            case "sc":
                if (player.hasPermission("snw.sc")) {
                    if (args.length == 0) {
                        // /sc (no args)
                        player.sendMessage("§3[§dParadisu §bツ§3] §fIncorrect usage; Please use '/sc <message>'");
                    } else {
                        String allArgs = "";

                        for (String arg : args) {
                            allArgs += arg + " ";
                        }
                        for (World w : Bukkit.getWorlds()) {
                            for (Player p : w.getPlayers()) {
                                if (p.hasPermission("snw.sc")) {
                                    p.sendMessage("§3『§b§l§oSC§3』 §c" + player.getDisplayName() + " §f»§3 " + allArgs);
                                    // /sc <message>;
                                }
                            }
                        }

                    }
                }
                return true;

            case "gmc":
                if (player.hasPermission("snw.gmc") || player.hasPermission("snw.gm.*")) {
                    player.setGameMode(GameMode.CREATIVE);
                    player.sendMessage("§3[§dParadisu §bツ§3] §fYour gamemode has been set to §3Creative§f!");
                }
                return true;


            case "gms":
                if (player.hasPermission("snw.gms") || player.hasPermission("snw.gm.*")) {
                    player.setGameMode(GameMode.SURVIVAL);
                    player.sendMessage("§3[§dParadisu §bツ§3] §fYour gamemode has been set to §3Survival§f!");
                }
                return true;

            case "gmsp":
                if (player.hasPermission("snw.gmsp") || player.hasPermission("snw.gm.*")) {
                    player.setGameMode(GameMode.SPECTATOR);
                    player.sendMessage("§3[§dParadisu §bツ§3] §fYour gamemode has been set to §3Spectator§f!");
                }
                return true;

            case "gma":
                if (player.hasPermission("snw.gma") || player.hasPermission("snw.gm.*")) {
                    player.setGameMode(GameMode.ADVENTURE);
                    player.sendMessage("§3[§dParadisu §bツ§3] §fYour gamemode has been set to §3Adventure§f!");
                }
                return true;

            case "nickname":
                if (player.hasPermission("snw.nickname")) {
                    if (args.length == 0) {
                        // /nick (no args)
                        player.sendMessage("§3[§dParadisu §bツ§3] §fIncorrect usage; Please use '/nick <nickname>'");
                    } else {
                        String nick = "";
                        for (String arg : args) {
                            nick += arg + " ";
                        }
                        nick = nick.substring(0, nick.length() - 1);

                        nick = nick.replaceAll("&", "§");
                        player.sendMessage("§3[§dParadisu §bツ§3] §fYour nickname was changed to §n" + nick + "§f!");
                        snwplugin.getPlugin(snwplugin.class).getConfig().set(player.getName(), nick);
                        snwplugin.getPlugin(snwplugin.class).saveConfig();

                    }

                    // /nick <nickname>;
                }
                return true;


            case "enderchest":
                if (player.hasPermission("snw.ec")) {
                    player.openInventory(player.getEnderChest());
                }
                return true;


            case "workbench":
                if (player.hasPermission("snw.wb")) {
                    player.openWorkbench(null, true);
                }
                return true;

            case "invsee":
                if (player.hasPermission("snw.invsee")) {

                    if (args.length < 1) {
                        player.sendMessage("§3[§dParadisu §bツ§3] §fIncorrect usage; Please use '/invsee <player>'");
                    }
                    if (args.length == 1 && player.hasPermission("snw.invsee")) {
                        player.sendMessage("§3[§dParadisu §bツ§3] §fCommand is a WIP");
                    }
                }
                return true;


            case "day":
                if (player.hasPermission("snw.time")) {
                    player.getWorld().setTime(1000);
                    player.sendMessage("§3[§dParadisu §bツ§3] §fYou set the time to §3§nDay§f!");
                }
                return true;

            case "night":
                if (player.hasPermission("snw.time")) {
                    player.getWorld().setTime(14000);
                    player.sendMessage("§3[§dParadisu §bツ§3] §fYou set the time to §3§nNight§f!");
                }
                return true;


            case "noon":
                if (player.hasPermission("snw.time")) {
                    player.getWorld().setTime(600);
                    player.sendMessage("§3[§dParadisu §bツ§3] §fYou set the time to §3§nNoon§f!");
                }
                return true;

            case "spawn":
                if (player.hasPermission("snw.spawn")) {
                    player.performCommand("warp snw");
                }
                return true;


            case "sex":
                if (player.hasPermission("snw.sex")) {
                    player.sendMessage("§3[§dParadisu §bツ§3] §fYou are now having sex!!!!!");
                } else {
                    player.sendMessage("§3[§dParadisu §bツ§3] §fYou are not worthy of sex");
                }
                return true;

            case "tphere":
                if (player.hasPermission("snw.tphere") || player.hasPermission("snw.tp.*")) {

                    if (args.length == 1) {
                        Player target = Bukkit.getPlayerExact((args[0]));
                        target.teleport((player.getLocation()));
                        player.sendMessage("§3[§dParadisu §bツ§3] §fSuccessfully teleported §3" + target + "§fto you.");

                    } else {
                        player.sendMessage("§3[§dParadisu §bツ§3] §fPlease do /tphere (player)");
                    }
                }
                return true;

            case "tp":
                if (player.hasPermission("snw.tp") || player.hasPermission("snw.tp.*")) {
                    if (args.length < 1) {
                        player.sendMessage("§3[§dParadisu §bツ§3] §fPlease do `/tp (player)` OR `/tp (player1) (player2)`");


                        // TP TO A SINGLE PLAYER
                    } else if (args.length == 1) {
                        Player target = Bukkit.getPlayerExact((args[0]));

                        try {
                            player.teleport((target.getLocation()));
                            player.sendMessage("§3[§dParadisu §bツ§3] §fSuccessfully teleported to§3 " + args[0] + "§f.");
                        } catch (NullPointerException e) {
                            player.sendMessage("§3[§dParadisu §bツ§3] §fThis player does not exist or is offline.");
                        }

                        // TP ANOTHER PLAYER TO ANOTHER PLAYER
                    }
                    if (args.length == 2) {
                        Player PlayerToSend = Bukkit.getPlayerExact(args[0]);
                        Player target = Bukkit.getPlayerExact(args[1]);

                        try {
                            PlayerToSend.teleport(target.getLocation());
                            player.sendMessage("§3[§dParadisu §bツ§3] §fSuccessfully teleported §3" + PlayerToSend + "§fto §3" + target + "§f.");
                        } catch (NullPointerException e) {
                            player.sendMessage("§3[§dParadisu §bツ§3] §fOne of these players do not exist or are offline.");
                        }
                        // TOO MANY ARGS
                    } else if (args.length > 2) {
                        player.sendMessage("§3[§dParadisu §bツ§3] §fPlease do `/tp (player)` OR `/tp (player1) (player2)`");
                    }
                }
                return true;

            case "skull":
                if (player.hasPermission("snw.skull")) {
                    if (args.length == 1) {

                        String owner = args[0];
                        ItemStack itemSkull = new ItemStack(Material.PLAYER_HEAD, 1);
                        SkullMeta metaSkull = null;
                        metaSkull = (SkullMeta) itemSkull.getItemMeta();
                        ItemMeta meta = itemSkull.getItemMeta();
                        metaSkull.setOwner(owner);
                        meta.setDisplayName("§fSkull of §3" + owner + "§f!");

                        itemSkull.setItemMeta(metaSkull);
                        player.getInventory().addItem(itemSkull);

                        // player.performCommand("give @p minecraft:player_head{SkullOwner:\"" + args[0] + "\"}");
                        player.sendMessage("§3[§dParadisu §bツ§3] §fWe successfully gave you the head of §3§n" + owner + "§f!");

                    } else { player.sendMessage("§3[§dParadisu §bツ§3] §fPlease provide a valid name!"); }
                }

            case "clearinventory":

                if (player.hasPermission("snw.clearinventory")) {

                    if (args.length == 0) {

                        player.getInventory().clear();
                        player.sendMessage("§3[§dParadisu §bツ§3] §fYour inventory has been cleared.");
                    } else if (args.length == 1) {
                        String cleartarget = args[0];
                        Player target = Bukkit.getServer().getPlayer(cleartarget);
                        target.getInventory().clear();

                        target.sendMessage("§3[§dParadisu §bツ§3] §fYour inventory has been cleared by another player.");
                        player.sendMessage("§3[§dParadisu §bツ§3] §fYou cleared the inventory of§3 " + cleartarget + " §f!");
                    } else if (args.length > 1) {
                        player.sendMessage("§3[§dParadisu §bツ§3] §fPlease provide a signle valid name!");
                    }
                }


            case "trashcan":
                if (player.hasPermission("snw.trashcan")) {
                    PluginInventories inv = new PluginInventories();
                    inv.TrashCanInv(player);
                    player.sendMessage("§3[§dParadisu §bツ§3] §fOpened a trashcan");
                    player.sendMessage("§3[§dParadisu §bツ§3] §fLarge thanks to InstantRamen for large development of /trash");
                }

            case "fly":
                if (player.hasPermission("snw.fly")) {
                    if (args.length < 1) {
                        if (player.isFlying()) {
                            player.setFlying(false);
                            player.sendMessage("§3[§dParadisu §bツ§3] §fYou are no longer flying");

                        } else if (!player.isFlying()) {
                            player.setFlying(true);
                            player.sendMessage("§3[§dParadisu §bツ§3] §fYou are now flying");

                        } else {
                            player.sendMessage("§3[§dParadisu §bツ§3] §fHow can you be flying and not flying?");
                        }

                        // FLY OTHER
                        // FLY OTHER
                        // FLY OTHER
                        } else if (args.length >= 1 && player.hasPermission("snw.flyother")) {
                            String flytarget = args[0];
                            Player target = Bukkit.getServer().getPlayer(flytarget);

                        if (target.isFlying()) {
                            target.setFlying(false);
                            player.sendMessage("§3[§dParadisu §bツ§3] §3" + flytarget + " §fis no longer flying!");
                            target.sendMessage("§3[§dParadisu §bツ§3] §fYou are no longer flying");

                        } else if (!player.isFlying()) {
                            target.setFlying(true);
                            player.sendMessage("§3[§dParadisu §bツ§3] §3" + flytarget + " §fis now flying!");
                            target.sendMessage("§3[§dParadisu §bツ§3] §fYou are now flying");

                        } else {
                            player.sendMessage("§3[§dParadisu §bツ§3] §fHow can they be flying and not flying?");
                        }
                    }
                }

                default:
                    return false;
                    //complain
        }
    }
}
