package util;

import java.nio.charset.StandardCharsets;

public class UTF8 {
    public static String parse(String string) {
        return new String(string.getBytes(), StandardCharsets.UTF_8);
    }
}