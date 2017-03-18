/**
 * 
 */
package com.ashish.data.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.util.StringUtils;

import com.ashish.model.Book;

import au.com.bytecode.opencsv.CSVReader;

/**
 * @author ashish
 *
 */
public class BooksCsvUtil {

	private static List<Book> bookList;

	public static List<Book> getBookList() {
		if(bookList!=null){
			return bookList;
		}else{
			return initBookList();
		}
	}

	private static synchronized List<Book> initBookList() {
		if(bookList==null){
			bookList = Collections.unmodifiableList(readCSVFile());
		}
		return bookList;
	}
	
	
	private static List<Book> readCSVFile(){
		List<Book> books = new ArrayList<Book>();
		ClassLoader classLoader = BooksCsvUtil.class.getClassLoader();
		File infile = new File(classLoader.getResource("records.csv").getFile());
		try(CSVReader reader = new CSVReader(new FileReader(infile))){
			String [] arr=reader.readNext();
			while ((arr = reader.readNext()) != null) {
				books.add(csvRecToBook(arr));
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("records.csv file not found in classpath",e);
		} catch (IOException e) {
			throw new RuntimeException("Unable to read records.csv file.",e);
		}
		return books;
	}

	private static Book csvRecToBook(String[] b) {
		Book book = new Book();
		book.setRecId(b[0]);
		book.setType(b[1]);
		book.setContentType(b[2]);
		book.setIssn(b[3]);
		book.setLang(b[4]);
		book.setLocClassification(b[5]);
		book.setDeweyClassification(b[6]);
		book.setTitle(b[7]);
		book.setOtherTitle(b[8]);
		book.setCreator(b[9]);
		book.setPublisher(b[10]);
		book.setCountry(b[11]);
		book.setJournal(b[12]);
		book.setPublication(b[13]);
		book.setYear(Integer.parseInt(b[14]));
		book.setVol(Integer.parseInt(b[15]));
		book.setPartNum(b[16]);
		book.setIssue(b[17]);
		book.setSuppliment(b[18]);
		book.setSeason(b[19]);
		if(!StringUtils.hasText(b[20])){
			book.setStartPage(Integer.parseInt(b[20]));
		}
		if(!StringUtils.isEmpty(b[21])){
			book.setEndPage(Integer.parseInt(b[21]));			
		}
		book.setCitation(b[22]);
		book.setShelfmark(b[23]);
		return book;
	}
	
	public static void main(String[] args) {
		System.out.println(BooksCsvUtil.getBookList().size());
	}
}
