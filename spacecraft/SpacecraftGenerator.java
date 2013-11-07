package spacecraft;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class SpacecraftGenerator  implements IWorldGenerator
{
	 public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
     {
		 switch(world.provider.dimensionId)
		 {
		 	case -1 : generateNether(world, random, chunkX * 16, chunkZ * 16);
		 	break;
		 	case 0 : generateSurface(world, random, chunkX * 16, chunkZ * 16);
		 	break;
		 	case 1 : generateEnd(world, random, chunkX * 16, chunkZ * 16);
		 	break;
		 }
     }
		 
		 private void generateNether(World world, Random random, int x, int z)
		 {
			 
		 }
		 
		 private void generateSurface(World world, Random random, int x, int z)
		 {
			 for(int k = 0; k < 10; k++)
			 {
				 int xCoord = x + random.nextInt(16);
				 int yCoord = random.nextInt(96);
				 int zCoord = z + random.nextInt(16);
				 
				 (new WorldGenMinable(Spacecraft.bauxite.blockID, 8)).generate(world, random, xCoord, yCoord, zCoord);
			 }
			 
			 for(int k = 0; k < 10; k++)
			 {
				 int xCoord = x + random.nextInt(16);
				 int yCoord = random.nextInt(128);
				 int zCoord = z + random.nextInt(16);
				 
				 (new WorldGenMinable(Spacecraft.meteorite.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
			 }
			 
		 }
		 
		 private void generateEnd(World world, Random random, int x, int z)
		 {
			 
		 }
     
}
