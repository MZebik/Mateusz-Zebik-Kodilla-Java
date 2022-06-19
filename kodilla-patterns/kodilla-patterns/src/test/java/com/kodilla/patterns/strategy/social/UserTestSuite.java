package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User marek = new Millenials("Marek");
        User brajan = new YGeneration("Brajan");
        User julia = new ZGeneration("Julia");

        //When
        String marekSocialMedia = marek.sharePost();
        System.out.println("Marek share post on: " + marekSocialMedia);
        String brajanSocialMedia = brajan.sharePost();
        System.out.println("Brajan share post on: " + brajanSocialMedia);
        String juliaSocialMedia = julia.sharePost();
        System.out.println("Julia share post on: " + juliaSocialMedia);

        //Then
        assertEquals("Facebook", marekSocialMedia);
        assertEquals("Twitter", brajanSocialMedia);
        assertEquals("Snapchat", juliaSocialMedia);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User marek = new Millenials("Marek");

        //When
        String marekSocialMedia = marek.sharePost();
        System.out.println("Marek share post on: " + marekSocialMedia);
        marek.setSocialPublisher(new TwitterPublisher());
        marekSocialMedia = marek.sharePost();
        System.out.println("Now post on: " + marekSocialMedia);

        //Then
        assertEquals("Twitter", marekSocialMedia);
    }
}
