package spacecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMoonRock extends Block
{
	public BlockMoonRock(int id, Material material)
	{
		super(id, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName("MoonRock");
		this.setTextureName("spacecraft:moonRock");
		this.setHardness(1.5F);
		this.setResistance(10.0F);
	}
}
