package com.ioserakbar.first_mod;

import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Main.MOD_ID)
public class item_register {
	
	public static final Item shity_dust1 = null;
	public static final Item shitanium = null;
	public static final Item shity_food = null;
	
	public static final Item shity_axe = null;
	public static final Item shity_sword = null;
	public static final Item shity_pickaxe = null;
	public static final Item shity_hoe = null;
	public static final Item shity_shovel = null;
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		
		event.getRegistry().registerAll(
				
				new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(16).setNoRepair()).setRegistryName(Main.MOD_ID, "shity_dust1"),
				new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(Main.MOD_ID, "shitanium"),
				new Item(new Item.Properties().group(ItemGroup.FOOD)).setRegistryName(Main.MOD_ID,"shity_food"),
				
				new AxeItem(toolMaterialList.shit, -1.0f, 6.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(Main.MOD_ID, "shity_axe"),
				new SwordItem(toolMaterialList.shit,0,3.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(Main.MOD_ID,"shity_sword"),
				new PickaxeItem(toolMaterialList.shit,-3,6.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(Main.MOD_ID,"shity_pickaxe"),
				new HoeItem(toolMaterialList.shit,6.0f,new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(Main.MOD_ID,"shity_hoe"),
				new ShovelItem(toolMaterialList.shit,-5.0f, 4.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(Main.MOD_ID,"shity_shovel"),
				
				new BlockItem(block_register.shity_ore, new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(block_register.shity_ore.getRegistryName()),
				new BlockItem(block_register.shity_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block_register.shity_block.getRegistryName())
		);
		
	}
}
