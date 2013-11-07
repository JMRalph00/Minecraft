package spacecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemStainlessSteel extends Item
{
	public ItemStainlessSteel(int id)
	{
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName("Steel");
		this.setTextureName("spacecraftTexture:stainlessSteel");
	}

}
