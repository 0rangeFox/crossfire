package to.zettagames.crossfire.emulator.game.item;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum CharacterItems {

    UNKNOWN((byte) -1, "Unknown", ItemType.UNKNOWN),
    SWAT_BASIC_HELMET((byte) 1, "SWAT Basic Helmet", ItemType.CHARACTER_EQUIPMENT),
    SWAT_BASIC_FACE((byte) 2, "SWAT Basic Face", ItemType.CHARACTER_EQUIPMENT),
    OMOH_BASIC_HELMET((byte) 3, "O.M.O.H Basic Helmet", ItemType.CHARACTER_EQUIPMENT),
    OMOH_BASIC_FACE((byte) 4, "O.M.O.H Basic Face", ItemType.CHARACTER_EQUIPMENT),
    SAS_BASIC_GAS_MASK((byte) 5, "SAS Basic GAS Mask", ItemType.CHARACTER_EQUIPMENT),
    SAS_BASIC_FACE((byte) 6, "SAS Basic Face", ItemType.CHARACTER_EQUIPMENT),
    SWAT_BASIC_POUCH((byte) 7, "SWAT Basic Pouch", ItemType.CHARACTER_EQUIPMENT),
    OMOH_BASIC_POUCH((byte) 8, "O.M.O.H Basic Pouch", ItemType.CHARACTER_EQUIPMENT),
    SAS_BASIC_POUCH((byte) 9, "SAS Basic Pouch", ItemType.CHARACTER_EQUIPMENT),
    MUTANT_HELMET_SLUG((byte) 10, "Mutant Helmet Slug", ItemType.CHARACTER_EQUIPMENT),
    MUTANT_HELMET_MUTANT_HULK((byte) 11, "Mutant Helmet Hulk", ItemType.CHARACTER_EQUIPMENT),
    MUTANT_HELMET_MUTANT_CRAZY((byte) 12, "Mutant Helmet Crazy", ItemType.CHARACTER_EQUIPMENT),
    ULP_BASIC_HAIR((byte) 14, "ULP Basic Hair", ItemType.CHARACTER_EQUIPMENT),
    ULP_BASIC_FACE((byte) 15, "ULP Basic Face", ItemType.CHARACTER_EQUIPMENT),
    TAC_HELMET_A((byte) 16, "TAC Helmet A", ItemType.CHARACTER_EQUIPMENT),
    LEATHER_GOGGLES((byte) 17, "Leather Goggles", ItemType.CHARACTER_EQUIPMENT),
    RADIO_BACKPACK((byte) 18, "Radio Backpack", ItemType.CHARACTER_EQUIPMENT),
    COMPASS((byte) 19, "Compass", ItemType.CHARACTER_EQUIPMENT),
    SOLDIERS_BERET((byte) 20, "Soldiers Beret", ItemType.CHARACTER_EQUIPMENT),
    OFFICER_BERET((byte) 21, "Officer Beret", ItemType.CHARACTER_EQUIPMENT),
    FLASH_GOGGLES((byte) 22, "Flash Goggles", ItemType.CHARACTER_EQUIPMENT),
    WATER_BOTTLE_10((byte) 23, "Water Bottle 10", ItemType.CHARACTER_EQUIPMENT),
    SMG_MAGAZINE((byte) 24, "SMG Magazine", ItemType.CHARACTER_EQUIPMENT),
    RIFLE_MAGAZINE((byte) 25, "Rifle Magazine", ItemType.CHARACTER_EQUIPMENT),
    SNIPER_MAGAZINE((byte) 26, "Sniper Magazine", ItemType.CHARACTER_EQUIPMENT),
    MG_MAGAZINE((byte) 27, "MG Magazine", ItemType.CHARACTER_EQUIPMENT),
    SHOTGUN_MAGAZINE((byte) 28, "Shotgun Magazine", ItemType.CHARACTER_EQUIPMENT),
    PISTOL_MAGAZINE((byte) 29, "Pistol Magazine", ItemType.CHARACTER_EQUIPMENT),
    SMOKE_PROTECTION_HELMET((byte) 30, "Smoke Protection Helmet", ItemType.CHARACTER_EQUIPMENT),
    HERO_DEFAULT_FACE((byte) 31, "Hero Default Face", ItemType.CHARACTER_EQUIPMENT),
    HERO_DEFAULT_HELMET((byte) 32, "Hero Default Helmet", ItemType.CHARACTER_EQUIPMENT),
    HERO_DEFAULT_BACK_GUN((byte) 33, "Hero Default Back Gun", ItemType.CHARACTER_EQUIPMENT),
    HERO_DEFAULT_GUN_MAG((byte) 34, "Hero Default Gun Magazine", ItemType.CHARACTER_EQUIPMENT),
    WICKED_PUMPKIN_MASK((byte) 35, "Wicked Pumpkin Mask", ItemType.CHARACTER_EQUIPMENT),
    PUMPKIN_BACKPACK((byte) 36, "Pumpkin Backpack", ItemType.CHARACTER_EQUIPMENT),
    HAPPY_SNOWMAN_MASK((byte) 37, "Happy Snowman Mask", ItemType.CHARACTER_EQUIPMENT),
    SNOW_MAN_BACKPACK((byte) 38, "Snow Man Backpack", ItemType.CHARACTER_EQUIPMENT),
    SANTAS_HAT((byte) 39, "Santas Hat", ItemType.CHARACTER_EQUIPMENT),
    SANTAS_SACK((byte) 40, "Santas Sack", ItemType.CHARACTER_EQUIPMENT),
    SLEIGH_BACKPACK((byte) 41, "Sleigh Backpack", ItemType.CHARACTER_EQUIPMENT),
    RUDOLPH_GLASSES((byte) 42, "Rudolph Glasses", ItemType.CHARACTER_EQUIPMENT),
    BASEBALL_CAP((byte) 43, "Baseball Cap", ItemType.CHARACTER_EQUIPMENT),
    BASEBALL_HELMET((byte) 44, "Baseball Helmet", ItemType.CHARACTER_EQUIPMENT),
    SOCCER_BALL_CAP((byte) 45, "Soccer Ball Cap", ItemType.CHARACTER_EQUIPMENT),
    FOOTBALL_HAT((byte) 46, "Football Hat", ItemType.CHARACTER_EQUIPMENT),
    FOOTBALL_HELMET((byte) 47, "Football Helmet", ItemType.CHARACTER_EQUIPMENT),
    FOX_HAWL_DEFAULT_HELMET((byte) 48, "Fox Hawl Default Helmet", ItemType.CHARACTER_EQUIPMENT),
    FOX_HAWL_DEFAULT_FACE((byte) 49, "FOX Hawl Default Face", ItemType.CHARACTER_EQUIPMENT),
    GHOST_X_FEMALE_DEFAULT_FACE((byte) 50, "Ghost X (F) Default Face", ItemType.CHARACTER_EQUIPMENT),
    CHAOS_GOGGLES((byte) 51, "Chaos Goggles", ItemType.CHARACTER_EQUIPMENT),
    CHAOS_WINGS((byte) 52, "Chaos Wings", ItemType.CHARACTER_EQUIPMENT),
    GHOST_X_MALE_DEFAULT_FACE((byte) 53, "Ghost X (M) Default Face", ItemType.CHARACTER_EQUIPMENT),
    HC_BEANIE((byte) 54, "HC Beanie", ItemType.CHARACTER_EQUIPMENT),
    HC_CANTEEN((byte) 55, "HC Canteen", ItemType.CHARACTER_EQUIPMENT),
    MOS_DEFAULT_HAIR((byte) 56, "MOS Default Hair", ItemType.CHARACTER_EQUIPMENT),
    MOS_DEFAULT_FACE((byte) 57, "MOS Default Face", ItemType.CHARACTER_EQUIPMENT),
    MOS_DEFAULT_SUNGLASSES((byte) 58, "MOS Default Sunglasses", ItemType.CHARACTER_EQUIPMENT),
    TAC_HELMET_A_ADV((byte) 59, "TAC Helmet A Advanced", ItemType.CHARACTER_EQUIPMENT),
    GREEN_GOGGLES_ADV((byte) 60, "Green Goggles Advanced", ItemType.CHARACTER_EQUIPMENT),
    COMPASS_ADV((byte) 61, "Compass Advanced", ItemType.CHARACTER_EQUIPMENT),
    RADIO_BACKPACK_ADV((byte) 62, "Radio Backpack Advanced", ItemType.CHARACTER_EQUIPMENT),
    ULP_X_DEFAULT_HELMET((byte) 63, "ULP X Default Helmet", ItemType.CHARACTER_EQUIPMENT),
    ULP_X_DEFAULT_FACE((byte) 64, "ULP X Default Face", ItemType.CHARACTER_EQUIPMENT),
    ULP_X_DEFAULT_WAIST((byte) 65, "ULP X Default Waist", ItemType.CHARACTER_EQUIPMENT),
    ULP_X_DEFAULT_LEG_POUCH((byte) 66, "ULP X Default Leg Pouch", ItemType.CHARACTER_EQUIPMENT),
    TAC_HELMET_CAMO((byte) 67, "TAC Helmet Camo", ItemType.CHARACTER_EQUIPMENT),
    LEATHER_GOGGLES_ADV((byte) 68, "Leather Goggles Advanced", ItemType.CHARACTER_EQUIPMENT),
    OFFICER_RADIO_BACKPACK((byte) 69, "Officer Radio Backpack", ItemType.CHARACTER_EQUIPMENT),
    WALKIE_TALKIE((byte) 70, "Walkie-Talkie", ItemType.CHARACTER_EQUIPMENT),
    RABBIT_HEADBAND((byte) 71, "Rabbit Headband", ItemType.CHARACTER_EQUIPMENT),
    RABBIT_BACKPACK((byte) 72, "Rabbit Backpack", ItemType.CHARACTER_EQUIPMENT),
    RABBIT_HAT((byte) 73, "Rabbit Hat", ItemType.CHARACTER_EQUIPMENT),
    DIGICAM_BALLISTIC_HELMET((byte) 74, "Digicam Ballistic Helmet", ItemType.CHARACTER_EQUIPMENT),
    DIGICAM_CANTEEN((byte) 75, "Digicam Canteen", ItemType.CHARACTER_EQUIPMENT),
    DIGICAM_PROTECTIVE_GOGGLES((byte) 76, "Digicam Protective Goggles", ItemType.CHARACTER_EQUIPMENT),
    DIGICAM_BACKPACK((byte) 77, "Digicam Backpack", ItemType.CHARACTER_EQUIPMENT),
    HUMAN_BOSS_FACE((byte) 78, "Human Boss Face", ItemType.CHARACTER_EQUIPMENT),
    HUMAN_BOSS_HAIR((byte) 79, "Human Boss Hair", ItemType.CHARACTER_EQUIPMENT),
    HUMAN_BOSS_POUCH((byte) 80, "Human Boss Pouch", ItemType.CHARACTER_EQUIPMENT),
    SKULL_BEANIE((byte) 81, "Skull Beanie", ItemType.CHARACTER_EQUIPMENT),
    FIRE_SHADES((byte) 82, "Fire Shades", ItemType.CHARACTER_EQUIPMENT),
    GSG_9_DEFAULT_HELMET((byte) 83, "GSG-9 Default Helmet", ItemType.CHARACTER_EQUIPMENT),
    GSG_9_DEFAULT_FACE((byte) 84, "GSG-9 Default Face", ItemType.CHARACTER_EQUIPMENT),
    CAKE_HAT((byte) 85, "Cake Hat", ItemType.CHARACTER_EQUIPMENT),
    WICKED_PUMPKIN_MASK_2((byte) 86, "Wicked Pumpkin Mask 2", ItemType.CHARACTER_EQUIPMENT),
    PUMPKIN_BACKPACK_2((byte) 87, "Pumpkin Backpack 2", ItemType.CHARACTER_EQUIPMENT),
    DEVIL_WINGS((byte) 88, "Devil Wings", ItemType.CHARACTER_EQUIPMENT),
    PANDA_HAT((byte) 89, "Panda Hat", ItemType.CHARACTER_EQUIPMENT),
    PANDA_BACKPACK((byte) 90, "Panda Backpack", ItemType.CHARACTER_EQUIPMENT),
    PANDA_WATER_BOTTLE((byte) 91, "Panda Water Bottle", ItemType.CHARACTER_EQUIPMENT),
    XMAS_SAD_SNOWMAN_MASK((byte) 92, "Xmax Sad Snowman Mask", ItemType.CHARACTER_EQUIPMENT),
    GHOST_X_FEMALE_DEFAULT_FACE_2((byte) 93, "Ghost X (F) Default Face 2", ItemType.CHARACTER_EQUIPMENT),
    MEGA_WARMONGER_MASK((byte) 94, "Mega Warmonger Mask", ItemType.CHARACTER_EQUIPMENT),
    MEGA_WARMONGER_BACKPACK((byte) 95, "Mega Warmonger Backpack", ItemType.CHARACTER_EQUIPMENT),
    GOLD_MASK((byte) 96, "Gold MaskK", ItemType.CHARACTER_EQUIPMENT),
    HUMAN_BOSS_LADY_FACE((byte) 97, "Human Boss Lady Face", ItemType.CHARACTER_EQUIPMENT);

    private final byte id;
    private final String name;
    private final ItemType type;

    public static CharacterItems getItemById(byte id) {
        return Arrays.stream(values()).filter(item -> item.id == id).findFirst().orElse(UNKNOWN);
    }

}