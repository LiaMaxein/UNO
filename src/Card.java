public class Card {

    enum Color { RED, BLUE, GREEN, YELLOW, WILD }
    enum Type { NUMBER, SKIP, REVERSE, DRAW_TWO, WILD, WILD_DRAW_FOUR }

    private Color color;
    private Type type;
    private int number; // Only used if type is NUMBER

    // Constructor, getters, toString() etc.


}
