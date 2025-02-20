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

    public static final RegistryObject<Item> CARTAARANHA = ITEMS.register("cartaaranha",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CARTACREEPER = ITEMS.register("cartacreeper",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CARTAESQUELETO = ITEMS.register("cartaesqueleto",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CARTAZUMBI = ITEMS.register("cartazumbi",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CARTAPORCO = ITEMS.register("cartaporco",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CARTAVACA = ITEMS.register("cartavaca",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CARTAOVELHA = ITEMS.register("cartaovelha",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MITHRALINGOT = ITEMS.register("mithralingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MITHRALRAW = ITEMS.register("mithralraw",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
