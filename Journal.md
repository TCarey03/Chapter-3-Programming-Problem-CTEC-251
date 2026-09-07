Phase 1 Journal
Structural Setup

For Phase 1, I created the TextComponent interface, the PlainText class, and the abstract TextDecorator class.

Both PlainText and TextDecorator need to share the same TextComponent interface because the Decorator Pattern depends on treating the original object and its decorators as the same type. This allows a decorator to wrap a TextComponent without needing to know whether it is wrapping plain text or another decorator.

PlainText represents the basic text object and uses the getText() method to return its stored text.

TextDecorator uses composition because it stores a TextComponent inside of itself. In other words, the decorator "has-a" TextComponent. It also implements TextComponent, giving it an "is-a" relationship with the interface. This is important because it allows decorators to be used anywhere a TextComponent is expected.

One challenge I had was understanding why the decorator needs to implement the same interface as the object it wraps. I realized that this is what allows multiple decorators to be stacked together later. For example, a bold decorator can wrap plain text, and an italic decorator can then wrap the bold decorator.
