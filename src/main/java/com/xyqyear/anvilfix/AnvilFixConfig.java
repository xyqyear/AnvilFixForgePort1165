package com.xyqyear.anvilfix;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class AnvilFixConfig {
    public static class Configuration {
        private final ForgeConfigSpec.ConfigValue<Integer> REPAIR_LIMIT;

        public Configuration(ForgeConfigSpec.Builder builderIn) {
            builderIn.comment("Anvil Fix xyqyear 1.16.5 forge port")
                    .push("general");
            REPAIR_LIMIT = builderIn.comment("The maximum level limit for repairs. If it is -1, then there is no limit.")
                    .define("repair_level_limit", -1);
        }
    }

    public static final ForgeConfigSpec CONFIGSPEC;
    public static final Configuration CONFIG;

    static {
        final Pair<Configuration, ForgeConfigSpec> pair = new ForgeConfigSpec.Builder().configure(Configuration::new);
        CONFIGSPEC = pair.getRight();
        CONFIG = pair.getLeft();
    }

    public static int getLevelLimit() {
        return CONFIG.REPAIR_LIMIT.get() != -1 ? CONFIG.REPAIR_LIMIT.get() + 1 : Integer.MAX_VALUE;
    }
}
