package PLAYERS;

import CARDS.Card;

import java.util.List;
import java.util.Stack;

public class BotPlayer extends Player {

    public BotPlayer(String name) {
        super(name, true); // true bedeutet: ist ein Bot
    }
}
/* Ab hier auskommentiert, da erst andere Spiel-Inhalte erstellt werden müssen */
    // Methode: erste spielbare Karte wählen
//    public Card chooseCardToPlay(Card topCard) {
//        for (Card card : getHand()) {
//            if (card.canBePlayedOn(topCard)) { // solllten wir so eine Methode machen, ja, oder?
//                return card;
//            }
//        }
//        return null; // Bot kann keine Karte spielen, muss ziehen
//    }
//
//    // Methode für das Ausspielen einer Karte, wenn möglich
//    public void playTurn(Card topCard, Stack<Card> drawPile, List<Card> discardPile) {
//        Card chosen = chooseCardToPlay(topCard);
//        if (chosen != null) {
//            playCard(chosen);
//            discardPile.add(chosen);
//            System.out.println(getName() + " spielt: " + chosen);
//        } else {
//            // Ziehen, wenn keine spielbare Karte da ist
//            if (!drawPile.isEmpty()) {
//                Card drawn = drawPile.pop();
//                System.out.println(getName() + " zieht eine Karte.");
//                drawCard(drawn);
//                if (drawn.canBePlayedOn(topCard)) {
//                    playCard(drawn);
//                    discardPile.add(drawn);
//                    System.out.println(getName() + " spielt direkt die gezogene Karte: " + drawn);
//                }
//            }
//        }
//    }
//}
