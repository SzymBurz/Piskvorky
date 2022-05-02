package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class ChallengesMain {

    public static void main(String[] args){

        MovieStore movieStore = new MovieStore();

        System.out.println(movieStore.getMovies().entrySet().stream()
                .flatMap(a -> a.getValue().stream())
                .collect(Collectors.joining("!")));
    }
}
