package uz.shahzod.elitearmor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EliteMod.MODID);

    // IRON ELITE
    public static final RegistryObject<Item> IRON_ELITE_HELMET =
            ITEMS.register("iron_elite_helmet", () -> new EliteArmorItem(EliteArmorMaterial.IRON_ELITE, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> IRON_ELITE_CHESTPLATE =
            ITEMS.register("iron_elite_chestplate", () -> new EliteArmorItem(EliteArmorMaterial.IRON_ELITE, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> IRON_ELITE_LEGGINGS =
            ITEMS.register("iron_elite_leggings", () -> new EliteArmorItem(EliteArmorMaterial.IRON_ELITE, EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> IRON_ELITE_BOOTS =
            ITEMS.register("iron_elite_boots", () -> new EliteArmorItem(EliteArmorMaterial.IRON_ELITE, EquipmentSlotType.FEET));

    // DIAMOND ELITE
    public static final RegistryObject<Item> DIAMOND_ELITE_HELMET =
            ITEMS.register("diamond_elite_helmet", () -> new EliteArmorItem(EliteArmorMaterial.DIAMOND_ELITE, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> DIAMOND_ELITE_CHESTPLATE =
            ITEMS.register("diamond_elite_chestplate", () -> new EliteArmorItem(EliteArmorMaterial.DIAMOND_ELITE, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> DIAMOND_ELITE_LEGGINGS =
            ITEMS.register("diamond_elite_leggings", () -> new EliteArmorItem(EliteArmorMaterial.DIAMOND_ELITE, EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> DIAMOND_ELITE_BOOTS =
            ITEMS.register("diamond_elite_boots", () -> new EliteArmorItem(EliteArmorMaterial.DIAMOND_ELITE, EquipmentSlotType.FEET));

    // NETHERITE ELITE
    public static final RegistryObject<Item> NETHERITE_ELITE_HELMET =
            ITEMS.register("netherite_elite_helmet", () -> new EliteArmorItem(EliteArmorMaterial.NETHERITE_ELITE, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> NETHERITE_ELITE_CHESTPLATE =
            ITEMS.register("netherite_elite_chestplate", () -> new EliteArmorItem(EliteArmorMaterial.NETHERITE_ELITE, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> NETHERITE_ELITE_LEGGINGS =
            ITEMS.register("netherite_elite_leggings", () -> new EliteArmorItem(EliteArmorMaterial.NETHERITE_ELITE, EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> NETHERITE_ELITE_BOOTS =
            ITEMS.register("netherite_elite_boots", () -> new EliteArmorItem(EliteArmorMaterial.NETHERITE_ELITE, EquipmentSlotType.FEET));

    // REDSTONE ELITE
    public static final RegistryObject<Item> REDSTONE_ELITE_HELMET =
            ITEMS.register("redstone_elite_helmet", () -> new EliteArmorItem(EliteArmorMaterial.REDSTONE_ELITE, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> REDSTONE_ELITE_CHESTPLATE =
            ITEMS.register("redstone_elite_chestplate", () -> new EliteArmorItem(EliteArmorMaterial.REDSTONE_ELITE, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> REDSTONE_ELITE_LEGGINGS =
            ITEMS.register("redstone_elite_leggings", () -> new EliteArmorItem(EliteArmorMaterial.REDSTONE_ELITE, EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> REDSTONE_ELITE_BOOTS =
            ITEMS.register("redstone_elite_boots", () -> new EliteArmorItem(EliteArmorMaterial.REDSTONE_ELITE, EquipmentSlotType.FEET));

    // EMERALD ELITE
    public static final RegistryObject<Item> EMERALD_ELITE_HELMET =
            ITEMS.register("emerald_elite_helmet", () -> new EliteArmorItem(EliteArmorMaterial.EMERALD_ELITE, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> EMERALD_ELITE_CHESTPLATE =
            ITEMS.register("emerald_elite_chestplate", () -> new EliteArmorItem(EliteArmorMaterial.EMERALD_ELITE, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> EMERALD_ELITE_LEGGINGS =
            ITEMS.register("emerald_elite_leggings", () -> new EliteArmorItem(EliteArmorMaterial.EMERALD_ELITE, EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> EMERALD_ELITE_BOOTS =
            ITEMS.register("emerald_elite_boots", () -> new EliteArmorItem(EliteArmorMaterial.EMERALD_ELITE, EquipmentSlotType.FEET));
}
