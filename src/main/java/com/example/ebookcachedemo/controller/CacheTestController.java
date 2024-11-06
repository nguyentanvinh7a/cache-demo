package com.example.ebookcachedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheTestController {

    @Autowired
    private CacheManager cacheManager;

    @GetMapping("/cache-test")
    public String cacheTest() {
        Cache cache = cacheManager.getCache("testCache");
        if (cache != null) {
            cache.put("hello", "world");
            String value = cache.get("hello", String.class);
            return "Cached value: " + value;
        }
        return "Cache is not available.";
    }
}
