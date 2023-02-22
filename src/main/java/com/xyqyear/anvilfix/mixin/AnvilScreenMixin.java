package com.xyqyear.anvilfix.mixin;

import com.xyqyear.anvilfix.AnvilFixConfig;
import net.minecraft.client.gui.screen.inventory.AnvilScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(AnvilScreen.class)
public class AnvilScreenMixin {
    @ModifyConstant(method = "renderLabels", constant = @Constant(intValue = 40, ordinal = 0))
    private int modifyInt(int input) {
        return AnvilFixConfig.getLevelLimit();
    }
}
