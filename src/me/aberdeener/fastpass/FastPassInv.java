package me.aberdeener.fastpass;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FastPassInv {

	private static ItemStack holder0, holder1, yesBlock, holder4, buyBlock, holder6, holder7, noBlock, holder9;

	public static Inventory FastPassConfirm(String attraction) {
		Inventory FastPassConfirm = Bukkit.createInventory(null, 9, attraction);
		FastPassConfirm.addItem(holder0, holder1, yesBlock, holder4, buyBlock, holder6, noBlock, holder7, holder9);
		FastPassConfirm.setItem(0, null);
		FastPassConfirm.setItem(1, null);
		FastPassConfirm.setItem(3, null);
		FastPassConfirm.setItem(5, null);
		FastPassConfirm.setItem(7, null);
		FastPassConfirm.setItem(8, null);

		return FastPassConfirm;
	}

	public static void init() {

		holder0 = new ItemStack(Material.GLASS_PANE);
		ItemMeta holder0Meta = holder0.getItemMeta();
		holder0Meta.setDisplayName("10");
		holder0.setItemMeta(holder0Meta);

		holder1 = new ItemStack(Material.GLASS_PANE);
		ItemMeta holder1Meta = holder1.getItemMeta();
		holder1Meta.setDisplayName("1");
		holder1.setItemMeta(holder1Meta);

		yesBlock = new ItemStack(Material.LIME_CONCRETE, 1);
		ItemMeta yesBlockMeta = yesBlock.getItemMeta();
		yesBlockMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&',
				FastPass.getInstance().getConfig().getString("blocks.yesBlock.name")));
		yesBlock.setItemMeta(yesBlockMeta);

		holder4 = new ItemStack(Material.GLASS_PANE);
		ItemMeta holder4Meta = holder4.getItemMeta();
		holder4Meta.setDisplayName("3");
		holder4.setItemMeta(holder4Meta);

		buyBlock = new ItemStack(Material.PAPER, 1);
		ItemMeta buyBlockMeta = buyBlock.getItemMeta();
		buyBlockMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&',
				FastPass.getInstance().getConfig().getString("blocks.buyBlock.name")));
		buyBlock.setItemMeta(buyBlockMeta);

		holder6 = new ItemStack(Material.GLASS_PANE);
		ItemMeta holder6Meta = holder6.getItemMeta();
		holder6Meta.setDisplayName("5");
		holder6.setItemMeta(holder6Meta);
		
		noBlock = new ItemStack(Material.RED_CONCRETE);
		ItemMeta noBlockMeta = noBlock.getItemMeta();
		noBlockMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&',
				FastPass.getInstance().getConfig().getString("blocks.noBlock.name")));
		noBlock.setItemMeta(noBlockMeta);

		holder7 = new ItemStack(Material.GLASS_PANE);
		ItemMeta holder7Meta = holder7.getItemMeta();
		holder7Meta.setDisplayName("6");
		holder7.setItemMeta(holder7Meta);

		holder9 = new ItemStack(Material.GLASS_PANE);
		ItemMeta holder9Meta = holder9.getItemMeta();
		holder9Meta.setDisplayName("7");
		holder9.setItemMeta(holder9Meta);

	}
}