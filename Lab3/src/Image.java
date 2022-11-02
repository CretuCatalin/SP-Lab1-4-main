public class Image implements Element{
    public String src;

    public Image(String src) {
        this.src = src;
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
        System.out.println(this.src.toString());
    }
}
