public class Book implements Comparable<Book>{

    String name;
    int page;
    String author;
    int releaseYear;

    public Book(String name, int page, String author, int releaseYear) {
        this.name = name;
        this.page = page;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public int compareTo(Book bk) {

        return this.getName().compareTo(bk.getName());
    }
}
