package spacecraft;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
//import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
//import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid = "Spacecraft", name = "Spacecraft", version = "1.0 Beta")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)


public class Spacecraft
{
	@Instance("Spacecraft")
    public static Spacecraft instance;
	
	public static int DimensionId =2;
	
	// Blocks
	public static Block bauxite = new BlockBauxite(175, Material.rock);
	public static Block moonDust = new BlockMoonSand(176, Material.sand);
	public static Block meteorite = new BlockMeteorite(177, Material.rock);
	public static Block moonRock = new BlockMoonRock(178, Material.rock);
	
	// Portal Blocks
	public static Block moonPortal = new BlockMoonPortal(179);
	
	//Items
	public static Item aluminum = new ItemAluminum(1000);
	public static Item stainlessSteel = new ItemStainlessSteel(1001);
	public static Item steelRod = new ItemSteelRod(1002);
	
	public static BiomeGenBase moon = (new BiomeGenMoon(30).setColor(9386496).setBiomeName("Moon").setTemperatureRainfall(1.0F, 0.0F));
	
	@SidedProxy(clientSide = "spacecraft.ClientProxy", serverSide = "spacecraft.CommonProxy")
    public static CommonProxy proxy;
	
	SpacecraftGenerator spacecraftGenerator = new SpacecraftGenerator();
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent event) 
	{
		
	}
	
	@EventHandler
    public void load(FMLInitializationEvent event)
    {
		proxy.registerRenderers();
		
		//Block Registration
		GameRegistry.registerBlock(bauxite);
		GameRegistry.registerBlock(moonDust);
		GameRegistry.registerBlock(meteorite);
		GameRegistry.registerBlock(moonPortal);
		GameRegistry.registerBlock(moonRock);
		
		//Block Name Registration
		LanguageRegistry.addName(bauxite, "Bauxite");
		LanguageRegistry.addName(moonDust, "Moon Dust");
		LanguageRegistry.addName(meteorite, "Meteorite");
		LanguageRegistry.addName(moonPortal, "Moon Portal");
		LanguageRegistry.addName(moonRock, "Moon Rock");
		
		//Item Name Registration
		LanguageRegistry.addName(aluminum, "Aluminum Ingot");
		LanguageRegistry.addName(stainlessSteel, "Steel Ingot");
		LanguageRegistry.addName(steelRod, "Steel Rod");
		
		//Crafting Recipes
		GameRegistry.addRecipe(new ItemStack(steelRod, 8), new Object[]
				{
					" S ", " S ", " S ",  'S', stainlessSteel,
				});
		
		GameRegistry.addSmelting(bauxite.blockID, new ItemStack (aluminum), 0.1f);
		GameRegistry.addSmelting(meteorite.blockID, new ItemStack (stainlessSteel), 0.5f);
		
		DimensionManager.registerProviderType(DimensionId, WorldProviderMoon.class, false);
		DimensionManager.registerDimension(DimensionId, DimensionId);
		
		GameRegistry.registerWorldGenerator(spacecraftGenerator);
	}

}