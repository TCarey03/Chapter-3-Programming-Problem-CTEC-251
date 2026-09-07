public class BoldDecorator extends TextDecorator {

    public BoldDecorator(TextComponent component) {
        super(component);
    }

    @Override
    public String getText() {
        return "<b>" + component.getText() + "</b>";
    }
}
