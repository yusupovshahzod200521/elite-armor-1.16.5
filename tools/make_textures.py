import os
from PIL import Image

OUT = "src/main/resources/assets/elitearmor/textures/models/armor"
os.makedirs(OUT, exist_ok=True)

# Material color ramps: (top_dark_RGB, bottom_light_RGB)
MATERIALS = {
    "iron_elite":      ((80, 80, 85),    (180, 180, 190)),
    "diamond_elite":   ((20, 80, 140),   (100, 200, 255)),
    "netherite_elite": ((25, 20, 30),    (80, 70, 90)),
    "redstone_elite":  ((120, 10, 10),   (255, 80, 80)),
    "emerald_elite":   ((10, 80, 30),    (60, 210, 100)),
}

def gradient_pixel(y, total_h, top, bottom):
    t = y / (total_h - 1)
    r = int(top[0] + (bottom[0] - top[0]) * t)
    g = int(top[1] + (bottom[1] - top[1]) * t)
    b = int(top[2] + (bottom[2] - top[2]) * t)
    return (r, g, b, 255)

def make_layer(name, suffix, top, bottom):
    # Minecraft armor texture: 64x32
    img = Image.new("RGBA", (64, 32), (0, 0, 0, 0))
    # Draw gradient on the full image height
    for y in range(32):
        color = gradient_pixel(y, 32, top, bottom)
        for x in range(64):
            img.putpixel((x, y), color)
    img.save(f"{OUT}/{name}_{suffix}.png")
    print(f"  saved {name}_{suffix}.png")

for mat_name, (top_color, bottom_color) in MATERIALS.items():
    make_layer(mat_name, "layer_1", top_color, bottom_color)
    make_layer(mat_name, "layer_2", top_color, bottom_color)

print("All armor textures done!")
