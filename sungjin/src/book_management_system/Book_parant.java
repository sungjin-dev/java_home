package book_management_system;

class Book_parant<K,V> {
    private K id;
    private V book;

    public K getId() {return this.id;} 
    public V getBook() {return this.book;} 

    public void setId() { this.id = id;}
    public void setBook() { this.book = book;}




   

    // public <Book> displayAll(String id) {
        
    // }

    // public List<Book> findAll() {
    //     return new ArrayList<>(books.values());
    // }
}
