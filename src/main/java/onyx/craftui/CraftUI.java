package onyx.craftui;

import org.apache.logging.log4j.Logger;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CraftUI.MODID, name = CraftUI.NAME, version = CraftUI.VERSION, dependencies = CraftUI.DEPENDS)
public class CraftUI
{
    public static final String MODID = "craftui";
    public static final String NAME = "CraftUI";
    public static final String VERSION = "1.0.0";
    public static final String DEPENDS = "required-after:forge@[14.23.5.2768,);required-after:crafttweaker";

    private static Logger logger;

    @Instance(MODID)
    public static CraftUI instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
