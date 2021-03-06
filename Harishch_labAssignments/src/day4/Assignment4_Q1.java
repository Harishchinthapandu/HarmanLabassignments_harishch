 package day4;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Assignment4_Q1 {

	public static void main(String[] args) {
		
		Map<String, Integer> words=new TreeMap<>();
	
		
		try(BufferedReader br = new BufferedReader(new FileReader(new File("story.txt")))){ 
			
			String line = null;
			while ((line = br.readLine()) != null) {
				String tokens[]=line.split(" ");
				for(String token: tokens) {
					
					if(words.containsKey(token)) {
						Integer freq= words.get(token);
						words.put(token, ++freq);
					}else {
						words.put(token, new Integer(1));
					}
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("file is not found");
		}

		catch (IOException ex) {
			System.out.println("some io exception");
		} catch (Exception ex) {
			System.out.println("some other problem occured");
		}
		 Set<Entry<String, Integer>> entrySet = words.entrySet();
		 for(Entry<String, Integer> entry: entrySet) {
			 System.out.println(entry.getKey() + " : "+ entry.getValue());
		 }
		
	}
}
