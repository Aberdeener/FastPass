package me.aberdeener.fastpass;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FastPassInv {

	private static ItemStack yesBlock, buyBlock, noBlock;

	public static Inventory FastPassConfirm(String attraction) {
		Inventory FastPassConfirm = Bukkit.createInventory(null, 9, attraction);
		FastPassConfirm.setItem(0, null);
		FastPassConfirm.setItem(1, null);
		FastPassConfirm.setItem(2, yesBlock);
		FastPassConfirm.setItem(3, null);
		FastPassConfirm.setItem(4, buyBlock);
		FastPassConfirm.setItem(5, null);
		FastPassConfirm.setItem(6, noBlock);
		FastPassConfirm.setItem(7, null);
		FastPassConfirm.setItem(8, null);

		return FastPassConfirm;
	}

	public static void init() {

		yesBlock = new ItemStack(Material.LIME_CONCRETE, 1);
		ItemMeta yesBlockMeta = yesBlock.getItemMeta();
		yesBlockMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&',
				FastPass.getInstance().getConfig().getString("blocks.yesBlock.name")));
		yesBlock.setItemMeta(yesBlockMeta);

		buyBlock = new ItemStack(Material.PAPER, 1);
		ItemMeta buyBlockMeta = buyBlock.getItemMeta();
		buyBlockMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&',
				FastPass.getInstance().getConfig().getString("blocks.buyBlock.name")));
		buyBlock.setItemMeta(buyBlockMeta);
		
		noBlock = new ItemStack(Material.RED_CONCRETE);
		ItemMeta noBlockMeta = noBlock.getItemMeta();
		noBlockMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&',
				FastPass.getInstance().getConfig().getString("blocks.noBlock.name")));
		noBlock.setItemMeta(noBlockMeta);

	}
}