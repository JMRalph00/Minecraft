package spacecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMeteorite extends Block
{
	public BlockMeteorite(int id, Material material)
	{
		super(id, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName("Meteorite");
		this.setTextureName("spacecraft:meteorite");
		this.setHardness(30.0F);
		this.setResistance(1000.0F);
	}
}
