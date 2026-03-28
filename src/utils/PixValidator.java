package utils;

public class PixValidator {
    public static boolean validate(String pixKey) {
        return pixKey != null && pixKey.length() >= 8;
    }
}