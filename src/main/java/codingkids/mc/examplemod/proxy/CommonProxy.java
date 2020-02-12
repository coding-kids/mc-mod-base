package codingkids.mc.examplemod.proxy;

import codingkids.mc.examplemod.ExampleMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Wilson Wu on 2020/02/11.
 */
@Mod.EventBusSubscriber
public interface CommonProxy {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ModelLoader.setCustomModelResourceLocation(ExampleMod.itemSword, 0, new ModelResourceLocation(ExampleMod.itemSword.getRegistryName(), "inventory"));
        event.getRegistry().registerAll(ExampleMod.itemSword);
    }
}
