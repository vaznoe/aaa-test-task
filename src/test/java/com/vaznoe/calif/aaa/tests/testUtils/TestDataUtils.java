package com.vaznoe.calif.aaa.tests.testUtils;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;

public class TestDataUtils {

    public static String firstName = "First" + randomAlphanumeric(5);
    public static String lastName = "Last" + randomAlphanumeric(5);

    public static String address = "9641 Sunset Blvd";
    public static String city = "Beverly Hills";
    public static String state = "CA";
    public static String zipCode = "90210";

    public static String email = "test@gmail.com";
    public static String phoneNumber = "3102762251";
}