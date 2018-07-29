package com.vaznoe.calif.aaa.apps;

/**
 * @author vaznoe
 * Date: 7/28/2018
 */
public interface Config {

    String environment = System.getProperty("environment", "prod");
    String browser = System.getProperty("browserName", "chrome"); //e.g. firefox
}