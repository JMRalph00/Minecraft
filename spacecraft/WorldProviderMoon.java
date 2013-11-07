package spacecraft;

import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderMoon extends WorldProvider
{
	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManagerHell(Spacecraft.moon, this.dimensionId, this.dimensionId);
		this.dimensionId = Spacecraft.DimensionId;
		this.hasNoSky = false;
	}
	
	public IChunkProvider createChunkGenerator()
	{
		return new ChunkProviderMoon(worldObj, worldObj.getSeed(), true);
	}
	
	public int getAverageGroundLevel()
	{
		return 128;
	}
	
	public boolean renderStars()
	{
		return true;
	}
	
	public float getStarBrightness(World world, float f)
	{
		return 10.0F;
	}
	
	public boolean isSkyColored()
	{
		return false;
	}
	
	@Override
	public String getDimensionName()
	{
		return "Moon";
	}
}
