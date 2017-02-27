/**
 * 
 */
package com.ashish.test.csv.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author ashish
 *
 */
public class FileSlicer {
	
	public static final long MAX_REC_SIZE = 1000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Get file from resources folder
		ClassLoader classLoader = FileSlicer.class.getClassLoader();
		File infile = new File(classLoader.getResource("records.csv").getFile());
		//File infile = new File("");
		String outFileName = infile.getParentFile().getAbsolutePath()+File.separator+"splicedRec.csv";
		File outFile = new File(outFileName);
		System.out.println("Source file::"+infile.getAbsolutePath());
		System.out.println("Destination file::"+outFile.getAbsolutePath());
		try(FileReader ir = new FileReader(infile);
		FileWriter fw = new FileWriter(outFile); BufferedReader br = new BufferedReader(ir)){
			String line="";
			long counter=0;
			while(((line=br.readLine())!=null)&&MAX_REC_SIZE>=counter){
				counter++;
				fw.write(line+"\n");
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
