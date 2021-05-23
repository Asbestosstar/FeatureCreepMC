package com.asbestosstar.featurecreep;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.client.resources.I18n;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import org.apache.logging.log4j.Logger;


import java.util.*;
//import com.example.examplemod.*;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class FeatureCreepMC
{
    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
		GameRegistry.registerWorldGenerator( new OreGen(), 0);

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	RegistryHandler.otherRegistries();
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
    @Instance
public static FeatureCreepMC instance;

@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

//@EventHandler
//public static void preInit(FMLPreInitializationEvent event) {}
//@EventHandler
//public static void init(FMLInitializationEvent event) {}
//@EventHandler
//public static void postInit(FMLPostInitializationEvent event) {}

    
//    
public static final List<Item> ITEMS = new ArrayList<Item>();
public static final List<Block> BLOCKS = new ArrayList<Block>();
public static final List<GemOre> GEM_ORE = new ArrayList<GemOre>();
public static final List<IngotOre> INGOT_ORE = new ArrayList<IngotOre>();
public static final List<DustOre> DUST_ORE = new ArrayList<DustOre>();



public static final Item AMETHYST = new Amathest("amethyst");
public static final Block AMETHYST_BLOCK = new AmathestBlock("amethyst_block", Material.IRON, 3f, 3f, 3, null);
public static final Item RUBY = new Amathest("ruby");
public static final Block RUBY_BLOCK = new AmathestBlock("ruby_block", Material.IRON, 3f, 3f, 3, null);
public static final Item TIGERS_EYE = new Amathest("tigers_eye");
public static final Block TIGERS_EYE_BLOCK = new AmathestBlock("tigers_eye_block", Material.IRON, 3f, 3f, 3, null);
public static final Item Oil = new Amathest("oil");
public static final Item Salt = new Amathest("salt"); //Ant Functionality Delayed
public static final Item TITANIUM = new Amathest("titanium");
public static final Item TITANIUM_NUGGET = new Amathest("titanium_nugget");
public static final Block TITANIUM_BLOCK = new AmathestBlock("titanium_block", Material.IRON, 3f, 3f, 3, null);
public static final Item URANIUM = new Amathest("uranium");
public static final Item URANIUM_NUGGET = new Amathest("uranium_nugget");
public static final Block URANIUM_BLOCK = new AmathestBlock("uranium_block", Material.IRON, 3f, 3f, 3, null);
public static final Item ALUMINIUM = new Amathest("aluminium");
public static final Block ALUMINIUM_BLOCK = new AmathestBlock("aluminium_block", Material.IRON, 3f, 3f, 3, null);
public static final Item MobzillaScale = new Amathest("mobzilla_scale");
public static final Item QueenScale = new Amathest("queen_scale");
public static final Item MothScale = new Amathest("moth_scale");
public static final Item TIN_INGOT = new Amathest("tin_ingot");
public static final Item SILVER_INGOT = new Amathest("silver_ingot");
public static final Item PLATINUM_INGOT = new Amathest("platinum_ingot");
public static final Item COPPER_INGOT = new Amathest("copper_ingot");
public static final Item PinkTourmaline = new Amathest("pink_tourmaline_ingot");
public static final Item LAVA_EEL = new Amathest("lava_eel");
public static final Item PEACKOCK_FEATHER = new Amathest("peackock_feather");
public static final Item SAPPHIRE = new Amathest("sapphire");
public static final Item MINERS_DREAM = new MinersDream("miners_dream", -5, 5, 0, 5, 0, 50);
public static final Item LARGE_MINERS_DREAM = new MinersDream("large_miners_dream", -250, 250, -250, 250, -50, 250);
public static final Block SAPPHIRE_BLOCK = new AmathestBlock("sapphire_block", Material.IRON, 3f, 3f, 3, null);
public static final Block EYE_OF_ENDER_BLOCK = new AmathestBlock("eye_of_ender_block", Material.IRON, 3f, 3f, 3, null);
public static final Block ENDER_PEARL_BLOCK = new AmathestBlock("ender_pearl_block", Material.IRON, 3f, 3f, 3, null);
public static final Block COMPRESSED_POPPY_BLOCK = new AmathestBlock("compressed_poppy_block", Material.IRON, 3f, 3f, 3, null);
public static final Block ORANGE_BLOCK = new AmathestBlock("orange_block", Material.IRON, 3f, 3f, 3, null);
public static final Block BROWN_BLOCK = new AmathestBlock("brown_block", Material.IRON, 3f, 3f, 3, null);
public static final Block DARK_ORANGE_BLOCK = new AmathestBlock("dark_orange_block", Material.IRON, 3f, 3f, 3, null);
public static final Block DARK_BROWN_BLOCK = new AmathestBlock("dark_brown_block", Material.IRON, 3f, 3f, 3, null);
public static final Item GASOLINE_PETROL = new Amathest("gasoline_petrol");








//Ores
//name material hardness resistance miningLevel tool dimension minY maxY group tries drop

public static final Block AMETHYST_ORE = new GemOre("amethyst_ore", Material.IRON, 4, 10, 10, null, DimensionType.OVERWORLD, 16, 200, 5, 20,BlockMatcher.forBlock(Blocks.STONE), FeatureCreepMC.AMETHYST);
public static final Block RUBY_ORE = new GemOre("ruby_ore", Material.IRON, 4, 10, 10, null, DimensionType.OVERWORLD, 16, 200, 5, 20,BlockMatcher.forBlock(Blocks.STONE), FeatureCreepMC.RUBY);
public static final Block ALUMINIUM_ORE = new IngotOre("aluminium_ore", Material.IRON, 4, 10, 10, null, DimensionType.OVERWORLD, 16, 200, 7, 20,BlockMatcher.forBlock(Blocks.STONE));
public static final Block TIGERS_EYE_ORE = new IngotOre("tigers_eye_ore", Material.IRON, 4, 10, 10, null, DimensionType.OVERWORLD, 16, 200, 5, 20,BlockMatcher.forBlock(Blocks.STONE));
public static final Block TITANIUM_ORE = new IngotOre("titanium_ore", Material.IRON, 4, 10, 10, null, DimensionType.OVERWORLD, 16, 200, 4, 20,BlockMatcher.forBlock(Blocks.STONE));
public static final Block URANIUM_ORE = new IngotOre("uranium_ore", Material.IRON, 4, 10, 10, null, DimensionType.OVERWORLD, 16, 200, 3, 5,BlockMatcher.forBlock(Blocks.STONE));
public static final Block UNPROCESSED_OIL_ORE = new DustOre("unprocessed_oil_ore", Material.IRON, 4, 10, 10, null, DimensionType.OVERWORLD, 16, 200, 50, 20,BlockMatcher.forBlock(Blocks.STONE), FeatureCreepMC.Oil);
public static final Block SALT_ORE = new DustOre("salt_ore", Material.IRON, 4, 10, 10, null, DimensionType.OVERWORLD, 16, 200, 8, 20,BlockMatcher.forBlock(Blocks.STONE), FeatureCreepMC.Salt);
public static final Block SAPPHIRE_ORE = new GemOre("sapphire_ore", Material.IRON, 4, 10, 10, null, DimensionType.OVERWORLD, 16, 200, 5, 20,BlockMatcher.forBlock(Blocks.STONE), FeatureCreepMC.SAPPHIRE);
public static final Block GASOLINE_PETROL_ORE = new DustOre("gasoline_petrol_ore", Material.IRON, 4, 10, 10, null, DimensionType.OVERWORLD, 16, 200, 20, 10,BlockMatcher.forBlock(Blocks.STONE), FeatureCreepMC.GASOLINE_PETROL);



//Block order = String name, Material material, float hardness, float resistance, int miningLevel, String tool
//I will do troll blocks later but also with better Ores like Uranium or Titanium and worser Ores Like Coal/Oil or Salt






////Armour Materials
public static final ArmorMaterial ArmourSetOSEmerald = EnumHelper.addArmorMaterial("OSEmerald", Reference.MODID + ":emerald", 25, new int[] {5, 10, 10, 5}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 20.0F );
public static final ArmorMaterial ArmourSetAmethyst = EnumHelper.addArmorMaterial("ArmourSetAmethyst", Reference.MODID + ":ametheyst", 25, new int[] {10, 20, 20, 10}, 50, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 30.0F );
public static final ArmorMaterial RubyArmour = EnumHelper.addArmorMaterial("RubyArmour", Reference.MODID + ":ruby", 50, new int[] {15, 25, 25, 15}, 60, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 40.0F );
public static final ArmorMaterial TigerEyeArmour = EnumHelper.addArmorMaterial("TigerEyeArmour", Reference.MODID + ":tigereye", 35, new int[] {10, 15, 15, 10}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 25.0F );
public static final ArmorMaterial UltimateArmour = EnumHelper.addArmorMaterial("ULTIMATE", Reference.MODID + ":ultimate", 35, new int[] {10, 15, 15, 10}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 25.0F );
public static final ArmorMaterial ArmourExperience = EnumHelper.addArmorMaterial("EXPERIENCE", Reference.MODID + ":experience", 25, new int[] {3, 6, 8, 3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 25.0F );
public static final ArmorMaterial ROYAL_GUARDIAN_ARMOUR = EnumHelper.addArmorMaterial("ROYAL_GUARDIAN", Reference.MODID + ":royal_guardian", 35, new int[] {15, 25, 25, 15}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 25.0F );
public static final ArmorMaterial QUEEN_SCALE_ARMOUR = EnumHelper.addArmorMaterial("QUEEN_SCALE", Reference.MODID + ":queen_scale", 20, new int[] {10, 15, 15, 10}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 25.0F );
public static final ArmorMaterial MOBZILLA_SCALE_ARMOUR = EnumHelper.addArmorMaterial("MOBZILLA_SCALE", Reference.MODID + ":mobzillascale", 20, new int[] {10, 15, 15, 10}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 25.0F );
public static final ArmorMaterial LAPIS_LAZUI_ARMOUR = EnumHelper.addArmorMaterial("LAPIS", Reference.MODID + ":lapis", 25, new int[] {4, 10, 10, 5}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 25.0F );
public static final ArmorMaterial LAVA_Eel_ARMOUR = EnumHelper.addArmorMaterial("LAVA_EEL", Reference.MODID + ":lava_eel", 20, new int[] {10, 15, 15, 10}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 25.0F );
public static final ArmorMaterial PEACOCK_FEATHER_ARMOUR = EnumHelper.addArmorMaterial("PEACOCK", Reference.MODID + ":peacock", 50, new int[] {15, 25, 25, 15}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 25.0F );
public static final ArmorMaterial ArmourPinkTourmaline = EnumHelper.addArmorMaterial("PinkTourmaline", Reference.MODID + ":pinktourmaline", 35, new int[] {15, 25, 25, 15}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 25.0F );
public static final ArmorMaterial ArmourTin = EnumHelper.addArmorMaterial("Tin", Reference.MODID + ":tin", 35, new int[] {15, 25, 25, 15}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 25.0F );
public static final ArmorMaterial ArmourCopper = EnumHelper.addArmorMaterial("Copper", Reference.MODID + ":copper", 15, new int[] {2, 5, 15, 10}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 25.0F );
public static final ArmorMaterial ArmourSilver = EnumHelper.addArmorMaterial("Silver", Reference.MODID + ":silver", 20, new int[] {4, 15, 15, 10}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 25.0F );
public static final ArmorMaterial ArmourPlatinum = EnumHelper.addArmorMaterial("Platinum", Reference.MODID + ":platinum", 20, new int[] {4, 15, 15, 10}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 25.0F );
public static final ArmorMaterial ArmourAluminium = EnumHelper.addArmorMaterial("Aluminium", Reference.MODID + ":aluminium", 18, new int[] {3, 13, 13, 8}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 25.0F );
public static final ArmorMaterial MOTH_SCALE_Armour = EnumHelper.addArmorMaterial("MOTH_SCALE", Reference.MODID + ":moth_scale", 18, new int[] {3, 13, 13, 8}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 25.0F );
public static final ArmorMaterial ArmourSetSapphire = EnumHelper.addArmorMaterial("ArmourSetSapphire", Reference.MODID + ":sapphire", 25, new int[] {10, 20, 20, 10}, 50, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 30.0F );
public static final ArmorMaterial CZArmourSlow = EnumHelper.addArmorMaterial("CZArmourSlow", Reference.MODID + ":czslow", 25, new int[] {2, 3, 3, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 30.0F );




//ToolMaterials
public static final ToolMaterial OSTOOLEmerald = EnumHelper.addToolMaterial("OSEmerald", 2, 2000, 10.0F, 9.0F, 10);
public static final ToolMaterial AmethystTool = EnumHelper.addToolMaterial("AmethystTool", 8, 5000, 20.0F, 18.0F, 20);
public static final ToolMaterial RubyTool = EnumHelper.addToolMaterial("RubyTool", 12, 8000, 20.0F, 30.0F, 30);
public static final ToolMaterial TigerEyeTool = EnumHelper.addToolMaterial("TigerEyeTool", 5, 3500, 15.0F, 10.0F, 15);
public static final ToolMaterial OptimisedTool = EnumHelper.addToolMaterial("OptimisedTool", 15, 13000, 75.0F, 8.0F, 45);
public static final ToolMaterial UltimateTool = EnumHelper.addToolMaterial("UltimateTool", 15, 15000, 30.0F, 50.0F, 45);
public static final ToolMaterial SapphireTool = EnumHelper.addToolMaterial("SapphireTool", 8, 5000, 20.0F, 18.0F, 20);




//public static final Item EmeraldAxe = new EmeraldAxe("EmeraldAxe", OSTOOLEmerald);
public static final Item EMERALD_PICKAXE = new EmeraldPic("emerald_pickaxe", OSTOOLEmerald);
public static final Item EMERALD_HOLE = new EmeraldHoe("emerald_hoe", OSTOOLEmerald);
public static final Item EMERALD_SWORD = new EmeraldSword("emerald_sword", OSTOOLEmerald);
public static final Item EMERALD_SHOVEL = new EmeraldShovel("emerald_shovel", OSTOOLEmerald);
public static final Item EMERALD_HELMET = new EmeraldArmour("emerald_helmet", ArmourSetOSEmerald, 1, EntityEquipmentSlot.HEAD);
public static final Item EMERALD_CHESTPLATE = new EmeraldArmour("emerald_chestplate", ArmourSetOSEmerald, 1, EntityEquipmentSlot.CHEST);
public static final Item EMERALD_LEGGINGS = new EmeraldArmour("emerald_leggings", ArmourSetOSEmerald, 2, EntityEquipmentSlot.LEGS);
public static final Item EMERALD_BOOTS = new EmeraldArmour("emerald_boots", ArmourSetOSEmerald, 1, EntityEquipmentSlot.FEET);

//same properties as Emeralds
public static final Item AMETHYST_PICKAXE = new EmeraldPic("amethyst_pickaxe", AmethystTool);
public static final Item AMETHYST_HOE = new EmeraldHoe("amethyst_hoe", AmethystTool);
public static final Item AMETHYST_SWORD = new EmeraldSword("amethyst_sword", AmethystTool);
public static final Item AMETHYST_SHOVEL = new EmeraldShovel("amethyst_shovel", AmethystTool);
public static final Item AMETHYST_HELMET = new EmeraldArmour("amethyst_helmet", ArmourSetAmethyst, 1, EntityEquipmentSlot.HEAD);
public static final Item AMETHYST_CHESTPLATE = new EmeraldArmour("amethyst_chestplate", ArmourSetAmethyst, 1, EntityEquipmentSlot.CHEST);
public static final Item AMETHYST_LEGGINGS = new EmeraldArmour("amethyst_leggings", ArmourSetAmethyst, 2, EntityEquipmentSlot.LEGS);
public static final Item AMETHYST_BOOTS = new EmeraldArmour("amethyst_boots", ArmourSetAmethyst, 1, EntityEquipmentSlot.FEET);

//same properties as AMETHYST
public static final Item SAPPHIRE_PICKAXE = new EmeraldPic("sapphire_pickaxe", SapphireTool);
public static final Item SAPPHIRE_HOE = new EmeraldHoe("sapphire_hoe", SapphireTool);
public static final Item SAPPHIRE_SWORD = new EmeraldSword("sapphire_sword", SapphireTool);
public static final Item SAPPHIRE_SHOVEL = new EmeraldShovel("sapphire_shovel", SapphireTool);
public static final Item SAPPHIRE_HELMET = new EmeraldArmour("sapphire_helmet", ArmourSetSapphire, 1, EntityEquipmentSlot.HEAD);
public static final Item SAPPHIRE_CHESTPLATE = new EmeraldArmour("sapphire_chestplate", ArmourSetSapphire, 1, EntityEquipmentSlot.CHEST);
public static final Item SAPPHIRE_LEGGINGS = new EmeraldArmour("sapphire_leggings", ArmourSetSapphire, 2, EntityEquipmentSlot.LEGS);
public static final Item SAPPHIRE_BOOTS = new EmeraldArmour("sapphire_boots", ArmourSetSapphire, 1, EntityEquipmentSlot.FEET);




//Same Properties as Emeralds
public static final Item RUBY_PICKAXE = new EmeraldPic("ruby_pickaxe", RubyTool);
public static final Item RUBY_HOE = new EmeraldHoe("ruby_hoe", RubyTool);
public static final Item RUBY_SWORD = new EmeraldSword("ruby_sword", RubyTool);
public static final Item RUBY_SHOVEL = new EmeraldShovel("ruby_shovel", RubyTool);
public static final Item RUBY_HELMET = new EmeraldArmour("ruby_helmet", RubyArmour, 1, EntityEquipmentSlot.HEAD);
public static final Item RUBY_CHESTPLATE = new EmeraldArmour("ruby_chestplate", RubyArmour, 1, EntityEquipmentSlot.CHEST);
public static final Item RUBY_LEGGINGS = new EmeraldArmour("ruby_leggings", RubyArmour, 2, EntityEquipmentSlot.LEGS);
public static final Item RUBY_BOOTS = new EmeraldArmour("ruby_boots", RubyArmour, 1, EntityEquipmentSlot.FEET);


//Same Properties as Emeralds
public static final Item TIGERS_EYE_PICKAXE = new EmeraldPic("tigers_eye_pickaxe", TigerEyeTool);
public static final Item TIGERS_EYE_HOE = new EmeraldHoe("tigers_eye_hoe", TigerEyeTool);
public static final Item TIGERS_EYE_SWORD = new EmeraldSword("tigers_eye_sword", TigerEyeTool);
public static final Item TIGERS_EYE_SHOVEL = new EmeraldShovel("tigers_eye_shovel", TigerEyeTool);
public static final Item TIGERS_EYE_HELMET = new EmeraldArmour("tigers_eye_helmet", TigerEyeArmour, 1, EntityEquipmentSlot.HEAD);
public static final Item TIGERS_EYE_CHESTPLATE = new EmeraldArmour("tigers_eye_chestplate", TigerEyeArmour, 1, EntityEquipmentSlot.CHEST);
public static final Item TIGERS_EYE_LEGGINGS = new EmeraldArmour("tigers_eye_leggings", TigerEyeArmour, 2, EntityEquipmentSlot.LEGS);
public static final Item TIGERS_EYE_BOOTS = new EmeraldArmour("tigers_eye_boots", TigerEyeArmour, 1, EntityEquipmentSlot.FEET);

//Same Properties as Emeralds
public static final Item OPTIMISED_PICKAXE = new EmeraldPic("optimised_pickaxe", OptimisedTool);
public static final Item OPTIMISED_SHOVEL = new EmeraldShovel("optimised_shovel", OptimisedTool);


public static final Item ULTIMATE_HELMET = new EmeraldArmour("ultimate_helmet", UltimateArmour, 1, EntityEquipmentSlot.HEAD);
public static final Item ULTIMATE_CHESTPLATE = new EmeraldArmour("ultimate_chestplate", UltimateArmour, 1, EntityEquipmentSlot.CHEST);
public static final Item ULTIMATE_LEGGINGS = new EmeraldArmour("ultimate_leggings", UltimateArmour, 2, EntityEquipmentSlot.LEGS);
public static final Item ULTIMATE_BOOTS = new EmeraldArmour("ultimate_boots", UltimateArmour, 1, EntityEquipmentSlot.FEET);
public static final Item ULTIMATE_PICKAXE = new EmeraldPic("ultimate_pickaxe", UltimateTool);
public static final Item ULTIMATE_HOE = new EmeraldHoe("ultimate_hoe", UltimateTool);
public static final Item ULTIMATE_SWORD = new EmeraldSword("ultimate_sword", UltimateTool);
public static final Item ULTIMATE_SHOVEL = new EmeraldShovel("ultimate_shovel", UltimateTool);





public static final Item TIN_HELMET = new EmeraldArmour("tin_helmet", ArmourTin, 1, EntityEquipmentSlot.HEAD);
public static final Item TIN_CHESTPLATE = new EmeraldArmour("tin_chestplate", ArmourTin, 1, EntityEquipmentSlot.CHEST);
public static final Item TIN_LEGGINGS = new EmeraldArmour("tin_leggings", ArmourTin, 2, EntityEquipmentSlot.LEGS);
public static final Item TIN_BOOTS = new EmeraldArmour("tin_boots", ArmourTin, 1, EntityEquipmentSlot.FEET);

public static final Item COPPER_HELMET = new EmeraldArmour("copper_helmet", ArmourCopper, 1, EntityEquipmentSlot.HEAD);
public static final Item COPPER_CHESTPLATE = new EmeraldArmour("copper_chestplate", ArmourCopper, 1, EntityEquipmentSlot.CHEST);
public static final Item COPPER_LEGGINGS = new EmeraldArmour("copper_leggings", ArmourCopper, 2, EntityEquipmentSlot.LEGS);
public static final Item COPPER_BOOTS = new EmeraldArmour("copper_boots", ArmourCopper, 1, EntityEquipmentSlot.FEET);


public static final Item PLATINUM_HELMET = new EmeraldArmour("platinum_helmet", ArmourPlatinum, 1, EntityEquipmentSlot.HEAD);
public static final Item PLATINUM_CHESTPLATE = new EmeraldArmour("platinum_chestplate", ArmourPlatinum, 1, EntityEquipmentSlot.CHEST);
public static final Item PLATNIUM_LEGGINGS = new EmeraldArmour("platinum_leggings", ArmourPlatinum, 2, EntityEquipmentSlot.LEGS);
public static final Item PLATINUM_BOOTS = new EmeraldArmour("platinum_boots", ArmourPlatinum, 1, EntityEquipmentSlot.FEET);

public static final Item SILVER_HELMET = new EmeraldArmour("silver_helmet", ArmourSilver, 1, EntityEquipmentSlot.HEAD);
public static final Item SILVER_CHESTPLATE = new EmeraldArmour("silver_chestplate", ArmourSilver, 1, EntityEquipmentSlot.CHEST);
public static final Item SILVER_LEGGINGS = new EmeraldArmour("silver_leggings", ArmourSilver, 2, EntityEquipmentSlot.LEGS);
public static final Item SILVER_BOOTS = new EmeraldArmour("silver_boots", ArmourSilver, 1, EntityEquipmentSlot.FEET);

public static final Item ALUMINIUM_HELMET = new EmeraldArmour("aluminium_helmet", ArmourAluminium, 1, EntityEquipmentSlot.HEAD);
public static final Item ALUMINIUM_CHESTPLATE = new EmeraldArmour("aluminium_chestplate", ArmourAluminium, 1, EntityEquipmentSlot.CHEST);
public static final Item ALUMINIUM_LEGGINGS = new EmeraldArmour("aluminium_leggings", ArmourAluminium, 2, EntityEquipmentSlot.LEGS);
public static final Item ALUMINIUM_BOOTS = new EmeraldArmour("aluminium_boots", ArmourAluminium, 1, EntityEquipmentSlot.FEET);

public static final Item EXPERIENCE_HELMET = new EmeraldArmour("experience_helmet", ArmourExperience, 1, EntityEquipmentSlot.HEAD);
public static final Item EXPERIENCE_CHESTPLATE = new EmeraldArmour("experience_chestplate", ArmourExperience, 1, EntityEquipmentSlot.CHEST);
public static final Item EXPERIENCE_LEGGINGS = new EmeraldArmour("experience_leggings", ArmourExperience, 2, EntityEquipmentSlot.LEGS);
public static final Item EXPERIENCE_BOOTS = new EmeraldArmour("experience_boots", ArmourExperience, 1, EntityEquipmentSlot.FEET);

public static final Item ROYAL_GUARDIAN_HELMET = new EmeraldArmour("royal_guardian_helmet", ROYAL_GUARDIAN_ARMOUR, 1, EntityEquipmentSlot.HEAD);
public static final Item ROYAL_GUARDIAN_CHESTPLATE = new EmeraldArmour("royal_guardian_chestplate", ROYAL_GUARDIAN_ARMOUR, 1, EntityEquipmentSlot.CHEST);
public static final Item ROYAL_GUARDIAN_LEGGINGS = new EmeraldArmour("royal_guardian_leggings", ROYAL_GUARDIAN_ARMOUR, 2, EntityEquipmentSlot.LEGS);
public static final Item ROYAL_GUARDIAN_BOOTS = new EmeraldArmour("royal_guardian_boots", ROYAL_GUARDIAN_ARMOUR, 1, EntityEquipmentSlot.FEET);


public static final Item QUEEN_SCALE_HELMET = new EmeraldArmour("queen_scale_helmet", QUEEN_SCALE_ARMOUR, 1, EntityEquipmentSlot.HEAD);
public static final Item QUEEN_SCALE_CHESTPLATE = new EmeraldArmour("queen_scale_chestplate", QUEEN_SCALE_ARMOUR, 1, EntityEquipmentSlot.CHEST);
public static final Item QUEEN_SCALE_LEGGINGS = new EmeraldArmour("queen_scale_leggings", QUEEN_SCALE_ARMOUR, 2, EntityEquipmentSlot.LEGS);
public static final Item QUEEN_SCALE_BOOTS = new EmeraldArmour("queen_scale_boots", QUEEN_SCALE_ARMOUR, 1, EntityEquipmentSlot.FEET);

public static final Item MOBZILLA_SCALE_HELMET = new EmeraldArmour("mobzilla_scale_helmet", MOBZILLA_SCALE_ARMOUR, 1, EntityEquipmentSlot.HEAD);
public static final Item MOBZILLA_SCALE_CHESTPLATE = new EmeraldArmour("mobzilla_scale_chestplate", MOBZILLA_SCALE_ARMOUR, 1, EntityEquipmentSlot.CHEST);
public static final Item MOBZILLA_SCALE_LEGGINGS = new EmeraldArmour("mobzilla_scale_leggings", MOBZILLA_SCALE_ARMOUR, 2, EntityEquipmentSlot.LEGS);
public static final Item MOBZILLA_SCALE_BOOTS = new EmeraldArmour("mobzilla_scale_boots", MOBZILLA_SCALE_ARMOUR, 1, EntityEquipmentSlot.FEET);


public static final Item LAPIS_LAZUI_HELMET = new EmeraldArmour("lapis_block_helmet", LAPIS_LAZUI_ARMOUR, 1, EntityEquipmentSlot.HEAD);
public static final Item LAPIS_LAZUI_CHESTPLATE = new EmeraldArmour("lapis_block_chestplate", LAPIS_LAZUI_ARMOUR, 1, EntityEquipmentSlot.CHEST);
public static final Item LAPIS_LAZUI_LEGGINGS = new EmeraldArmour("lapis_block_leggings", LAPIS_LAZUI_ARMOUR, 2, EntityEquipmentSlot.LEGS);
public static final Item LAPIS_LAZUI_BOOTS = new EmeraldArmour("lapis_block_boots", LAPIS_LAZUI_ARMOUR, 1, EntityEquipmentSlot.FEET);


public static final Item LAVA_EEL_HELMET = new EmeraldArmour("lava_eel_helmet", LAVA_Eel_ARMOUR, 1, EntityEquipmentSlot.HEAD);
public static final Item LAVA_EEL_CHESTPLATE = new EmeraldArmour("lava_eel_chestplate", LAVA_Eel_ARMOUR, 1, EntityEquipmentSlot.CHEST);
public static final Item LAVA_EEL_LEGGINGS = new EmeraldArmour("lava_eel_leggings", LAVA_Eel_ARMOUR, 2, EntityEquipmentSlot.LEGS);
public static final Item LAVA_EEL_BOOTS = new EmeraldArmour("lava_eel_boots", LAVA_Eel_ARMOUR, 1, EntityEquipmentSlot.FEET);

public static final Item PEACOCK_FEATHER_HELMET = new EmeraldArmour("peacock_feather_helmet", PEACOCK_FEATHER_ARMOUR, 1, EntityEquipmentSlot.HEAD);
public static final Item PEACOCK_FEATHER_CHESTPLATE = new EmeraldArmour("peacock_feather_chestplate", PEACOCK_FEATHER_ARMOUR, 1, EntityEquipmentSlot.CHEST);
public static final Item PEACOCK_FEATHER_LEGGINGS = new EmeraldArmour("peacock_feather_leggings", PEACOCK_FEATHER_ARMOUR, 2, EntityEquipmentSlot.LEGS);
public static final Item PEACOCK_FEATHER_BOOTS = new EmeraldArmour("peacock_feather_boots", PEACOCK_FEATHER_ARMOUR, 1, EntityEquipmentSlot.FEET);


public static final Item PINK_TOURMALINE_HELMET = new EmeraldArmour("pink_tourmaline_helmet", ArmourPinkTourmaline, 1, EntityEquipmentSlot.HEAD);
public static final Item PINK_TOURMALINE_CHESTPLATE = new EmeraldArmour("pink_tourmaline_chestplate", ArmourPinkTourmaline, 1, EntityEquipmentSlot.CHEST);
public static final Item PINK_TOURMALINE_LEGGINGS = new EmeraldArmour("pink_tourmaline_leggings", ArmourPinkTourmaline, 2, EntityEquipmentSlot.LEGS);
public static final Item PINK_TOURMALINE_BOOTS = new EmeraldArmour("pink_tourmaline_boots", ArmourPinkTourmaline, 1, EntityEquipmentSlot.FEET);

public static final Item MOTH_SCALE_HELMET = new EmeraldArmour("moth_scale_helmet", MOTH_SCALE_Armour, 1, EntityEquipmentSlot.HEAD);
public static final Item MOTH_SCALE_CHESTPLATE = new EmeraldArmour("moth_scale_chestplate", MOTH_SCALE_Armour, 1, EntityEquipmentSlot.CHEST);
public static final Item MOTH_SCALE_LEGGINGS = new EmeraldArmour("moth_scale_leggings", MOTH_SCALE_Armour, 2, EntityEquipmentSlot.LEGS);
public static final Item MOTH_SCALE_BOOTS = new EmeraldArmour("moth_scale_boots", MOTH_SCALE_Armour, 1, EntityEquipmentSlot.FEET);

public static final Item CZ_SLOW_BOOTS = new CZSlowArmour("cz_slow_boots", CZArmourSlow, 1, EntityEquipmentSlot.FEET);




//Foods
public static final Item RAW_BACON = new RawBacon("raw_bacon", 5, true);
public static final Item COOKED_BACON = new RawBacon("cooked_bacon", 10, true);
public static final Item BUTTER_CANDY = new RawBacon("butter_candy", 3, true);
public static final Item CRYSTAL_APPLE = new RawBacon("crystal_apple", 10, true);
public static final Item LOVE_FOOD = new RawBacon("love_food", 15, true);
public static final Item POPCORN = new RawBacon("popcorn", 3, true);
public static final Item BUTTER_FOOD = new RawBacon("butter_food", 3, true);
public static final Item CORN_DOG = new RawBacon("corn_dog", 5, true);
public static final Item COOKED_CORN_DOG = new RawBacon("cooked_corn_dog", 5, true);
public static final Item RAW_CRAB_MEAT = new RawBacon("raw_crab_meat", 5, true);
public static final Item COOKED_CRAB_MEAT = new RawBacon("cooked_crab_meat", 10, true);
public static final Item CHEESE = new RawBacon("cheese", 3, true);
public static final Item SALAD = new RawBacon("salad", 15, true);
public static final Item BLT = new RawBacon("blt", 13, true);
public static final Item CRAB_PATTY = new RawBacon("crab_patty", 13, true);
public static final Item MAGIC_APPLE = new RawBacon("magic_apple", 15, true);
public static final Item PEACH = new RawBacon("peach", 5, true);
public static final Item RAW_PEACOCK = new RawBacon("raw_peacock", 8, true);
public static final Item COOCKED_PEACOCK = new RawBacon("coocked_peacock", 13, true);
public static final Item BLUE_FISH = new RawBacon("blue_fish", 5, true);
public static final Item BUTTERED_POPCORN = new RawBacon("buttered_popcorn", 10, true);
public static final Item SALTED_POPCORN = new RawBacon("salted_popcorn", 10, true);
public static final Item BUTTERED_AND_SALTED_POPCORN = new RawBacon("buttered_and_salted_popcorn", 15, true);
public static final Item CHERRY = new RawBacon("cherry", 5, true);
public static final Item CORN = new RawBacon("corn", 5, true);
public static final Item POPCORN_BAG = new RawBacon("popcorn_bag", 15, true);
public static final Item QUINOA = new RawBacon("quinoa", 5, true);
public static final Item RADISH = new RawBacon("radish", 5, true);
public static final Item RICE = new RawBacon("rice", 5, true);
public static final Item ROCK_FISH = new RawBacon("rock_fish", 5, true);
public static final Item FIRE_FISH = new RawBacon("fire_fish", 5, true);
public static final Item SPARK_FISH = new RawBacon("spark_fish", 5, true);
public static final Item GREEN_FISH = new RawBacon("green_fish", 5, true);
public static final Item GREY_FISH = new RawBacon("grey_fish", 5, true);
public static final Item SUN_FISH = new RawBacon("sun_fish", 5, true);
public static final Item STRAWBERRY = new RawBacon("strawberry", 5, true);
public static final Item LETTUCE = new RawBacon("lettuce", 5, true);
public static final Item TOMATO = new RawBacon("tomato", 5, true);
public static final Item WOOD_FISH = new RawBacon("wood_fish", 5, true);
public static final Item RAW_MOOSE_MEAT = new RawBacon("raw_moose_meat", 5, true);
//public static final Item COOKED_MOOSE_MEAT = new RawBacon("raw_bacon", 2, true);
public static final Item DEAD_BUG = new RawBacon("dead_bug", 2, true);
public static final Item MAGIC_FROG_OF_STRENGTH = new RawBacon("magic_frog_of_strength", 5, true);
public static final Item MAGIC_FROG_OF_WEAKNESS = new RawBacon("magic_frog_of_weakness", 5, true);
public static final Item MAGIC_FROG_OF_SPEED = new RawBacon("magic_frog_of_speed", 5, true);
public static final Item MAGIC_FROG_OF_SLOWNESS = new RawBacon("magic_frog_of_slowness", 5, true);
public static final Item MAGIC_FROG_OF_REGENERATION = new RawBacon("magic_frog_of_regeneration", 5, true);
public static final Item MAGIC_FROG_OF_POISON = new RawBacon("magic_frog_of_poison", 5, true);
public static final Item MAGIC_FROG_OF_MORPH = new RawBacon("magic_frog_of_morph", 5, true);
public static final Item MAGIC_FROG_OF_CONFUSION = new RawBacon("magic_frog_of_confusion", 5, true);
public static final Item COOKED_MOOSE_MEAT = new RawBacon("cooked_moose_meat", 10, true);
public static final Item CANDY_CANE = new RawBacon("candy_cane", 10, true);
public static final Item GOLDEN_BREAD = new RawBacon("golden_bread", 10, true);
public static final Item GOLDEN_CHICKEN = new RawBacon("golden_chicken", 10, true);
public static final Item GOLDEN_TROPICAL_FISH = new RawBacon("golden_tropical_fish", 10, true);
public static final Item GOLDEN_COD = new RawBacon("golden_cod", 10, true);
public static final Item GOLDEN_PORKCHOP = new RawBacon("golden_porkchop", 10, true);
public static final Item WATERMELON_SLICE = new RawBacon("watermelon_slice", 10, true);
public static final Item GOLDEN_MUSHROOM_STEW = new RawBacon("golden_mushroom_stew", 15, true);
public static final Item GOLDEN_STEAK = new RawBacon("golden_steak", 15, true);
public static final Item GOLDEN_COOKIE = new RawBacon("golden_cookie", 10, true);
public static final Item GOLDEN_POTATO = new RawBacon("golden_potato", 10, true);
public static final Item GOLDEN_PUMPKIN_PIE = new RawBacon("golden_pumpkin_pie", 15, true);
public static final Item GOLDEN_ROTTON_FLESH = new RawBacon("golden_rotton_flesh", 10, true);
public static final Item GOLDEN_CARROT = new RawBacon("golden_carrot", 10, true);
public static final Item GOLDEN_PUFFERFISH = new RawBacon("golden_pufferfish", 10, true);
public static final Item GOLDEN_SALMON = new RawBacon("golden_salmon", 10, true);
public static final Item GOLDEN_CANDYCANE = new RawBacon("golden_candycane", 15, true);
public static final Item ULTIMATE_APPLE = new RawBacon("ultimate_apple", 15, true);
public static final Item ENCHANTED_GOLDEN_CARROT = new RawBacon("enchanted_golden_carrot", 15, true);
public static final Item ENCHANTED_GOLDEN_STEAK = new RawBacon("enchanted_golden_steak", 15, true);
public static final Item ENCHANTED_GOLDEN_COD = new RawBacon("enchanted_golden_cod", 15, true);
public static final Item ENCHANTED_GOLDEN_COOKIE = new RawBacon("enchanted_golden_cookie", 15, true);
public static final Item ENCHANTED_GOLDEN_CANDYCANE = new RawBacon("enchanted_golden_candycane", 15, true);
public static final Item RADDISH_STEW = new RawBacon("raddish_stew", 15, true);
public static final Item DRINKABLE_GASOLINE_PETROL = new RawBacon("drinkable_gasoline_petrol", 15, true);




public FeatureCreepMC()
{
	GameRegistry.registerFuelHandler(new Fuels());

	
	
	
	
}






}
