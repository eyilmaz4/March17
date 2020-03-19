package march17Codes;

public class Library {
    private String bookTitle;
    private String bookAuthor;
    private String ISBN;
    private int numOfPages;
    private boolean availability;
    private String borrowDate;
    private String returnDate;
    public Library(String bookTitle, String bookAuthor, String ISBN, int numOfPages, boolean availability, String borrowDate, String returnDate){
        this.bookTitle=bookTitle;
        this.bookAuthor=bookAuthor;
        this.ISBN=ISBN;
        this.numOfPages=numOfPages;
        this.availability=availability;
        this.borrowDate=borrowDate;
        this.returnDate=returnDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }



    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", ISBN=" + ISBN +
                ", numOfPages=" + numOfPages +
                ", availability=" + availability +
                ", borrowDate='" + borrowDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
    public void newBorrowDate(String date) {
        if (this.availability) {
            this.availability = false;
        } else {
            System.out.println("Book is not available");
        }
        String[] arr = date.split("/");
        int month = Integer.parseInt(arr[0]);
        int day = Integer.parseInt(arr[1]);
        if ((month > 0 && month < 13) && (day > 0 && day < 32)) {
            this.borrowDate = date;
            System.out.println(date);
        } else {
            System.out.println("Date is not correct");
        }
    }

    public static String [] chechDate(String date){
String []arr1=new String[3];
String word=" ";
int num=0;
for(int i=0; i<date.length(); i++){
    if (date.charAt(i)!='/'){
        word+=date.charAt(i);
        num=Integer.parseInt(word);
    }
    else{
        arr1[num]=word;
        word=" ";
        num++;
    }

}
arr1[2]=word;
return arr1;
    }

    public String newReturnDate(String date){
this.availability=true;
String [] arr=new String [3];
arr=date.split("/");
int num=Integer.parseInt(arr[0]);
int day=Integer.parseInt(arr[1]);
if(num >0 && num<13 && day<32 && day>0){
    this.returnDate=date;

}
else {
    System.out.println("date not valid");
}
  return this.returnDate;
    }

}
