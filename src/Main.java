import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Library library = new Library("Mindaugo");
        String[] articles = {"1 vieta...", "2vieta..."};
        String[] articles2= {"zaidimai yra nauja....","zaidimai padeda susidraugauti...."};
        Department department1 = new Department("Tomo");
        Department department2 = new Department("Marijos");
        Book book1 = new Book("Coding for dummies", "Timmy", 2999, "Pegasas", "Knyga apie kodavima");
        Book book2 = new Book("Padekit", "Nemoku Programuoti", 2000, "Ka Daryt", "Nemoku programuoti, padekit man");
        Book book3 = new Book("Kauno Kamsciai", "Noriu miego", 1588, "Kauno Keliai", "Tragiskas kamstis kiekviena ryta");
        Magazine magazine1 = new Magazine("Geriausi Zaidimai 2025", "Tadas", 2025, "Zaidimu zurnalai", articles);
        Magazine magazine2 = new Magazine("Kas yra zaidimas", "Matas", 1975, "Lietuvos Zurnalas", articles2);

        System.out.println("Converting to LinkedList");



        library.addDepartment(department1);
        library.addDepartment(department2);

        department1.addEdition(book2);
        department1.addEdition(book1);
        department1.addEdition(book3);
        department2.addEdition(magazine1);
        department2.addEdition(magazine2);

        ///////////////////////////////////

        System.out.println("Rikiavimas");

        department1.sort();
        department2.sort();
        department1.removeEdition(book1);
        book1.GenerateDescription();
        System.out.println();

        printBooks(department1.getEditions());


        System.out.println();
        magazine1.GenerateDescription();
        PrintMagazines(department2.getEditions());
        // printArticles(magazine1);


        System.out.println();
        System.out.println("Library: " + library.getName());
        /////////////////////////////////////////////////////


    }

    public static void printBooks(List<Edition> editions) {

        for (Edition edition : editions)  {

            if (edition instanceof Book) {
                Book book = (Book) edition;
                System.out.print("Name: " + book.getName() + "  ");
                System.out.print("Author: " + book.getAuthorName() + "  ");
                System.out.print("Year of publication: " + book.getYearOfPublication() + "  ");
                System.out.print("Publishing House: " + book.getPublishingHouse() + "  ");
                System.out.println("Summary: " + book.getSummary());
                System.out.println();
            }
        }
    }

    public static void PrintMagazines(List<Edition> editions) {

            int k= 1;
        for (Edition edition : editions) {
            if (edition instanceof Magazine) {
                Magazine magazine = (Magazine) edition;
                System.out.print("Name: " + magazine.getName() + "  ");
                System.out.print("Author: " + magazine.getAuthorName() + "  ");
                System.out.print("Year of publication: " + magazine.getYearOfPublication() + "  ");
                System.out.print("Publishing House: " + magazine.getPublishingHouse() + "  ");
                String[] magazineArticles = magazine.getArticle();
                for (String article : magazineArticles) {
                    System.out.print("Article "+ k +":  "  + article + "     ");

                    k++;

                }
                System.out.println();
            }
        }
    }
}
   /* public static void printArticles(Magazine magazine) {
        String[] magazineArticles = magazine.getArticle();
        for (String article : magazineArticles) {
            System.out.println("Article: " + article);
        }
    }

    */


