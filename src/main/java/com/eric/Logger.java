package com.eric;

import net.fabricmc.api.ModInitializer;

import static com.eric.BECUYeric.LOGGER;

public class Logger implements ModInitializer {
    @Override
    public void onInitialize() {
        LOGGER.info("""
                
                ============================================
                |
                |
                |正在启动BECUYeric
                v 1.0.0
                |
                |
                ============================================
                """);
    }
}
