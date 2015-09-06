/**
 * @author kotmw0701
 * @license LGPLv3
 * @copyright Copyright kotmw 2015
 *
 */
package jp.kotmw;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	public void onEnable(){}
	public void onDisable(){}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
	{
		if(args.length >= 1)
		{
			Player player = Bukkit.getPlayer(args[0]);
			if(player == null)
			{
				sender.sendMessage("そのプレイヤーは存在しません！");
				return false;
			}
			if("leather".equalsIgnoreCase(args[1]) || "l".equalsIgnoreCase(args[1]))
			{
				Armor armor = Armor.LEATHER;
				if(args.length == 3)
				{
					if("helm".equalsIgnoreCase(args[2]) || "h".equalsIgnoreCase(args[2]))
					{
						this.HelmArmor(player, armor);
					}
					else if("chest".equalsIgnoreCase(args[2]) || "c".equalsIgnoreCase(args[2]))
					{
						this.ChestArmor(player, armor);
					}
					else if("leggings".equalsIgnoreCase(args[2]) || "l".equalsIgnoreCase(args[2]))
					{
						this.LegArmor(player, armor);
					}
					else if("boots".equalsIgnoreCase(args[2]) || "b".equalsIgnoreCase(args[2]))
					{
						this.FootArmor(player, armor);
					}
				} else {
					this.AllArmor(player, armor);
				}
			} else if("chainmail".equalsIgnoreCase(args[1]) || "c".equalsIgnoreCase(args[1])) {
				Armor armor = Armor.CHAINMAIL;
				if(args.length == 3)
				{
					if("helm".equalsIgnoreCase(args[2]) || "h".equalsIgnoreCase(args[2]))
					{
						this.HelmArmor(player, armor);
					}
					else if("chest".equalsIgnoreCase(args[2]) || "c".equalsIgnoreCase(args[2]))
					{
						this.ChestArmor(player, armor);
					}
					else if("leggings".equalsIgnoreCase(args[2]) || "l".equalsIgnoreCase(args[2]))
					{
						this.LegArmor(player, armor);
					}
					else if("boots".equalsIgnoreCase(args[2]) || "b".equalsIgnoreCase(args[2]))
					{
						this.FootArmor(player, armor);
					}
				} else {
					this.AllArmor(player, armor);
				}
			} else if("iron".equalsIgnoreCase(args[1]) || "i".equalsIgnoreCase(args[1])) {
				Armor armor = Armor.IRON;
				if(args.length == 3)
				{
					if("helm".equalsIgnoreCase(args[2]) || "h".equalsIgnoreCase(args[2]))
					{
						this.HelmArmor(player, armor);
					}
					else if("chest".equalsIgnoreCase(args[2]) || "c".equalsIgnoreCase(args[2]))
					{
						this.ChestArmor(player, armor);
					}
					else if("leggings".equalsIgnoreCase(args[2]) || "l".equalsIgnoreCase(args[2]))
					{
						this.LegArmor(player, armor);
					}
					else if("boots".equalsIgnoreCase(args[2]) || "b".equalsIgnoreCase(args[2]))
					{
						this.FootArmor(player, armor);
					}
				} else {
					this.AllArmor(player, armor);
				}
			} else if("gold".equalsIgnoreCase(args[1]) || "g".equalsIgnoreCase(args[1])) {
				Armor armor = Armor.GOLD;
				if(args.length == 3)
				{
					if("helm".equalsIgnoreCase(args[2]) || "h".equalsIgnoreCase(args[2]))
					{
						this.HelmArmor(player, armor);
					}
					else if("chest".equalsIgnoreCase(args[2]) || "c".equalsIgnoreCase(args[2]))
					{
						this.ChestArmor(player, armor);
					}
					else if("leggings".equalsIgnoreCase(args[2]) || "l".equalsIgnoreCase(args[2]))
					{
						this.LegArmor(player, armor);
					}
					else if("boots".equalsIgnoreCase(args[2]) || "b".equalsIgnoreCase(args[2]))
					{
						this.FootArmor(player, armor);
					}
				} else {
					this.AllArmor(player, armor);
				}
			} else if("diamond".equalsIgnoreCase(args[1]) || "d".equalsIgnoreCase(args[1])) {
				Armor armor = Armor.DIAMOND;
				if(args.length == 3)
				{
					if("helm".equalsIgnoreCase(args[2]) || "h".equalsIgnoreCase(args[2]))
					{
						this.HelmArmor(player, armor);
					}
					else if("chest".equalsIgnoreCase(args[2]) || "c".equalsIgnoreCase(args[2]))
					{
						this.ChestArmor(player, armor);
					}
					else if("leggings".equalsIgnoreCase(args[2]) || "l".equalsIgnoreCase(args[2]))
					{
						this.LegArmor(player, armor);
					}
					else if("boots".equalsIgnoreCase(args[2]) || "b".equalsIgnoreCase(args[2]))
					{
						this.FootArmor(player, armor);
					}
				} else {
					this.AllArmor(player, armor);
				}
			}
		} else {
			sender.sendMessage("Wrong Syntax used! Use /set_an_armor [player] [armor_material](-[armor_item]) Example: /setarmor Notch Diamond");
		}
		return false;
	}

	private void AllArmor(Player player, Armor armor)
	{
		player.getInventory().setHelmet(this.sethelm(armor));
		player.getInventory().setChestplate(this.setchestplate(armor));
		player.getInventory().setLeggings(this.setleggings(armor));
		player.getInventory().setBoots(this.setboots(armor));
	}

	private void HelmArmor(Player player, Armor helm)
	{
		player.getInventory().setHelmet(this.sethelm(helm));
	}

	private void ChestArmor(Player player, Armor plate)
	{
		player.getInventory().setChestplate(this.setchestplate(plate));
	}

	private void LegArmor(Player player, Armor leggings)
	{
		player.getInventory().setLeggings(this.setleggings(leggings));
	}

	private void FootArmor(Player player, Armor boots)
	{
		player.getInventory().setBoots(this.setboots(boots));
	}

	public enum Armor {
		LEATHER, CHAINMAIL, IRON, GOLD, DIAMOND, AIR;
	}

	private ItemStack sethelm(Armor helm)
	{
		ItemStack item = null;
		switch (helm)
		{
		case AIR:
			item = new ItemStack(Material.AIR ,1);
			break;
		case CHAINMAIL:
			item = new ItemStack(Material.CHAINMAIL_HELMET);
			break;
		case DIAMOND:
			item = new ItemStack(Material.DIAMOND_HELMET);
			break;
		case GOLD:
			item = new ItemStack(Material.GOLD_HELMET);
			break;
		case IRON:
			item = new ItemStack(Material.IRON_HELMET);
			break;
		case LEATHER:
			item = new ItemStack(Material.LEATHER_HELMET);
			break;
		}
		return item;
	}

	private ItemStack setchestplate(Armor chestplate)
	{
		ItemStack item = null;
		switch (chestplate)
		{
		case AIR:
			item = new ItemStack(Material.AIR ,1);
			break;
		case CHAINMAIL:
			item = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
			break;
		case DIAMOND:
			item = new ItemStack(Material.DIAMOND_CHESTPLATE);
			break;
		case GOLD:
			item = new ItemStack(Material.GOLD_CHESTPLATE);
			break;
		case IRON:
			item = new ItemStack(Material.IRON_CHESTPLATE);
			break;
		case LEATHER:
			item = new ItemStack(Material.LEATHER_CHESTPLATE);
			break;
		}
		return item;
	}

	private ItemStack setleggings(Armor leggings)
	{
		ItemStack item = null;
		switch (leggings)
		{
		case AIR:
			item = new ItemStack(Material.AIR ,1);
			break;
		case CHAINMAIL:
			item = new ItemStack(Material.CHAINMAIL_LEGGINGS);
			break;
		case DIAMOND:
			item = new ItemStack(Material.DIAMOND_LEGGINGS);
			break;
		case GOLD:
			item = new ItemStack(Material.GOLD_LEGGINGS);
			break;
		case IRON:
			item = new ItemStack(Material.IRON_LEGGINGS);
			break;
		case LEATHER:
			item = new ItemStack(Material.LEATHER_LEGGINGS);
			break;
		}
		return item;
	}

	private ItemStack setboots(Armor boots)
	{
		ItemStack item = null;
		switch (boots)
		{
		case AIR:
			item = new ItemStack(Material.AIR ,1);
			break;
		case CHAINMAIL:
			item = new ItemStack(Material.CHAINMAIL_BOOTS);
			break;
		case DIAMOND:
			item = new ItemStack(Material.DIAMOND_BOOTS);
			break;
		case GOLD:
			item = new ItemStack(Material.GOLD_BOOTS);
			break;
		case IRON:
			item = new ItemStack(Material.IRON_BOOTS);
			break;
		case LEATHER:
			item = new ItemStack(Material.LEATHER_BOOTS);
			break;
		}
		return item;
	}
}
