package net.KanomMod.KanomsMod.item;

import net.KanomMod.KanomsMod.kanommod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, kanommod.MOD_ID);

    public static final RegistryObject<Item> CARTAGALINHA = ITEMS.register("cartagalinha",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CARTAPORCO = ITEMS.register("cartaporco",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CARTAVACA = ITEMS.register("cartavaca",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CARTAOVELHA = ITEMS.register("cartaovelha",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
