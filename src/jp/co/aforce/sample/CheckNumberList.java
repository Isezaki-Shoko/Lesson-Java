package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class CheckNumberList {
	public static void main(String args[]) {

		List<String> numberList = new ArrayList<>();
		int number = 8;

        boolean isLarge = number > 10;
        if (isLarge) {
            numberList.add("large");
        } else {
            numberList.add("small");
        }
        System.out.println(numberList);
    }
}