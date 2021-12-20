public class BookValidation {

    public Book isBookCorrectly(Book book) {

        isWordOk(book.getTitle());
        isWordOk(book.getAuthor());

        return new Book(book.getId(), isWordOk(book.getTitle()), isWordOk(book.getAuthor()));
    }

    public String isWordOk(String word) {
        String wordCorrectly = word.trim();
        return wordCorrectly.substring(0, 1).toUpperCase() + wordCorrectly.substring(1);
    }

}
