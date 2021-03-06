package com.hcl.example5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> nameSet = new HashSet<String>();
		int no = 1;
		String choice;
		while (true) {
			System.out.println("Enter the username " + no);
			String s = br.readLine();
			nameSet.add(s);
			no++;
			System.out.println("Do you want to continue (y/n)");
			choice = br.readLine();
			if (choice.equals("y"))
				continue;
			else if (choice.equals("n"))
				break;

		}
		for (String ss : nameSet)
			System.out.println(ss);
		System.out.println("The no of unique names are "+nameSet.size());
	}

}
