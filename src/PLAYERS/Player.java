package PLAYERS;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack; // we need Stack for the Deck
import CARDS.Card; // brauchen wir dann eigentlich nicht, oder?

/* and the players gonna hate hate hate hate hate
- shake it off!
 */

public class Player {

    private String name;
    private boolean isBot = false; // standardmäßig auf false setzen, dann muss man beim Erstellen von menschlichen Spielern nichts extra machen
    private List<Card> hand; // jeder Spieler hat eigene Handkarten
    private int score = 0; // zum mitracken der Punkte

    // Constructor für Standard-Spieler: kein Bot, Score = 0, leere Hand
    public Player(String name) {
        this.name = name;
        this.isBot = false; // by default
        this.score = 0;     // by default
        this.hand = new ArrayList<>();
    }

    // Constructor für Bot-Spieler
    public Player(String name, boolean isBot) {
        this.name = name;
        this.isBot = true;
        this.score = 0;
        this.hand = new ArrayList<>();
    }

    // Constructor für einen Spieler mit Punktestand aus der Datenbanke oder oder
    public Player(String name, boolean isBot, int score) {
        this.name = name;
        this.isBot = false;
        this.score = score;
        this.hand = new ArrayList<>();
    }

    // Getter
    public String getName() {
        return name;
    }

    public boolean isBot() {
        return isBot;
    }

    public List<Card> getHand() {
        return hand;
    }

    public int getScore() {
        return score;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setBot(boolean bot) {
        isBot = bot;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Methode: erhöht den Punktestand um die übergebene Punktzahl
    public void addPoints(int points) {
        this.score += points;
    }

    // Methode: Spieler zieht eine Karte vom Nachziehstapel
    public void drawCard(Card card) {
        hand.add(card);
    }

    // Methode: entfernt eine Karte aus der Hand & legt diese auf den Ablagestapel
    public void playCard(Card card) {
        hand.remove(card);
    }

    // Methode: prüft ob der Spieler nur noch eine Karte hat
    // vllt. ist das falsch hier, ich weiß es gerade nicht
    public boolean hasUNO() {
        return hand.size() == 1;
    }
}
