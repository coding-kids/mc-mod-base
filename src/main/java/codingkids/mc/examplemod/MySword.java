package codingkids.mc.examplemod;

import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Wilson Wu on 2020/02/11.
 */
public class MySword extends net.minecraft.item.ItemSword {
    public MySword(ToolMaterial material) {
        super(material);
        this.setRegistryName("my_sword");
        this.setTranslationKey("examplemod.my_sword");
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
}
