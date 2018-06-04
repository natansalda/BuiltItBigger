package pl.nataliana.lib100;

public class JokeTellingClass {

    private String[] jokes = {"Can a kangaroo jump higher than a house? \n" +
            "\n - Of course, a house does not jump at all.",
            "Anton, do you think I am a bad mother?\n" +
                    "\n" +
                    "My name is Paul.",
            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away."};

    int rand = (int) (Math.random() * jokes.length);

    public String getJoke() {
        return jokes[rand];
    }
}
