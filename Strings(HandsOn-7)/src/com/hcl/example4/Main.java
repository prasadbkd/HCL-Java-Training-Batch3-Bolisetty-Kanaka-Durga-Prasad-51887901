package com.hcl.example4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Humpty's sentence: ");
		String str1 = br.readLine();
		System.out.println("Enter the word to replace");
		String str2 = br.readLine();
		System.out.println("synonym: ");
		String str3 = br.readLine();

		CheckStrings cs = new CheckStrings();
		// cs.concat(str1, str2);
		cs.replaceString(str1, str2, str3);
	}

}
