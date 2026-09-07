public abstract class TextDecorator implements TextComponent {

    protected TextComponent component;

    public TextDecorator(TextComponent component) {
        this.component = component;
    }

    @Override
    public abstract String getText();
}
