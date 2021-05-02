package featurecreep.tools.amethyst;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class AmethystPickaxe extends ItemPickaxe{

	public AmethystPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		// TODO Auto-generated constructor stub
		
		this.setCreativeTab(CreativeTabs.tabTools);
		
		}

		public void registerIcons(IconRegister iconRegister)
		{
		itemIcon = iconRegister.registerIcon("featurecreep:amethyst_pickaxe");	
		}
		
}
