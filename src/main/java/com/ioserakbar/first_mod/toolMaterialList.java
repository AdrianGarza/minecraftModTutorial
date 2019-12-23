package com.ioserakbar.first_mod;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum toolMaterialList implements IItemTier{
	
	shit(10.0f, 9.0f, 800, 3, 25, item_register.shitanium);
	
	private  float attackDamage, efficienty;
	private int harvestLevel, enchantability, durability;
	private Item repairMaterial;
	
	private toolMaterialList(float attackDamage, float efficienty, int durability, int harvestLevel,int enchantability, Item repairMaterial) {
		
		this.attackDamage = attackDamage;
		this.efficienty = efficienty;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantability;
		this.durability = durability;
		this.repairMaterial = repairMaterial;
		
		
	}

	@Override
	public int getMaxUses() {
		return durability;
	}

	@Override
	public float getEfficiency() {
		return efficienty;
	}

	@Override
	public float getAttackDamage() {
		return attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		return harvestLevel;
	}

	@Override
	public int getEnchantability() {
		return enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromItems(this.repairMaterial);
	}
	
}
