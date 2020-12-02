package com.harsh.dataStructure.multiArray;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.sound.midi.Soundbank;

public class DynamicArray {

	/*
	 * Complete the 'dynamicArray' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER n 2. 2D_INTEGER_ARRAY queries
	 */

	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		List<Integer>[] seqList=new List[n];
		List<Integer>result= new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			seqList[i]=new ArrayList<Integer>();
		}
		
		int lastAnswer=0;
		
		for(int i=0;i<queries.size();i++) {
			List<Integer> query =queries.get(i);
			List<Integer> sequence=seqList[(query.get(1)^lastAnswer)%n];
			
			switch (query.get(0)) {
			case 1:
				sequence.add(query.get(2));
				break;
			case 2:
				lastAnswer=sequence.get(query.get(2)%sequence.size());
				result.add(lastAnswer);
			default:
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("C:\\Users\\harsh\\Desktop\\output.txt")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int q = Integer.parseInt(firstMultipleInput[1]);

		List<List<Integer>> queries = new ArrayList<>();

		IntStream.range(0, q).forEach(i -> {
			try {
				queries.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt).collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		List<Integer> result = DynamicArray.dynamicArray(n, queries);

		//bufferedWriter.write(result.stream().map(Object::toString).collect(joining("\n")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();

	}
}
