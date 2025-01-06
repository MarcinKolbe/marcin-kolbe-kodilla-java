package com.kodilla.patterns.strategy.social;

import java.util.concurrent.Flow;

public class FacebookPublisher implements SocialPublisher {


    @Override
    public String share() {
        return "Facebook";
    }
}
