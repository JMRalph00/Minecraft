package spacecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemAluminum extends Item
{
	public ItemAluminum(int id)
	{
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName("aluminum");
		this.setTextureName("spacecraft:aluminumIngot");
	}
}
