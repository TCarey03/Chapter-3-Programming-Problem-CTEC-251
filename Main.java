public class Main {

    public static void main(String[] args) {

        // 1. Unformatted text
        TextComponent plainText = new PlainText("Hello World!");
        System.out.println("Unformatted:");
        System.out.println(plainText.getText());

        // 2. Text with a single decorator
        TextComponent boldText = new BoldDecorator(
                new PlainText("Hello World!")
        );

        System.out.println("\nBold:");
        System.out.println(boldText.getText());

        // 3. Text with multiple decorators
        TextComponent boldItalicText = new ItalicDecorator(
                new BoldDecorator(
                        new PlainText("Hello World!")
                )
        );

        System.out.println("\nBold and Italic:");
        System.out.println(boldItalicText.getText());

        // 4. Text with all decorators
        TextComponent allDecorators = new UpperCaseDecorator(
                new ItalicDecorator(
                        new BoldDecorator(
                                new PlainText("Hello World!")
                        )
                )
        );

        System.out.println("\nAll Decorators:");
        System.out.println(allDecorators.getText());
    }
}
