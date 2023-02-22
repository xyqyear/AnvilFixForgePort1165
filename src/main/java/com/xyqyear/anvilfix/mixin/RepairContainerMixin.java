package com.xyqyear.anvilfix.mixin;

import com.xyqyear.anvilfix.AnvilFixConfig;
import net.minecraft.inventory.container.RepairContainer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(RepairContainer.class)
public class RepairContainerMixin {
    @ModifyConstant(method = "createResult()V", constant = @Constant(intValue = 40, ordinal = 2))
    private int modifyInt(int input) {
        return AnvilFixConfig.getLevelLimit();
    }
}
