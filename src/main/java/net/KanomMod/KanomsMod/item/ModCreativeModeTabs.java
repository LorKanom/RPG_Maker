package net.KanomMod.KanomsMod.item;

import net.KanomMod.KanomsMod.kanommod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, kanommod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MINERIOS_ITEM_TAB = CREATIVE_MODE_TABS.register("kanomsmod_minerios_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MITHRALINGOT.get()))
                    .title(Component.translatable("creativetab.kanommod.minerios"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MITHRALINGOT.get());
                        output.accept(ModItems.MITHRALRAW.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> CARTAS_ITEM_TAB = CREATIVE_MODE_TABS.register("kanomsmod_cartas_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CARTAGALINHA.get()))
                    .withTabsBefore(MINERIOS_ITEM_TAB.getId())
                    .title(Component.translatable("creativetab.kanommod.cartas"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CARTAGALINHA.get());
                        output.accept(ModItems.CARTAOVELHA.get());
                        output.accept(ModItems.CARTAPORCO.get());
                        output.accept(ModItems.CARTAVACA.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
