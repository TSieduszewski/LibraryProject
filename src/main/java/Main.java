public class Main {
    public static void main(String[] args) {

        //przykład sprawdzający metodę
        Book book = new Book(1L, "    pan Tadeusz", "      adam Mickiewicz");
        BookValidation bookValidation = new BookValidation();
        System.out.println(bookValidation.isBookCorrectly(book));


    }
}
