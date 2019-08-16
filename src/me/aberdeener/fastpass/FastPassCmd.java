package me.aberdeener.fastpass;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FastPassCmd implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

		// base command
		if (commandLabel.equalsIgnoreCase("fastpass")) {

			// console sender check
			if (!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.GOLD + "Themepark" + ChatColor.YELLOW + ": " + ChatColor.RED
						+ "Please execute in-game!");
				return true;
			}

			Player p = (Player) sender;

			// permission check
			if (!sender.hasPermission("fastpass.use")) {
				sender.sendMessage(ChatColor.RED + "You don't have permission to execute this command!");
				return true;
			}

			else {

				if (args.length == 0) {
					sender.sendMessage(ChatColor.GOLD + "Themepark" + ChatColor.YELLOW + ": " + ChatColor.RED
							+ "Correct Usage:  /fastpass <teleport|store|reload>");
					return true;
				}

				else if (args[0].equalsIgnoreCase("reload")) {

					// reload permission check
					if (!sender.hasPermission("fastpass.reload")) {
						sender.sendMessage(ChatColor.DARK_RED + "You don't have permission to execute this command!");
						return true;
					} else {
						sender.sendMessage(ChatColor.GOLD + "Themepark" + ChatColor.YELLOW + ": " + ChatColor.GREEN
								+ "Reloading config...");
						FastPass.getInstance().reloadConfig();
						sender.sendMessage(ChatColor.GOLD + "Themepark" + ChatColor.YELLOW + ": " + ChatColor.GREEN
								+ "FastPass config reloaded.");
						return true;
					}
				}

				else if (args[0].equalsIgnoreCase("store")) {
					sender.sendMessage(ChatColor.GOLD + "Themepark" + ChatColor.YELLOW + ": " + ChatColor.GREEN
							+ "Purchase FastPasses at our store: " + ChatColor.YELLOW
							+ FastPass.getInstance().getConfig().getString("store-url"));
					return true;
				}

				else if (args[0].equalsIgnoreCase("teleport")) {

					// create fastPass variable with meta displayname
					ItemStack fastPass = new ItemStack(Material.PAPER);
					ItemMeta fastPassMeta = fastPass.getItemMeta();
					fastPassMeta.setDisplayName("FastPass");
					fastPass.setItemMeta(fastPassMeta);

					// ensure they have the right item in their inventory
					// REPLACE WHEN FASTPASS IS FIXED
					if (p.getInventory().contains(Material.PAPER)) {

						// now check for the sub command/argument and send player to the location in
						// config
						if (args.length == 1) {
							sender.sendMessage(ChatColor.GOLD + "Themepark" + ChatColor.YELLOW + ": " + ChatColor.RED
									+ "Correct Usage:  /fastpass teleport <attraction>");
							return true;
						}

						else if (FastPass.getInstance().getConfig().contains("attractions." + args[1])) {
							String attraction = args[1];
							p.openInventory(FastPassInv.FastPassConfirm(attraction));
							return true;
						}

						else {
							sender.sendMessage(ChatColor.GOLD + "Themepark" + ChatColor.YELLOW + ": " + ChatColor.RED
									+ "Invalid Attraction!");
							return true;
						}

					}

					else {
						sender.sendMessage(ChatColor.GOLD + "Themepark" + ChatColor.YELLOW + ": " + ChatColor.RED
								+ "You need a FastPass to run this command!");
						return true;
					}
				}

				else {
					sender.sendMessage(ChatColor.GOLD + "Themepark" + ChatColor.YELLOW + ": " + ChatColor.RED
							+ "Correct Usage:  /fastpass <teleport|store|reload>");
					return true;
				}

			}
		}
		return true;
	}
}