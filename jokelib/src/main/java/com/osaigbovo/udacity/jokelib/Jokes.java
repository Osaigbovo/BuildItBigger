package com.osaigbovo.udacity.jokelib;

import java.util.Random;

// https://github.com/Ezike/BuildItBigger/blob/master/Jokeslib/src/main/java/com/example/jokeslib/Jokes.java
public final class Jokes {

    private static final Random RANDOM = new Random();

    private Jokes() {
    }

    private static String[] mJokes = {"I'm so good at sleeping, I can do it with my eyes closed", "Why is " +
            "Peter Pan always flying? He neverlands", "The other day, my wife asked me to pass " +
            "her lipstick but I accidentally passed her a glue stick. She still isn't talking to me",
            "Why do blind people hate skydiving? It scares the hell out of their dogs", "When you " +
            "look really closely, all mirrors look like eyeballs", "Why wouldn't the shrimp share his" +
            " treasure? Because he was a little shellfish", "What did one hat say to the other? " +
            "You stay here. I'll go on ahead", "What did the traffic light say to the car? " +
            "Don't look! I'm about to change", "Where do you find a cow with no legs? Right" +
            " where you left it", "And the lord said unto John, \"Come forth and you will receive " +
            "eternal life\". John came fifth and won a toaster", "Parallel lines have so much in " +
            "common. It\'s a shame they\'ll never meet", "Did you hear about the italian chef that died? " +
            "He pasta way", "What\'s orange and sounds like a parrot? A carrot"};

    public static String getJoke() {
        int index = RANDOM.nextInt(mJokes.length);
        return mJokes[index];
    }

}
