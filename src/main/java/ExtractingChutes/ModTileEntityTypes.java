package ExtractingChutes;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, ExtractingChutes.MOD_ID);

    public static final RegistryObject<TileEntityType<EChuteTileEntity>> EXTRACTING_CHUTE = TILE_ENTITY_TYPES.register("extracting_chute",
            () -> TileEntityType.Builder.create(EChuteTileEntity::new, BlockInit.EXTRACTING_CHUTE).build(null));
}
