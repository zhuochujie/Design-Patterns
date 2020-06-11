package com.xiaoZ.creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class ContainerSingleton {
    private static Map<String,Object> map = new HashMap<>();

    public static void putInstance(String key,Object instance) {
        if (StringUtils.isNotBlank(key) && instance != null) {
            if (!map.containsKey(key)) {
                map.put(key,instance);
            }
        }
    }

    public Object getInstance(String key){
        return map.get(key);
    }
}
