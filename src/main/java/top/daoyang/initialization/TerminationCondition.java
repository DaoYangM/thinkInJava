package top.daoyang.initialization;

class Book {
    boolean checkedOut = false;
    Book(boolean checkOut) {
        this.checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (checkedOut)
            System.out.println("Error: checked out");
    }
}

public class TerminationCondition {
    public static void main(String[] args) {
        Book book = new Book(true);
        book.checkIn();

        new Book(true);
        System.gc();
    }
}