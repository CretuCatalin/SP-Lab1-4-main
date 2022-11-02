import java.util.concurrent.TimeUnit;

public class Image implements Element{
    public String src;

    public Image(String src) {
        this.src = src;
        try {
            TimeUnit.SECONDS.sleep(5);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        System.out.println(this.src);
    }
}
