public class book {
      String name ;
      String author ;
      int price ;
      int num_pages ;
      public book(){
        this.name = "sample" ;
        this.author = "sample" ;
        this.price = 999 ;
        this.num_pages = 999;
      }
      public static void getDetails(book b){
        System.out.println(b.name + "," + b.author + "," + b.price + "," + b.num_pages);
      }
      public static void setDetails(book b ,String name, String author , int price , int num_pages ){
        b.name = name;
        b.author = author;
        b.price = price;
        b.num_pages = num_pages;
      }
      public static void main(String[] args) {
        book b = new book() ;
        getDetails(b) ;
      }
}
