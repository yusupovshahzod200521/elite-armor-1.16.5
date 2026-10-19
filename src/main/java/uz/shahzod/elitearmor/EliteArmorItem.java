package uz.shahzod.elitearmor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;

public class EliteArmorItem extends ArmorItem {

    private final EliteArmorMaterial material;

    public EliteArmorItem(EliteArmorMaterial material, EquipmentSlotType slot) {
        super(material, slot, new Properties()
                .tab(net.minecraft.item.ItemGroup.TAB_COMBAT)
                .stacksTo(1));
        this.material = material;
    }

    public EliteArmorMaterial getEliteMaterial() {
        return material;
    }

    @Override
    public String getArmorTexture(ItemStack stack, net.minecraft.entity.Entity entity,
                                  EquipmentSlotType slot, String type) {
        String matName = material.name().toLowerCase();
        if (slot == EquipmentSlotType.LEGS) {
            return EliteMod.MODID + ":textures/models/armor/" + matName + "_layer_2.png";
        }
        return EliteMod.MODID + ":textures/models/armor/" + matName + "_layer_1.png";
    }
}
