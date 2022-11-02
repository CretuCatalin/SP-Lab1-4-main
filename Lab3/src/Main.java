public class Main {
    public static void main(String[] args) {
        Book b = new Book("Book1");
        Author a = new Author("Cineva1");
        b.addAuthor(a);

        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Capitolul 1.1.1.1");

        b.addContent(new Paragraph("Moto capitol"));
        b.addContent(cap1);

        cap1.add(new Paragraph("Text from subchapter 1.1"));
        cap11.add(cap111);
        cap111.add(new Paragraph(("Text from subchapter 1.1.1")));
        cap111.add(cap1111);
        cap1111.add(new Image("Image subchapter 1.1.1.1"));
        b.print();

    }
}