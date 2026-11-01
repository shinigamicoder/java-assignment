interface Game {

    int MAX_PLAYERS = 11;

    default void displayGame(String gameName) {
        System.out.println("Game: " + gameName +
                ", Max Players: " + MAX_PLAYERS);
    }
}

class Cricket implements Game {
}

class Football implements Game {
}

public class Main {
    public static void main(String[] args) {

        Cricket cricket = new Cricket();
        Football football = new Football();

        cricket.displayGame("Cricket");
        football.displayGame("Football");
    }
}