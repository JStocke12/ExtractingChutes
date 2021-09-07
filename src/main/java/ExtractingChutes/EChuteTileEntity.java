package ExtractingChutes;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class EChuteTileEntity extends TileEntity implements ITickableTileEntity {

    public int x, y, z, tick;
    boolean initialized = false;

    public EChuteTileEntity(final TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    public EChuteTileEntity() {
        this(ModTileEntityTypes.EXTRACTING_CHUTE.get());
    }

    @Override
    public void tick(){
        if(!initialized) init();
        tick++;
        if(tick == 40) {
            tick = 0;
            execute();
        }
    }

    private void init() {
        initialized = true;
        x = this.pos.getX() - 1;
        y = this.pos.getY() - 1;
        z = this.pos.getZ() - 1;
        tick = 0;
    }

    private void execute() {

    }
}
