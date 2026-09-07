Phase 1 Journal
Structural Setup

For Phase 1, I created the TextComponent interface, the PlainText class, and the abstract TextDecorator class.

Both PlainText and TextDecorator need to share the same TextComponent interface because the Decorator Pattern depends on treating the original object and its decorators as the same type. This allows a decorator to wrap a TextComponent without needing to know whether it is wrapping plain text or another decorator.

PlainText represents the basic text object and uses the getText() method to return its stored text.

TextDecorator uses composition because it stores a TextComponent inside of itself. In other words, the decorator "has-a" TextComponent. It also implements TextComponent, giving it an "is-a" relationship with the interface. This is important because it allows decorators to be used anywhere a TextComponent is expected.

One challenge I had was understanding why the decorator needs to implement the same interface as the object it wraps. I realized that this is what allows multiple decorators to be stacked together later. For example, a bold decorator can wrap plain text, and an italic decorator can then wrap the bold decorator.

--------------------------------------

Phase 2 Journal
Concrete Decorator Implementation

For Phase 2, I created three concrete decorators: BoldDecorator, ItalicDecorator, and UpperCaseDecorator. Each class extends TextDecorator and implements its own version of getText().

The decorators need to call the inner component's getText() method instead of storing or hardcoding the original text. This allows each decorator to work with whatever TextComponent it receives. The component could be a PlainText object or another decorator.

The decorators can also be stacked because every decorator is still a TextComponent. For example, a BoldDecorator can wrap a PlainText object, and an ItalicDecorator can then wrap the BoldDecorator.

The order of the decorators affects the result. If UpperCaseDecorator wraps BoldDecorator, the bold tags are already part of the text when the uppercase operation happens, so the tags can also become uppercase. If BoldDecorator wraps UpperCaseDecorator, the uppercase operation happens first and then the lowercase <b> tags are added afterward.

One thing I learned from this phase is that the decorator does not need to know what type of object it is wrapping. It only needs to know that the object is a TextComponent.

-----------------------------------------

Phase 3 Journal
Assembly & System Verification

For Phase 3, I created the Main class to test the Decorator Pattern. I tested plain text, a single decorator, multiple decorators, and a combination of all three decorators.

The program demonstrates the Open-Closed Principle because the existing classes do not need to be changed when adding new formatting behaviors. The TextComponent interface provides the common structure, while each decorator adds its own behavior.

If I needed to add an UnderlineDecorator tomorrow, I would only need to create a new class that extends TextDecorator. I would not need to modify PlainText, TextComponent, BoldDecorator, ItalicDecorator, or `UpperCaseDecorator.

For example, an UnderlineDecorator could add <u> tags around the result of the component it wraps. This means the system is open to adding new functionality but closed to modifying the existing classes.

The biggest thing I learned from this project is how composition allows behaviors to be combined dynamically. Instead of creating a new class for every possible combination of formatting, I can stack decorators at runtime to get the behavior I want.
