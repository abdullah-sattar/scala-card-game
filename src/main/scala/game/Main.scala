package game

import scala.collection.mutable.ListBuffer

object Main extends App {
    val game = new CardGame(ListBuffer[Card]());
    game.CreateDeck;
    println(game.getDeckOfCards)
}
