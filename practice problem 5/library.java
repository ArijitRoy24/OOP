// package practice problem 5;

public class library {
    String tittle, author;
    library(String tittle, String author){
        this.tittle = tittle;
        this.author = author;
    }
    library(String tittle){
        this.tittle = tittle;
    }
    public static void main(String[] args) {
        library ll = new library("pother pachali"), oo = new library("pother pachali", "robi thakur");  
        System.out.println(ll.tittle);
        System.out.println(oo.author + ": " + ll.tittle);
    }
}
