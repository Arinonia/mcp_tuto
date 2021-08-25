package fr.arinonia.init;

import fr.arinonia.item.ItemBase;
import fr.arinonia.item.tools.ItemCustomAxe;
import fr.arinonia.item.tools.ItemCustomHoe;
import fr.arinonia.item.tools.ItemCustomPickaxe;
import fr.arinonia.item.tools.ItemCustomShovel;
import fr.arinonia.item.weapons.ItemCustomSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class ItemRegister {

    public void registerItems() {
        int id = 500;
        final ItemBase bauxite = new ItemBase("bauxite");
        final ItemBase dolomite = new ItemBase("dolomite");
        final ItemBase kobalte = new ItemBase("kobalte");
        final ItemBase dragonium = new ItemBase("dragonium");

        this.addItem(id++, "bauxite", bauxite);
        this.addItem(id++, "dolomite", dolomite);
        this.addItem(id++, "kobalte", kobalte);
        this.addItem(id++, "dragonium", dragonium);

        this.addItem(id++, "legendary_dragon_shard", new ItemBase("legendary_dragon_shard"));

        this.addItem(id++, "bauxite_axe", new ItemCustomAxe(Item.ToolMaterial.BAUXITE, "bauxite_axe"));
        this.addItem(id++, "bauxite_hoe", new ItemCustomHoe(Item.ToolMaterial.BAUXITE, "bauxite_hoe"));
        this.addItem(id++, "bauxite_pickaxe", new ItemCustomPickaxe(Item.ToolMaterial.BAUXITE, "bauxite_pickaxe"));
        this.addItem(id++, "bauxite_shovel", new ItemCustomShovel(Item.ToolMaterial.BAUXITE, "bauxite_shovel"));
        this.addItem(id++, "bauxite_sword", new ItemCustomSword(Item.ToolMaterial.BAUXITE, "bauxite_sword"));

        this.addItem(id++, "dolomite_axe", new ItemCustomAxe(Item.ToolMaterial.DOLOMITE, "dolomite_axe"));
        this.addItem(id++, "dolomite_hoe", new ItemCustomHoe(Item.ToolMaterial.DOLOMITE, "dolomite_hoe"));
        this.addItem(id++, "dolomite_pickaxe", new ItemCustomPickaxe(Item.ToolMaterial.DOLOMITE, "dolomite_pickaxe"));
        this.addItem(id++, "dolomite_shovel", new ItemCustomShovel(Item.ToolMaterial.DOLOMITE, "dolomite_shovel"));
        this.addItem(id++, "dolomite_sword", new ItemCustomSword(Item.ToolMaterial.DOLOMITE, "dolomite_sword"));

        this.addItem(id++, "kobalte_axe", new ItemCustomAxe(Item.ToolMaterial.KOBALTE, "kobalte_axe"));
        this.addItem(id++, "kobalte_hoe", new ItemCustomHoe(Item.ToolMaterial.KOBALTE, "kobalte_hoe"));
        this.addItem(id++, "kobalte_pickaxe", new ItemCustomPickaxe(Item.ToolMaterial.KOBALTE, "kobalte_pickaxe"));
        this.addItem(id++, "kobalte_shovel", new ItemCustomShovel(Item.ToolMaterial.KOBALTE, "kobalte_shovel"));
        this.addItem(id++, "kobalte_sword", new ItemCustomSword(Item.ToolMaterial.KOBALTE, "kobalte_sword"));

        this.addItem(id++, "dragonium_axe", new ItemCustomAxe(Item.ToolMaterial.DRAGONIUM, "dragonium_axe"));
        this.addItem(id++, "dragonium_hoe", new ItemCustomHoe(Item.ToolMaterial.DRAGONIUM, "dragonium_hoe"));
        this.addItem(id++, "dragonium_pickaxe", new ItemCustomPickaxe(Item.ToolMaterial.DRAGONIUM, "dragonium_pickaxe"));
        this.addItem(id++, "dragonium_shovel", new ItemCustomShovel(Item.ToolMaterial.DRAGONIUM, "dragonium_shovel"));
        this.addItem(id++, "dragonium_sword", new ItemCustomSword(Item.ToolMaterial.DRAGONIUM, "dragonium_sword"));

        this.addItem(id++, "dragon_sword", new ItemCustomSword(Item.ToolMaterial.DRAGONIUM, "dragon_sword"));

        id = this.createArmorSetFromItem(id, bauxite, 5);
        id = this.createArmorSetFromItem(id, dolomite, 6);
        id = this.createArmorSetFromItem(id, kobalte, 7);
        id = this.createArmorSetFromItem(id, dragonium, 8);


    }

    private void addItem(int id, String name, Item item) {
        Item.itemRegistry.addObject(id, name, item);
    }

    private int createArmorSetFromItem(int id, ItemBase item, int renderIndex) {
        final ItemArmor.ArmorMaterial material = ItemArmor.ArmorMaterial.valueOf(item.getName().toUpperCase());
        this.addItem(id++, item.getName() + "_helmer", new ItemArmor(material, renderIndex, 0).setUnlocalizedName(item.getName() + "_helmet").setTextureName(item.getName() + "_helmet"));
        this.addItem(id++, item.getName() + "_chestplate", new ItemArmor(material, renderIndex, 1).setUnlocalizedName(item.getName() + "_chestplate").setTextureName(item.getName() + "_chestplate"));
        this.addItem(id++, item.getName() + "_leggings", new ItemArmor(material, renderIndex, 2).setUnlocalizedName(item.getName() + "_leggings").setTextureName(item.getName() + "_leggings"));
        this.addItem(id++, item.getName() + "_boots", new ItemArmor(material, renderIndex, 3).setUnlocalizedName(item.getName() + "_boots").setTextureName(item.getName() + "_boots"));
        return id;
    }
}
