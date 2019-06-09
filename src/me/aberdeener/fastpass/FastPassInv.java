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
		FastPassConfirm.addItem(holder0, holder1, yesBlock, holder4, buyBlock, holder6, holder7, noBlock, holder9);
		return FastPassConfirm;
	}
	

	public static void init() {

		holder0 = new ItemStack (Material.GLASS_PANE);
		ItemMeta holder0Meta = holder0.getItemMeta();
		holder0Meta.setDisplayName("1");
		holder0.setItemMeta(holder0Meta);
		
		holder1 = new ItemStack (Material.GLASS_PANE);
		ItemMeta holder1Meta = holder1.getItemMeta();
		holder1Meta.setDisplayName("2");
		holder1.setItemMeta(holder1Meta);
		
		yesBlock = new ItemStack(Material.LIME_CONCRETE, 1);
		ItemMeta yesBlockMeta = yesBlock.getItemMeta();
		yesBlockMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Continue...");
		yesBlock.setItemMeta(yesBlockMeta);
		
		holder4 = new ItemStack (Material.GLASS_PANE);
		ItemMeta holder4Meta = holder4.getItemMeta();
		holder4Meta.setDisplayName("3");
		holder4.setItemMeta(holder4Meta);

		buyBlock = new ItemStack(Material.PAPER, 1);
		ItemMeta buyBlockMeta = buyBlock.getItemMeta();
		buyBlockMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.ITALIC + "Buy FastPasses");
		buyBlock.setItemMeta(buyBlockMeta);
		
		holder6 = new ItemStack (Material.GLASS_PANE);
		ItemMeta holder6Meta = holder6.getItemMeta();
		holder6Meta.setDisplayName("4");
		holder6.setItemMeta(holder6Meta);
		
		holder7 = new ItemStack (Material.GLASS_PANE);
		ItemMeta holder7Meta = holder7.getItemMeta();
		holder7Meta.setDisplayName("5");
		holder7.setItemMeta(holder7Meta);

		noBlock = new ItemStack(Material.RED_CONCRETE);
		ItemMeta noBlockMeta = noBlock.getItemMeta();
		noBlockMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Cancel...");
		noBlock.setItemMeta(noBlockMeta);
		
		holder9 = new ItemStack (Material.GLASS_PANE);
		ItemMeta holder9Meta = holder9.getItemMeta();
		holder9Meta.setDisplayName("6");
		holder9.setItemMeta(holder9Meta);

	}
}