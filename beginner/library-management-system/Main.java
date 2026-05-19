class LibraryItem{
    private String title;
    private boolean borrowedStatus;

    LibraryItem(String title){
        this.title = title;
        this.borrowedStatus = false;
    }
    void borrowItem(){

        String title = this.title;

        if (!this.borrowedStatus){
            this.borrowedStatus = true;
            System.out.println(title + " has been borrowed.");
        }
        else{
            System.out.println(title + " is already borrowed.");
        }
    }
    void returnItem(){
        if (this.borrowedStatus){
            this.borrowedStatus = false;
            System.out.println(title + " has been returned. Thank you.");
        }
        else{
            System.out.println(title + " has already returned.");
        }
    }
    void showInfo(){
        System.out.println("Books Name: "+ this.title);
        if (!this.borrowedStatus){
            System.out.println("Book is available");
        }
        else{
            System.out.println("Book is Not available");
        }
    }   
}

class Book extends LibraryItem{
    String author;

    Book (String author, String title){
        super(title);
        this.author = author;
    }
    void showInfo(){
        super.showInfo();
        System.out.println("Author name: "+this.author);
    }

}

class Main{
    public static void main(String[] args){
        Book atomichabbit = new Book("James clear", "Atomic Habbit.");
        atomichabbit.showInfo();
        atomichabbit.borrowItem();
        atomichabbit.borrowItem();
        atomichabbit.showInfo();
        atomichabbit.returnItem();
        atomichabbit.returnItem();

    }
}