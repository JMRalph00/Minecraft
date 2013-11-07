package spacecraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.ModLoader;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockMoonPortal extends BlockPortal
{
       public BlockMoonPortal(int id) 
       {
              super(id);
              this.setCreativeTab(CreativeTabs.tabBlock);
       }

       public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)

       {

              if ((par5Entity.ridingEntity == null) && (par5Entity.riddenByEntity == null) && (par5Entity instanceof EntityPlayerMP))
              {
                     EntityPlayerMP player = (EntityPlayerMP) par5Entity;
                     ModLoader.getMinecraftServerInstance();
                     MinecraftServer mServer = MinecraftServer.getServer();

                     if (player.timeUntilPortal > 0)
                     {
                           player.timeUntilPortal = 10;
                     } 
                     
                     else if (player.dimension != Spacecraft.DimensionId)
                     {
                           player.timeUntilPortal = 10;

                           player.mcServer.getConfigurationManager().transferPlayerToDimension(player, Spacecraft.DimensionId, new TeleporterMoon(mServer.worldServerForDimension(Spacecraft.DimensionId)));
                     } 
                     
                     else
                     {
                           player.timeUntilPortal = 10;
                           player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 0, new TeleporterMoon(mServer.worldServerForDimension(1)));
                     }
              }
       }
}