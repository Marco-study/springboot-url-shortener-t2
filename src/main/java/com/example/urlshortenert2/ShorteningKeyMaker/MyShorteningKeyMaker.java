package com.example.urlshortenert2.ShorteningKeyMaker;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "mine")
public class MyShorteningKeyMaker implements ShorteningKeyMaker {
    @Override
    public String makeShorteningKey(Long id) {
        return null;
    }
}