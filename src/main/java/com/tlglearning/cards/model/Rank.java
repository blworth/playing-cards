package com.tlglearning.cards.model;

public enum Rank {

  ACE("A"),
  TWO("2"),
  THREE("3"),
  FOUR("4"),
  FIVE("5"),
  SIX("6"),
  SEVEN("7"),
  EIGHT("8"),
  NINE("9"),
  TEN("10"),
  JACK("J"),
  QUEEN("Q"),
  KING("K");

private final String symbol;

  Rank(String symbol) {
    this.symbol = symbol;
  }

  public String getSymbol() {
    return symbol;
  }
}




//  ACE('\u0041'),
//  TWO('\u0032'),
//  THREE('\u0033'),
//  FOUR('\u0034'),
//  FIVE('\u0035'),
//  SIX('\u0036'),
//  SEVEN('\u0037'),
//  EIGHT('\u0038'),
//  NINE('\u0039'),
//  TEN('\u0031'),
//  JACK('\u004A'),
//  QUEEN('\u0051'),
//  KING('\u004B');