package com.nerdery.umbrella.api;

public class IconApi {
    IconApi() {}
    public String getUrlForIcon(String icon, boolean highlighted) {
        String highlightParam = highlighted ? "-selected" : "";
        return String.format("http://nerdery-umbrella.s3.amazonaws.com/%s%s.png", icon, highlightParam);
    }
}
