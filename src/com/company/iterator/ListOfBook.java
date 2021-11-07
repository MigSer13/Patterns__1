package com.company.iterator;

public class ListOfBook implements Collection{
    String[] arrayBooks;

    public ListOfBook(String[] arrayBooks) {
        this.arrayBooks = arrayBooks;
    }

    @Override
    public Iterator getIterator() {
        return new ListIterator();
    }

    class ListIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            return index < arrayBooks.length ? true : false;
        }

        @Override
        public Object next() {
            if(hasNext()){
                return arrayBooks[index++];
            }
            return null;
        }
    }
}
