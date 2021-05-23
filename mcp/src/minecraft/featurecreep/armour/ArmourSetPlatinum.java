package featurecreep.armour;

import featurecreep.FeatureCreepMC;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;


public class ArmourSetPlatinum extends ItemArmor{

	public ArmourSetPlatinum(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String nameToAdd) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		// TODO Auto-generated constructor stub
	this.setCreativeTab(CreativeTabs.tabCombat);
	this.maxStackSize = 1;
	this.material = par2EnumArmorMaterial;
	this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
	par2EnumArmorMaterial.getDamageReductionAmount(par4);
	nametoadd = nameToAdd;
	
	}

	public EnumArmorMaterial material;
	public String nametoadd;
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if(stack.toString().contains("legginngs")) {
		return "featurecreep:" + nametoadd + "_2.png";	
		}
		if(stack.toString().contains("Leggings")) if(itemID == featurecreep.FeatureCreepMC.PLATNIUM_LEGGINGS.itemID)
				{
			return "featurecreep:" + nametoadd + "_2.png";
				}
		
		return "featurecreep:" + nametoadd + "_1.png";
		
		
	}
	
	public void registerIcons (IconRegister par1iconRegister)
	{
		if (itemID == FeatureCreepMC.EMERALD_HELMET.itemID) {
			itemIcon = par1iconRegister.registerIcon("featurecreep:platinum_helmet");
		}
if (itemID == FeatureCreepMC.PLATINUM_CHESTPLATE.itemID) {
	itemIcon = par1iconRegister.registerIcon("featurecreep:platinum_chestplate");

		}
if (itemID == FeatureCreepMC.PLATNIUM_LEGGINGS.itemID) {
	itemIcon = par1iconRegister.registerIcon("featurecreep:platinum_leggings");

}
if (itemID == FeatureCreepMC.PLATINUM_BOOTS.itemID) {
	itemIcon = par1iconRegister.registerIcon("featurecreep:platinum_boots");
	
}
		
	}
	
	
	
	
}
