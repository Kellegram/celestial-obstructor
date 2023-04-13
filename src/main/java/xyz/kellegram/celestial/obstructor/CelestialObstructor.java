package xyz.kellegram.celestial.obstructor;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.*;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

public class CelestialObstructor implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	// public static final Logger LOGGER = LoggerFactory.getLogger("cobstructor");

	//  public static final Item CELESTIAL_OBSTRUCTOR = new Item(new Item.Settings().group(ItemGroup.MISC));
	 public static final CelestialObstructorBlock CELESTIAL_OBSTRUCTOR = new CelestialObstructorBlock(FabricBlockSettings.of(Material.METAL).strength(1.0f).nonOpaque());

	// public static final Item CELESTIAL_OBSTRUCTOR =
	// Registry.register(Registry.ITEM, new Identifier("cobstructor", "celestial_obstructor"),
	//   new Item(new FabricItemSettings()));

	@Override
	public void onInitialize() {
		// Registry.register(Registry.ITEM, new Identifier("cobstructor", "celestial_obstructor"), CELESTIAL_OBSTRUCTOR);
		Registry.register(Registry.BLOCK, new Identifier("cobstructor", "celestial_obstructor"), CELESTIAL_OBSTRUCTOR);
		Registry.register(Registry.ITEM, new Identifier("cobstructor", "celestial_obstructor"), new BlockItem(CELESTIAL_OBSTRUCTOR, new FabricItemSettings()));
	}
}
