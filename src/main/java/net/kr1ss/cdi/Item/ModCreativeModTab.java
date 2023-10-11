package net.kr1ss.cdi.Item;

import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.item.*;

public class ModCreativeModTab {
    public static final CreativeModeTab CDI = new CreativeModeTab("CDI") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.AMETHYST_SHARD);
        }
    };
}
