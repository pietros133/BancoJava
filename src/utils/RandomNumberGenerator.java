package utils;

import java.util.Random;

public class RandomNumberGenerator {

    public static int generateAccountNumber() {
        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }
}