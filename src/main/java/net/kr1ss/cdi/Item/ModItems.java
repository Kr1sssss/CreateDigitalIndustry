package net.kr1ss.cdi.Item;

import net.kr1ss.cdi.Cdi;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Cdi.MOD_ID);


    public static final RegistryObject<Item> TEXTOLITE = ITEMS.register("textolite",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CDI)));
    public static final RegistryObject<Item> MICROCHIP = ITEMS.register("microchip",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CDI)));
    public static final RegistryObject<Item> NANOCHIP = ITEMS.register("nanochip",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CDI)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}