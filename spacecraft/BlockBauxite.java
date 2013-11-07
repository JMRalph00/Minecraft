package spacecraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBauxite extends Block
{
	public BlockBauxite(int id, Material material)
	{
		super(id, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName("aluminumOre");
		this.setTextureName("spacecrafttexture:aluminumOre");
		this.setHardness(3.0F);
		this.setResistance(4.0F);
	}
	
}
