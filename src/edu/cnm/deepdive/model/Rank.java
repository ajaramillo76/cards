package edu.cnm.deepdive.model;

import edu.cnm.deepdive.model.Suit.Color;

/**
 * Encapsulates the Rank of standard playing cards. The enum includes {@link #symbol()}, to return the immutable symbol and {@link Rank} enum instance of any suit.
 */

public enum Rank {
  ACE,
  TWO,
  THREE,
  FOUR,
  FIVE,
  SIX,
  SEVEN,
  EIGHT,
  NINE,
  TEN,
  JACK,
  QUEEN,
  KING;


  private static final String[] symbols = {
      "A",
      "2",
      "3",
      "4",
      "5",
      "6",
      "7",
      "8",
      "9",
      "10",
      "J",
      "Q",
      "K"
  };

  /**
   * Returns {@Link String} instance value for this symbol.
   *
   * @return {@Link String} symbol.
   */

  public String symbol() {
    return symbols[ordinal()];
  }
}
