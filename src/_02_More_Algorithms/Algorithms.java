package _02_More_Algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			// System.out.println(i);
			if (eggs.get(i).equalsIgnoreCase("cracked")) {
				// System.out.println(i);

				return i;
			}
		}
		return 2;
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int pearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				pearls = pearls + 1;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double tallest = 0;

		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String largest = "";
		int large = 0;
		for(int i =0; i< words.size();i++) {
			if(words.get(i).length()> large) {
				largest = words.get(i);
				large = words.get(i).length();
			}
		}
		return largest;
	}

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		for(int i =0; i<message1.size();i++) {
			if(message1.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
	
		
		for(int y = 0; y <results.size()-1; y++) {
			for(int i =0; i < results.size()-1; i++) {
				if(results.get(i) > results.get(i+1)) {
					double temp = results.get(i);
					results.set(i, results.get(i+1));
					results.set(i+1, temp);
				}
			}
		}
		/*
		for(int i =0; i < results.size(); i++) {
			System.out.println(results.get(i));
		}
					*/
				
		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		for(int y = 0; y <unsortedSequences.size()-1; y++) {
			for(int i =0; i < unsortedSequences.size()-1; i++) {
				if(unsortedSequences.get(i).length() > unsortedSequences.get(i+1).length()) {
					String temp = unsortedSequences.get(i);
					unsortedSequences.set(i, unsortedSequences.get(i+1));
					unsortedSequences.set(i+1, temp);
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		for(int y = 0; y <words.size()-1; y++) {
			for(int i =0; i < words.size()-1; i++) {
				if(words.get(i).compareTo(words.get(i+1))>0) {
					String temp = words.get(i);
					words.set(i, words.get(i+1));
					words.set(i+1, temp);
				}
			}
		}
		return words;
	}

}
