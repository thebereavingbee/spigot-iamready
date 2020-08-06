package me.thebereavingbee.iamready;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		//startup
		//reloads
		//enable
	}
	
	@Override
	public void onDisable() {
		// shutdown
		// restart
		// plugin restart
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("iamready") == true) {
			if(sender instanceof Player) {
				//player
				Player player = (Player) sender;
				if(player.hasPermission("iamready.use") == true) {
					player.sendMessage(ChatColor.YELLOW + "Thanks for reading the rules! You are now ready to play!");	
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+ player.getName() +" parent add rookie");
					return true;
				}
				player.sendMessage(ChatColor.YELLOW + "You've already read the rules! Good on you!");
				return true;
			}
			else{
				//console
				sender.sendMessage("Hey console! You're already op'd!");		
				return true;
			}
		}
		return false;
	}
}
