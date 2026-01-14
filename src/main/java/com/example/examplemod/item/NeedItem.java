package com.example.examplemod.item;

import com.example.examplemod.constellation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NeedItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, constellation.MODID);

    public static final RegistryObject<Item> pechen = ITEMS.register("pechen",()-> new Item(new Item.Properties()));
}
