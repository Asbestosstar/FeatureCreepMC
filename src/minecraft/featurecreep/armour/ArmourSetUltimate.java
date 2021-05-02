package featurecreep.armour;

import featurecreep.FeatureCreepMC;
import cpw.mods.fml.common.network.Player;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.item.Item;


public class ArmourSetUltimate extends ItemArmor{

	public ArmourSetUltimate(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String nameToAdd) {
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
		if(stack.toString().contains("Leggings")) if(itemID == featurecreep.FeatureCreepMC.ULTIMATE_LEGGINGS.itemID)
				{
			return "featurecreep:" + nametoadd + "_2.png";
				}
		
		return "featurecreep:" + nametoadd + "_1.png";
		
		
	}
	
    public void onCreated(ItemStack stack, World worldIn, Player playerIn) {
        stack.addEnchantment(Enchantment.featherFalling, 5);
        stack.addEnchantment(Enchantment.protection, 5);
        stack.addEnchantment(Enchantment.blastProtection, 5);
        stack.addEnchantment(Enchantment.fireProtection, 5);
        stack.addEnchantment(Enchantment.respiration, 5);
        stack.addEnchantment(Enchantment.aquaAffinity, 5);

}

	
	
	
	public void registerIcons (IconRegister par1iconRegister)
	{
		if (itemID == FeatureCreepMC.ULTIMATE_HELMET.itemID) {
			itemIcon = par1iconRegister.registerIcon("featurecreep:ultimate_helmet");
		}
if (itemID == FeatureCreepMC.ULTIMATE_CHESTPLATE.itemID) {
	itemIcon = par1iconRegister.registerIcon("featurecreep:ultimate_chestplate");

		}
if (itemID == FeatureCreepMC.ULTIMATE_LEGGINGS.itemID) {
	itemIcon = par1iconRegister.registerIcon("featurecreep:ultimate_leggings");

}
if (itemID == FeatureCreepMC.ULTIMATE_BOOTS.itemID) {
	itemIcon = par1iconRegister.registerIcon("featurecreep:ultimate_boots");
	
}
		
	}
	
	
	
	
}
