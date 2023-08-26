package com.hami.design_pattern.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class PlatformFactory {
    private static Map<String, Platform> map = new HashMap<>();

    private PlatformFactory() {
        throw new AssertionError("Cannot instantiate the class.");
    }


    public static synchronized Platform getPlatform(String platformType) {
        Platform platform = map.get(platformType);
        if (Objects.isNull(platform)) {
            switch (platformType) {
                case "C" -> platform = new CPlatform();
                case "Java" -> platform = new JavaPlatform();
                case "Ruby" -> platform = new RubyPlatform();
                case "CPP" -> platform = new CPPPlatform();
            }
            map.put(platformType,platform);
        }

        return platform;
    }
}
