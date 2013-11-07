package spacecraft;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenMoon extends BiomeGenBase
{
	public BiomeGenMoon(int par1)
	{
		super(par1);
		//this.topBlock = ((byte)Block.stone.blockID);
		// There is an Issue with this line of code. The moonRock will not generate. Somthing wrong with moon rock files.
		//this.fillerBlock = ((byte)Spacecraft.moonRock.blockID);
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.maxHeight = 145F;
		this.minHeight = 130F;
	}
}
