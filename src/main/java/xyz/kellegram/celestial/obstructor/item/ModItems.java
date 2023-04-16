package xyz.kellegram.celestial.obstructor.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.kellegram.celestial.obstructor.CelestialObstructor;

public class ModItems {

    // public static final Item CELESTIAL_OBSTRUCTOR = registerItem("celestial_obstructor", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item FLAWED_ORNAMENT = registerItem("flawed_ornament", new Item(new FabricItemSettings().group(ModItemGroup.CELESTIAL)));

    
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(CelestialObstructor.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CelestialObstructor.LOGGER.info("Registering items for" + CelestialObstructor.MOD_ID);
    }
}