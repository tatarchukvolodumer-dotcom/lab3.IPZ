package work3.text;

/**
 * UppercaseDecorator — конкретний декоратор, що перетворює текст у верхній регістр.
 * Реалізація effect-частини шаблону: перетворення тексту, оновлення опису.
 *
 * Учасник шаблону: ConcreteDecorator.
 */
public class UppercaseDecorator extends BaseDecorator {

    public UppercaseDecorator(TextComponent component) {
        super(component);
    }

    @Override
    public String getText() {
        String base = component.getText();
        String transformed = base == null ? null : base.toUpperCase();
        return transformed;
    }

    @Override
    public void display() {
        // Заглушкa.
        System.out.println("UppercaseDecorator.display(): результат = \"" + getText() + "\"");
    }

    @Override
    public String getDescription() {
        return component.getDescription() + " у верхньому регістрі";
    }
}
