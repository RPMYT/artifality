package artifality.mixin.common.access;

import net.minecraft.block.entity.BeaconBlockEntity;
import net.minecraft.entity.effect.StatusEffect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(BeaconBlockEntity.class)
public interface BeaconAccessor {

    @Accessor
    StatusEffect getPrimary();

    @Accessor
    StatusEffect getSecondary();
}
