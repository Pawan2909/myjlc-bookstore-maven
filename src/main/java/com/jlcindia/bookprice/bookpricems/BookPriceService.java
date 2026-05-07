package com.jlcindia.bookprice.bookpricems;

public interface BookPriceService {
    public BookPrice getBookPriceById(Integer bookId);
    public double getOfferedPriceById(Integer bookId);
}