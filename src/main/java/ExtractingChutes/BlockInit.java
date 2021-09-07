package ExtractingChutes;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtractingChutes.MOD_ID);

    public static final RegistryObject<Block> EXTRACTING_CHUTE = BLOCKS.register("extracting_chute", () -> new BlockEChute(AbstractBlock.Properties.create(Material.IRON)));
}
