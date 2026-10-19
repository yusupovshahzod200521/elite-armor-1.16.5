package uz.shahzod.elitearmor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum EliteArmorMaterial implements IArmorMaterial {

    IRON_ELITE("iron_elite", 25, new int[]{3,6,8,3}, 12, 0.0f, 0.0f),
    DIAMOND_ELITE("diamond_elite", 35, new int[]{3,6,8,3}, 15, 2.0f, 0.0f),
    NETHERITE_ELITE("netherite_elite", 40, new int[]{3,6,8,3}, 15, 3.0f, 0.1f),
    REDSTONE_ELITE("redstone_elite", 20, new int[]{3,6,8,3}, 10, 0.0f, 0.0f),
    EMERALD_ELITE("emerald_elite", 30, new int[]{3,6,8,3}, 14, 1.0f, 0.0f);

    private final String name;
    private final int durability;
    private final int[] slotProtections;
    private final int enchantability;
    private final float toughness;
    private final float knockbackResistance;

    EliteArmorMaterial(String name, int durability, int[] slotProtections,
                       int enchantability, float toughness, float knockbackResistance) {
        this.name = name;
        this.durability = durability;
        this.slotProtections = slotProtections;
        this.enchantability = enchantability;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }

    @Override public int getDurabilityForSlot(EquipmentSlotType slot) { return durability * new int[]{13,15,16,11}[slot.getIndex()]; }
    @Override public int getDefenseForSlot(EquipmentSlotType slot) { return slotProtections[slot.getIndex()]; }
    @Override public int getEnchantmentValue() { return enchantability; }
    @Override public SoundEvent getEquipSound() { return SoundEvents.ARMOR_EQUIP_IRON; }
    @Override public Ingredient getRepairIngredient() { return Ingredient.EMPTY; }
    @Override public String getName() { return EliteMod.MODID + ":" + name; }
    @Override public float getToughness() { return toughness; }
    @Override public float getKnockbackResistance() { return knockbackResistance; }
}
