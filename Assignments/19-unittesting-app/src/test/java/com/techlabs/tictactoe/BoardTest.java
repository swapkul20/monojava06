package com.techlabs.tictactoe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {
	
	Board board;
	
	@BeforeEach
	void init()
	{
		 board=new Board();
		
	}

	@Test
	void testIsBoardFull() {
		
		for(int i=0;i<9;i++)
		{
			board.setCellMark(i, MarkType.X);
		}
		
		assertTrue(board.isBoardFull());
		
	}
	
	@Test
	void testInvalidCellException()
	{
	  assertThrows(NullPointerException.class, ()->board.setCellMark(10, MarkType.O));
		
	}
	
	@Test
	void testSetCellMark()
	{
		board.setCellMark(5, MarkType.X);
		
		Cell cells[]=board.getCells();
		
	    assertEquals(MarkType.X,cells[5].getMark());
	}



}
