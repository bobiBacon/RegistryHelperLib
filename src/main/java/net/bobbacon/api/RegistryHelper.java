package net.bobbacon.api;

import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

public class RegistryHelper<T> {
    private final Registry<T> registry;
    private final String MOD_ID;

    public RegistryHelper(@NotNull Registry<T> registry,@NotNull String modId) {
        if (registry==null){
            throw new NullPointerException("registry is null");
        }
        if (modId==null){
            throw new NullPointerException("The Mod Id is Null");
        }
        this.registry=registry;
        MOD_ID = modId;
    }


    public T register(String name,T element){
        return Registry.register(registry, Identifier.of(MOD_ID,name),element);
    }
}
