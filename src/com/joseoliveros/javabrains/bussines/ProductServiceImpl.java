package com.joseoliveros.javabrains.bussines;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {

    List<String> bookList = new ArrayList<>();
    List<String> musicList = new ArrayList<>();
    List<String> movieList = new ArrayList<>();

    public ProductServiceImpl() {
        bookList.add("Libro1");
        bookList.add("Libro2");
        bookList.add("Libro3");
        
        musicList.add("musica1");
        musicList.add("musica2");
        musicList.add("musica3");
        
        movieList.add("movie1");
        movieList.add("movie2");
        movieList.add("movie3");
    }

    public List<String> getProductCategories() {
        List<String> categories = new ArrayList<>();
        categories.add("Books");
        categories.add("Music");
        categories.add("Movies");
        return categories;
    }

    public List<String> getProducts(String category) {
        switch (category.toLowerCase()) {
            case "books":
                return bookList;
            case "music":
                return musicList;
            case "movies":
                return movieList;
        }
        return null;
    }

    public boolean addProduct(String category, String product) {
        switch (category.toLowerCase()) {
            case "books":
                bookList.add(product);
                break;
            case "music":
                musicList.add(product);
                break;
            case "movies":
                movieList.add(product);
                break;
            default:
                return false;
        }
        return true;
    }
}
