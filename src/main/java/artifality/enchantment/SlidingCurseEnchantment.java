package artifality.enchantment;

import artifality.interfaces.IArtifalityEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class SlidingCurseEnchantment extends Enchantment implements IArtifalityEnchantment {


    protected SlidingCurseEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public boolean isCursed() {
        return true;
    }

    @Override
    public String getTranslation() {
        return "Curse Of Sliding";
    }
}