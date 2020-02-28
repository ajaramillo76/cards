package edu.cnm.deepdive.model;

import java.util.LinkedList;
import java.util.List;

public class Hand {

    private List<Card> cards;

  public void add() {
    cards = new LinkedList<>();
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        cards.add(new Card(s, r));
      }
    }

  }


}
