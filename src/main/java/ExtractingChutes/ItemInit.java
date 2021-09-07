package ExtractingChutes;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtractingChutes.MOD_ID);

    public static final RegistryObject<BlockItem> EXTRACTING_CHUTE = ITEMS.register("extracting_chute", () -> new BlockItem(BlockInit.EXTRACTING_CHUTE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}
