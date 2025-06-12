package game;

public class HangmanDrawer {
    public void draw(int mistakes) {
        switch (mistakes) {
            case 0 -> System.out.println("""
                          _______
                         |/
                         |
                         |
                         |
                         |
                      ___|___
                    """);
            case 1 -> System.out.println("""
                          _______
                         |/      |
                         |
                         |
                         |
                         |
                      ___|___
                    """);
            case 2 -> System.out.println("""
                          _______
                         |/      |
                         |      ( )
                         |
                         |
                         |
                      ___|___
                    """);
            case 3 -> System.out.println("""
                          _______
                         |/      |
                         |      ( )
                         |       |
                         |
                         |
                      ___|___
                    """);
            case 4 -> System.out.println("""
                          _______
                         |/      |
                         |      ( )
                         |      /|
                         |
                         |
                      ___|___
                    """);
            case 5 -> System.out.println("""
                          _______
                         |/      |
                         |      ( )
                         |      /|\\
                         |
                         |
                      ___|___
                    """);
            case 6 -> System.out.println("""
                          _______
                         |/      |
                         |      ( )
                         |      /|\\
                         |      / 
                         |
                      ___|___
                    """);
            case 7 -> System.out.println("""
                          _______
                         |/      |
                         |      ( )
                         |      /|\\
                         |      / \\
                         |
                      ___|___
                    """);
        }
    }
}
