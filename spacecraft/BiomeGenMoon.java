package spacecraft;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenMoon extends BiomeGenBase
{
	public BiomeGenMoon(int par1)
	{
		super(par1);
		this.topBlock = ((byte)Spacecraft.moonDust.blockID);
		this.fillerBlock = ((byte)Spacecraft.moonRock.blockID);
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		
	}
}
