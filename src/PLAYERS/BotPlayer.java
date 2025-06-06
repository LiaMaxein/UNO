package PLAYERS;

import CARDS.Card;
import java.util.List;
import java.util.Stack;

public class BotPlayer extends Player {

    public BotPlayer(String name) {
        super(name, true); // true bedeutet: ist ein Bot
    }
}
/*
 * Die hier auskommentierten Methoden sind für die zukünftige Spiellogik des Bots vorgesehen.
 * Sie werden implementiert, wenn das Spielgerüst steht und der Bot "intelligent" werden soll.
 * Sie sind hier nur als Platzhalter und Beispiel für die Bot-Intelligenz enthalten.
 */

// Methode: Erste spielbare Karte wählen (Beispiel-Logik für den Bot)
// public Card chooseCardToPlay(Card topCard) {
//     for (Card card : getHand()) {
//         // Annahme: Card-Klasse hat eine Methode canBePlayedOn()
//         if (card.canBePlayedOn(topCard)) {
//             return card;
//         }
//     }
//     return null; // Bot kann keine Karte spielen, muss ziehen
// }

// Methode für das Ausspielen einer Karte, wenn möglich (Beispiel-Logik für den Bot)
// public void playTurn(Card topCard, Stack<Card> drawPile, List<Card> discardPile) {
//     Card chosen = chooseCardToPlay(topCard);
//     if (chosen != null) {
//         playCard(chosen); // Karte von der Hand des Bots entfernen
//         discardPile.add(chosen); // Karte zum Ablagestapel hinzufügen
//         System.out.println(getName() + " spielt: " + chosen);
//     } else {
//         // Ziehen, wenn keine spielbare Karte da ist
//         if (!drawPile.isEmpty()) {
//             Card drawn = drawPile.pop(); // Eine Karte vom Ziehstapel nehmen
//             System.out.println(getName() + " zieht eine Karte.");
//             drawCard(drawn); // Gezogene Karte zur Hand des Bots hinzufügen
//             // Prüfen, ob die gezogene Karte direkt gespielt werden kann
//             if (drawn.canBePlayedOn(topCard)) {
//                 playCard(drawn);
//                 discardPile.add(drawn);
//                 System.out.println(getName() + " spielt direkt die gezogene Karte: " + drawn);
//             }
//         }
//     }
// }

