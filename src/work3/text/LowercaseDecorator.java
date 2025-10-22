package work3.text;

/**
 * LowercaseDecorator — конкретний декоратор, що перетворює текст у нижній регістр.
 *
 * Учасник шаблону: ConcreteDecorator.
 */
public class LowercaseDecorator extends BaseDecorator {

    public LowercaseDecorator(TextComponent component) {
        super(component);
    }

    @Override
    public String getText() {
        String base = component.getText();
        String transformed = base == null ? null : base.toLowerCase();
        return transformed;
    }

    @Override
    public void display() {
        System.out.println("LowercaseDecorator.display(): результат = \"" + getText() + "\"");
    }

    @Override
    public String getDescription() {
        return component.getDescription() + " у нижньому регістрі";
    }
}
