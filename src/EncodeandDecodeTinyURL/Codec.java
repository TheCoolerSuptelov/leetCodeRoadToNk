package EncodeandDecodeTinyURL;

import java.util.HashMap;

public class Codec {
    public static final String domenURL = "http://tinyurl.com/";
    public HashMap<String,String> storage = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String shortUrl = domenURL + longUrl.hashCode();
        storage.put(shortUrl, longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return storage.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));1`