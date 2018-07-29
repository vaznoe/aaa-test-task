package com.vaznoe.calif.aaa.apps.utils.properties;

import com.vaznoe.calif.aaa.apps.utils.YamlReader;

import static java.lang.System.getProperty;

/**
 * @author vaznoe
 * Date: 7/28/2018
 */
public enum SystemProperty {

    BASE_URL("baseUrl");

    private String value;

    SystemProperty(final String key) {
        this.value = retrieveValue(key);
    }

    public String getValue() {
        return this.value;
    }

    public boolean isSpecified() {
        return null != this.value && !this.value.isEmpty();
    }

    private String retrieveValue(final String key) {

        YamlReader yamlReader = new YamlReader("src/test/resources/", "config.yml");
        yamlReader.getConfigMap();

        if (yamlReader.getConfigMap() != null) {
            Object configValue = yamlReader.getConfigMap().environment.get(getProperty("environment")).get(key);
            if (configValue != null) {
                return configValue.toString();
            }
        }
        return null;
    }
}
