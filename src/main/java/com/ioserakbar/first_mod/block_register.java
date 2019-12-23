package com.ioserakbar.first_mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Main.MOD_ID)
public class block_register {

	public static final Block shity_ore = null;
	public static final Block shity_block = null;
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		
		event.getRegistry().registerAll(
				
				new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(Main.MOD_ID,"shity_ore"),
				new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(Main.MOD_ID,"shity_block")
				
		);
	}
}
