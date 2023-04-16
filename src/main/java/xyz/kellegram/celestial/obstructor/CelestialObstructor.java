package xyz.kellegram.celestial.obstructor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;
import xyz.kellegram.celestial.obstructor.block.ModBlocks;
import xyz.kellegram.celestial.obstructor.item.ModItems;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

public class CelestialObstructor implements ModInitializer {

	public static final String MOD_ID = "cobstructor";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	
	// public static final CelestialObstructorBlock CELESTIAL_OBSTRUCTOR = new CelestialObstructorBlock(FabricBlockSettings.of(Material.METAL).strength(1.0f).nonOpaque());


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		// Registry.register(Registry.ITEM, new Identifier("cobstructor", "celestial_obstructor"), CELESTIAL_OBSTRUCTOR);
		// Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "celestial_obstructor"), CELESTIAL_OBSTRUCTOR);
		// Registry.register(Registry.ITEM, new Identifier(MOD_ID, "celestial_obstructor"), new BlockItem(CELESTIAL_OBSTRUCTOR, new FabricItemSettings()));
	}
}
