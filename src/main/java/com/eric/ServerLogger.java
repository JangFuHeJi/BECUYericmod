package com.eric;

import net.fabricmc.api.ModInitializer;

import static com.eric.BECUYeric.LOGGER;

public class ServerLogger implements ModInitializer {
    @Override
    public void onInitialize() {
        LOGGER.info("BECUY MOD开启检查您的客户端"+
                "本环节调用了Mixin，并且每隔1分钟会检查一次" +
                "服务器会有通知，如果有人改变了后台的配置，我们将会在此处一样报警");
    }
}
