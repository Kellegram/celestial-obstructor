package xyz.kellegram.celestial.obstructor.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import xyz.kellegram.celestial.obstructor.CelestialObstructor;

public class ModItemGroup {

    public static final ItemGroup CELESTIAL = FabricItemGroupBuilder.build(new Identifier(CelestialObstructor.MOD_ID, "celestial"), () -> new ItemStack(ModItems.FLAWED_ORNAMENT));
    
}
