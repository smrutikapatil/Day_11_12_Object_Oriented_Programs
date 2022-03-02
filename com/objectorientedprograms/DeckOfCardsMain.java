package com.objectorientedprograms;

public class DeckOfCardsMain {
	public static void main(String[] args) {
		System.out.println("Welcome to day 11 & 12 programms");
		DeckOfCardServices deckOfCardService = new DeckOfCardsImpl();
		deckOfCardService.start();
		deckOfCardService.dequeuePlayers();
	}
}
