public class Paragraph implements Element{
    public String paragraph;
    public Paragraph(String paragraph) {
        this.paragraph = paragraph;
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public void print() {
        System.out.println(this.paragraph.toString());
    }
}
