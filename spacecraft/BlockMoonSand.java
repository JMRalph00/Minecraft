package spacecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMoonSand extends Block
{
	public BlockMoonSand(int id, Material material)
	{
		super(id, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName("MoonSand");
		this.setTextureName("spacecraftTexture:moonDust");
		this.setHardness(0.5F);
	}
}
