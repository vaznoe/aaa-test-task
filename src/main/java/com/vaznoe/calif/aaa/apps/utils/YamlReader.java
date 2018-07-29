package com.vaznoe.calif.aaa.apps.utils;

import com.vaznoe.calif.aaa.apps.utils.properties.Configuration;
import org.apache.log4j.Logger;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

/**
 * @author vaznoe
 * Date: 7/28/2018
 */
public class YamlReader {

    private static final Logger LOGGER = Logger.getLogger(YamlReader.class);

    private final String filePath;
    private final String fileName;
    private Configuration configMap = null;

    public YamlReader(String filePath, String fileName) {
        this.filePath = filePath;
        this.fileName = fileName;
    }

    public Configuration getConfigMap() {
        try {
            YamlReader reader = new YamlReader(this.filePath, this.fileName);
            configMap = reader.read(this.filePath + this.fileName, Configuration.class);
        } catch (IOException e) {
            LOGGER.error("File " + this.filePath + this.fileName + " not found..");
            e.printStackTrace();
        }
        return configMap;
    }

    private <T> T read(String path, Class<T> c) throws IOException {
        Yaml yaml = new Yaml();
        try (InputStream in = Files.newInputStream(Paths.get(path))) {
            return yaml.loadAs(in, c);
        }
    }

    private Map<String, Object> read(String path) throws IOException {
        InputStream in = Files.newInputStream(Paths.get(path));
        Yaml yaml = new Yaml();
        return (Map<String, Object>) yaml.load(in);
    }
}
