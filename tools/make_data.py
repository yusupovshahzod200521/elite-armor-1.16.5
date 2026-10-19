import os, json

MODID = "elitearmor"
RES = f"src/main/resources"
ASSETS = f"{RES}/assets/{MODID}"
DATA = f"{RES}/data/{MODID}"

MATERIALS = ["iron_elite", "diamond_elite", "netherite_elite", "redstone_elite", "emerald_elite"]
SLOTS = ["helmet", "chestplate", "leggings", "boots"]

# Smithing upgrade: iron_elite -> others
UPGRADES = {
    "diamond_elite":   "minecraft:diamond",
    "netherite_elite": "minecraft:netherite_ingot",
    "redstone_elite":  "minecraft:redstone",
    "emerald_elite":   "minecraft:emerald",
}

def write(path, data):
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, "w") as f:
        json.dump(data, f, indent=2)

# --- Item models ---
for mat in MATERIALS:
    for slot in SLOTS:
        name = f"{mat}_{slot}"
        write(f"{ASSETS}/models/item/{name}.json", {
            "parent": "item/generated",
            "textures": {"layer0": f"{MODID}:item/{name}"}
        })

# --- Item textures (placeholder 16x16 - just needs to exist, armor uses layer files) ---
# We'll create simple item icons via make_textures.py - add item icons there

# --- Lang ---
lang = {}
for mat in MATERIALS:
    display = mat.replace("_", " ").title()
    for slot in SLOTS:
        key = f"item.{MODID}.{mat}_{slot}"
        lang[key] = f"{display} {slot.capitalize()}"
write(f"{ASSETS}/lang/en_us.json", lang)

# --- Loot tables ---
for mat in MATERIALS:
    for slot in SLOTS:
        name = f"{mat}_{slot}"
        write(f"{DATA}/loot_tables/items/{name}.json", {
            "type": "minecraft:block",
            "pools": []
        })

# --- Smithing recipes: iron_elite -> upgraded ---
os.makedirs(f"{DATA}/recipes", exist_ok=True)
for target_mat, ingredient in UPGRADES.items():
    for slot in SLOTS:
        recipe_name = f"{target_mat}_{slot}_smithing"
        write(f"{DATA}/recipes/{recipe_name}.json", {
            "type": "minecraft:smithing",
            "base": {"item": f"{MODID}:iron_elite_{slot}"},
            "addition": {"item": ingredient},
            "result": {"item": f"{MODID}:{target_mat}_{slot}"}
        })

# --- Crafting recipe for iron_elite set (shaped) ---
# Iron elite helmet: 5 iron ingots
slot_recipes = {
    "helmet":     ("III", "I I", "   "),
    "chestplate": ("I I", "III", "III"),
    "leggings":   ("III", "I I", "I I"),
    "boots":      ("   ", "I I", "I I"),
}
for slot, pattern in slot_recipes.items():
    write(f"{DATA}/recipes/iron_elite_{slot}.json", {
        "type": "minecraft:crafting_shaped",
        "pattern": list(pattern),
        "key": {"I": {"item": "minecraft:iron_ingot"}},
        "result": {"item": f"{MODID}:iron_elite_{slot}", "count": 1}
    })

print("Data generation complete!")
