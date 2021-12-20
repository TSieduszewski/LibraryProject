public class BookValidation {

    public Book isBookCorrectly(Book book) {

        String titleTrim = book.getTitle().trim();
        String firstTitleLetterToUpperCase = titleTrim.substring(0, 1).toUpperCase() + titleTrim.substring(1);
        book.setTitle(firstTitleLetterToUpperCase);

        String authorTrim = book.getAuthor().trim();
        String firstAuthorLetterToUpperCase = authorTrim.substring(0, 1).toUpperCase() + authorTrim.substring(1);
        book.setAuthor(firstAuthorLetterToUpperCase);

        return new Book(book.getId(), book.getTitle(), book.getAuthor());
    }
}
