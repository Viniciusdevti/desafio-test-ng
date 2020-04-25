package com.vinicius.teste;

import org.testng.annotations.Test;

import com.vinicius.page.PageToMove;

public class GuruToMoveTest {


    @Test
    public void ToMove() throws Exception {
    	 new PageToMove()
         .openPage(PageToMove.class, "http://demo.guru99.com/test/drag_drop.html")
         .ToMove();
                
    }
}