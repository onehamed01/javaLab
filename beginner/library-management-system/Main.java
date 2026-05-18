class LibraryItem {
    String title;
    boolean isBarrowed;

    LibraryItem(String title){
        this.title = title;
        this.isBarrowed = false;
    }
    void barrowedItem(){
        System.out.println("Barrowed Item");
    }
    void returnItem(){
        System.out.println("Returned Item");
    }

}

class Books extends LibraryItem{
    String author;

    Books(String author, String title){
        super(title);
        this.author = author;
    }
}
public class Main{
    public static void main(String[] args){
        LibraryItem atomicHabbit = new LibraryItem("Atomic Habbit");
        String atomicHabbit.author = "James Clear";
    }
}