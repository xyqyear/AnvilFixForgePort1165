package com.xyqyear.anvilfix;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod("anvilfix")
public class AnvilFix {
    private static final Logger LOGGER = LogManager.getLogger();

    public AnvilFix() {
        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, AnvilFixConfig.CONFIGSPEC, "anvilfix-common.toml");

    }
}
