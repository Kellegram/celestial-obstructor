package xyz.kellegram.celestial.obstructor;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class CelestialObstructorClient implements ClientModInitializer {
        
        public void onInitializeClient() {
             BlockRenderLayerMap.INSTANCE.putBlock(CelestialObstructor.CELESTIAL_OBSTRUCTOR, RenderLayer.getCutout());
             // Replace `RenderLayer.getCutout()` with `RenderLayer.getTranslucent()` if you have a translucent texture.
        }
    
}
