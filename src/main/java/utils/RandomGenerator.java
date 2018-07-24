package utils;


import org.apache.commons.lang.RandomStringUtils;

import java.util.Random;

public class RandomGenerator {

    public static String generateRandomString(){
        return RandomStringUtils.random(10, true, false);
    }

    public static String generateRandomPhoneNumber() {
        return "+371" + RandomStringUtils.random(8,false,true);
    }

    public static String generatRandomEmail() {
        return  RandomStringUtils.random(7, true, false) + "." +
                RandomStringUtils.random(7,true,false) + "@" +
                RandomStringUtils.random(7,true,false) + ".com";
    }

}
