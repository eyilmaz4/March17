package march17Codes;

public class Library_Test {
    public static void main(String[] args) {
        Library myLibrary= new Library("OCA preparation", "OCA team", "094575", 256, true,"03/01/2020","03/21/2020"  );
        System.out.println(myLibrary.isAvailability());
        System.out.println(myLibrary.getReturnDate());
        myLibrary.setNumOfPages(34);
        System.out.println(myLibrary.toString());
        System.out.println(myLibrary.newReturnDate("12/10/2020"));
       myLibrary.newBorrowDate("3/12/2020");
    }
}
