public class UpperCaseDecorator extends TextDecorator {

    public UpperCaseDecorator(TextComponent component) {
        super(component);
    }

    @Override
    public String getText() {
        return component.getText().toUpperCase();
    }
}
