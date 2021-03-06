package com.objectorientedprograms;

public class Player {
	Queue<DeckOfCards> cardsQue;
	int[][] playerCards;

	public Player() {
		cardsQue = new Queue<DeckOfCards>();
		playerCards = new int[4][13];
	}

	public void addCard(int suit, int rank) {
		playerCards[suit][rank] = 1;
	}

	public DeckOfCards getCard() {
		return cardsQue.dequeue();
	}

	public void enqueueCards() {
		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 0; rank < 13; rank++) {
				if (playerCards[suit][rank] == 1) {
					cardsQue.enqueue(new DeckOfCards(suit, rank));
				}
			}
		}
	}
}
