package work3.text;

/**
 * BaseDecorator — абстрактний декоратор. Реалізує базову логіку делегування
 * до вкладеного компонента. Конкретні декоратори наслідують цей клас і
 * модифікують поведінку getText/display/getDescription.
 *
 * Учасник шаблону: Decorator (абстрактний).
 */
public abstract class BaseDecorator implements TextComponent {
    /**
     * Вкладений компонент (може бути адаптером або іншим декоратором).
     */
    protected final TextComponent component;

    public BaseDecorator(TextComponent component) {
        this.component = component;
    }

    @Override
    public String getText() {
        // За замовчуванням делегуємо отримання тексту.
        return component.getText();
    }

    @Override
    public void display() {
        // За замовчуванням делегуємо відображення.
        component.display();
    }

    @Override
    public String getDescription() {
        // За замовчуванням делегуємо опис.
        return component.getDescription();
    }
}
