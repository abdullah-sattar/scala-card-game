package game

import scala.collection.mutable.ListBuffer

class CardGame (var deckOfCards : ListBuffer[Card]) {

    def getDeckOfCards: ListBuffer[Card] = deckOfCards;

    def CreateDeck: Unit = {
        val values = Array(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        val symbols = Array("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");
        val suits = Array("Hearts", "Clubs", "Diamonds", "Spades");
        for (i <- suits.indices) {
          for (j <- symbols.indices) {
            val card = new Card(symbols(j), suits(i), values(j));
            getDeckOfCards += card;
          }
        }
    }
}
