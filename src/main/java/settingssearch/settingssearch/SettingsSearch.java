package settingssearch.settingssearch;

import net.fabricmc.api.ModInitializer;
import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

public class SettingsSearch implements ModInitializer {

    public static final String MOD_ID = "settingssearch";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {
        LOGGER.info("HELLO, BRIAN");
    }
}
