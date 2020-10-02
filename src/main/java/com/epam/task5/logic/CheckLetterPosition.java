package com.epam.task5.logic;

import java.util.List;

public class CheckLetterPosition {
    public boolean checkPosition(String word, int position) {
        boolean flag = true;
        if (position > word.length()) {
            flag = false;
        }
        return flag;
    }
}
