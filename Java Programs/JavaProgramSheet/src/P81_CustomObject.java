import java.util.ArrayList;

public class P81_CustomObject {

    private String customProperty;

    public P81_CustomObject(String property) {
        this.customProperty = property;
    }

    public String getCustomProperty() {
        return this.customProperty;
    }

    public static void main(String[] args) {

        ArrayList<Customobject> list = new ArrayList<>();
        list.add(new P81_CustomObject("Z"));
        list.add(new P81_CustomObject("A"));
        list.add(new P81_CustomObject("B"));
        list.add(new P81_CustomObject("X"));
        list.add(new P81_CustomObject("Aa"));

        list.sort((o1, o2) -> o1.getCustomProperty().compareTo(o2.getCustomProperty()));

        for (P81_CustomObject obj : list) {
            System.out.println(obj.getCustomProperty());
        }
    }
}