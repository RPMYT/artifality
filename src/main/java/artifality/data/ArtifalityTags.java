package artifality.data;

import artifality.ArtifalityMod;
import artifality.block.ArtifalityBlocks;
import artifality.item.ArtifalityItems;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import ru.bclib.api.TagAPI;

public class ArtifalityTags {

    public static final Tag.Identified<Item> ARTIFACTS = TagAPI.makeItemTag(ArtifalityMod.MOD_ID, "artifacts");
    public static final Tag.Identified<Item> CRYSTALS = TagAPI.makeItemTag(ArtifalityMod.MOD_ID, "crystals");
    public static final Tag.Identified<Item> LENSES = TagAPI.makeItemTag(ArtifalityMod.MOD_ID, "lenses");

    public static void initTags(){
        TagAPI.addTag(ARTIFACTS, new Item[]{ArtifalityItems.UKULELE, ArtifalityItems.ZEUS_STAFF, ArtifalityItems.FOREST_STAFF,
                ArtifalityItems.HARVEST_STAFF, ArtifalityItems.INVISIBILITY_CAPE, ArtifalityItems.BALLOON, ArtifalityItems.FLORAL_STAFF});

        TagAPI.addTag(CRYSTALS, new Item[]{ArtifalityItems.INCREMENTAL_CRYSTAL, ArtifalityItems.LUNAR_CRYSTAL, ArtifalityItems.LIFE_CRYSTAL});

        TagAPI.addTag(LENSES, new Item[]{ArtifalityBlocks.INCREMENTAL_CRYSTAL_LENS.asItem(), ArtifalityBlocks.LUNAR_CRYSTAL_LENS.asItem(),
                ArtifalityBlocks.LIFE_CRYSTAL_LENS.asItem()});
    }
}
