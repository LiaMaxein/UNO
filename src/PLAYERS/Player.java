package PLAYERS;

import java.util.ArrayList;
import java.util.List;
import CARDS.Card; // brauchen wir dann eigentlich nicht, oder?

/* and the players gonna hate hate hate hate hate
- shake it off!
 */

public class Player {

    // muss es nochmal überarbeiten:
    /* es wäre wohl besser private int roundPoints = 0;
    und dann nochmal die private int totalScore = 0 // Gesamte Punkte über alle Runden */
    private String name;
    private boolean isBot = false; // standardmäßig auf false setzen, dann muss man beim Erstellen von menschlichen Spielern nichts extra machen
    private List<Card> hand; // jeder Spieler hat eigene Handkarten

    // Punkteverwaltung
    private int currentRoundPoints; // Punkte in der aktuellen Runde
    private int currentGamePoints;  // Punkte im aktuellen Spiel


    // Constructor für Standard-Spieler: kein Bot, Score = 0, leere Hand
    public Player(String name) {
        this.name = name;
        this.isBot = false; // by default
        this.hand = new ArrayList<>();
        this.currentRoundPoints = 0; // Punkte der aktuellen Runde starten bei 0
        this.currentGamePoints = 0;  // Punkte des aktuellen Spiels starten bei 0
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

    public int getCurrentRoundPoints() {
        return currentRoundPoints;
    }

    public int getCurrentGamePoints() {
        return currentGamePoints;
    }

    // ----- Methodem zum Verwalten der Karten "auf der Hand":

    // Eine Karte auf die Hand nehmen
    public void drawCard(Card card) {
        this.hand.add(card);
    }

    // Eine Karte von der Hand spielen
    public void playCard(Card card) {
        this.hand.remove(card);
    }


    // ----- Methodem zum Verwalten der Punkte
    // Punkte zur aktuellen Runde hinzufügen
    public void addPointsToRound(int points) {
        this.currentRoundPoints += points;
    }

    // Beendet die aktuelle Runde und addiert die Rundenpunkte zu den Spielpunkten
    public void endRound() {
        this.currentGamePoints += this.currentRoundPoints; // Rundenpunkte zum Spiel addieren
        this.currentRoundPoints = 0; // Rundenpunkte für die nächste Runde zurücksetzen
    }

    // Beendet das aktuelle Spiel und setzt die Spielpunkte zurück
    public void endGame() {
        // Die Spielpunkte werden nur zurückgesetzt, da kein globaler Highscore gespeichert wird
        this.currentGamePoints = 0; // Spielpunkte für das nächste Spiel zurücksetzen
        // Hinweis: Es wird kein persönlicher Highscore über alle Spiele hinweg gespeichert.
        // Dieser Wert ist nur für die Dauer des aktuellen Programmlaufs gültig.
    }


    // Zeigt den aktuellen Punktestand des Spielers an.
    // Gibt die Punkte der aktuellen Runde und die Gesamtpunkte
    // des aktuellen Spiels aus:
    public void showScore() {
        System.out.println(name + " – Rundenpunkte: " + currentRoundPoints + ", Gesamtpunkte im Spiel: " + currentGamePoints);
    }


    //Prüft ob der Spieler nur noch eine Karte auf der hand hat
    // wichtig für die UNO-Regel
    // @return true, wenn der Spieler genau eine Karte hat, sonst false.
    public boolean hasUNO() {
        return hand.size() == 1;
    }

    // Methode, um die Hand des Spielers zu überprüfen (für Debugging oder Anzeige)
    public void showHand() {
        System.out.println(getName() + "'s Hand: " + hand);
    }

}
