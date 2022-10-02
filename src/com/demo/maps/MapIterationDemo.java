package com.demo.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Set;

class MapIterationDemo {

    public static void main(String[] args) {
        Map<Novel, Writer> bookAuthorMap = new HashMap<>();
        Novel novel1 = new Novel(1, "Harry Potter and the Philosopher's Stone");
        Novel novel2 = new Novel(2, "A Game of Thrones");
        Novel novel3 = new Novel(3, "A Clash of Kings");

        Writer writer1 = new Writer(1, "J K Rowling");
        Writer writer2 = new Writer(2, "George R R Martin");

        bookAuthorMap.put(novel1, writer1);
        bookAuthorMap.put(novel2, writer2);
        bookAuthorMap.put(novel3, writer2);

        //Iterating over value column of the Map using map.values()
        Collection<Writer> authorsList = bookAuthorMap.values();
        System.out.println("The different authors are: ");
        for (Writer writer : authorsList) {
            System.out.println(writer.authorName);
        }
        System.out.println();

        //Iterating over key column of the Map using map.keySet()
        Set<Novel> booksSet = bookAuthorMap.keySet();
        System.out.println("The different books with their respective authors are (using KeySet):");
        for (Novel novel : booksSet) {
            Writer writer = bookAuthorMap.get(novel);
            System.out.println(novel.getBookName()+": "+ writer.authorName);
        }
        System.out.println();

        //Iterating over key and value of the Map using Set<Entry>
        Set<Map.Entry<Novel, Writer>> bookAuthorEntries = bookAuthorMap.entrySet();
        System.out.println("The different books with their respective authors are (using EntrySet):");
        for (Map.Entry<Novel, Writer> bookAuthorEntry : bookAuthorEntries) {
            Novel novel = bookAuthorEntry.getKey();
            Writer writer = bookAuthorEntry.getValue();
            System.out.println(novel.getBookName()+": "+ writer.authorName);
        }
    }
}

class Novel {
    private Integer bookId;
    private String bookName;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Novel(Integer bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }
}

class Writer {
    Integer authorId;
    String authorName;

    public Writer(Integer authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }
}
