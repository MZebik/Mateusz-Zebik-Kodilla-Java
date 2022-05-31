package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreRunner {
    public static void main(String[] args){

        MovieStore movieStore = new MovieStore();
        String allTitles = movieStore.getMovies().entrySet().stream()
                .flatMap(titles -> titles.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(allTitles);
    }
}
