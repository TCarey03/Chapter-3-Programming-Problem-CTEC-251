public class ItalicDecorator extends TextDecorator {

    public ItalicDecorator(TextComponent component) {
        super(component);
    }

    @Override
    public String getText() {
        return "<i>" + component.getText() + "</i>";
    }
}
