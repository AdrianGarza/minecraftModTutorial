package com.ioserakbar.first_mod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Main.MOD_ID)
public class item_register {
	
	public static final Item shity_dust1 = null;
	public static final Item shitanium = null;
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		
		event.getRegistry().registerAll(
				
				new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(16).setNoRepair()).setRegistryName(Main.MOD_ID, "shity_dust1"),
				new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(Main.MOD_ID, "shitanium")
		);
		
	}
}
