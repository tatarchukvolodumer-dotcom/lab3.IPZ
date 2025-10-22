package work3.text;

/**
 * NewlineDecorator — конкретний декоратор, що додає символ нової строки
 * (за замовчуванням '\n') в кінець тексту.
 *
 * Учасник шаблону: ConcreteDecorator.
 */
public class NewlineDecorator extends BaseDecorator {

    private final String newline;

    public NewlineDecorator(TextComponent component) {
        this(component, "\n");
    }

    public NewlineDecorator(TextComponent component, String newline) {
        super(component);
        this.newline = newline == null ? "\n" : newline;
    }

    @Override
    public String getText() {
        String base = component.getText();
        if (base == null) base = "";
        return base + newline;
    }

    @Override
    public void display() {
        // Виводимо результат як заглушку.
        System.out.println("NewlineDecorator.display(): результат = \"" + getText() + "\"");
    }

    @Override
    public String getDescription() {
        return component.getDescription() + " з новою строкою в кінці";
    }
}
