package com.objectorientedprograms;

import java.util.Random;

public interface DeckOfCardServices {
	public void start();

	public void addPlayers();

	public void allocatecards(Player player);

	void dequeuePlayers();
	void printPlayerCards(Player player);

	public void allotOneCard(int noOfPlayers);
}
