package com.epam.Lokesh.tdd_junit;

import java.util.ArrayList;

public class RemoveCharacterAFromString {

	public String removeCharacterA(String inputString) {
		int len = inputString.length();
		String resultantString = "";
		ArrayList<Integer> indexesOfCharacterA = new ArrayList<Integer>();
		indexesOfCharacterA.add(0);
		for (int i = 0; i < len; i++) {
			if (inputString.charAt(i) == 'A') {
				indexesOfCharacterA.add(i);
			}
		}
		indexesOfCharacterA.add(len);
		int indexesSize = indexesOfCharacterA.size();
		if (indexesSize == 2) {
			return inputString;
		}
		for (int i = 0; i < indexesSize - 1; i++) {
			if(i == 0) {
			resultantString += inputString.subSequence(indexesOfCharacterA.get(i), indexesOfCharacterA.get(i + 1));
			}
			else {
				resultantString += inputString.subSequence(indexesOfCharacterA.get(i)+1, indexesOfCharacterA.get(i+1));
			}
		}
		return resultantString;
	}

}
