package work3.text;

/**
 * BaseDecorator — декоратор. Реалізує базову логіку делегування
 * до вкладеного компонента. Конкретні декоратори наслідують цей клас і
 * модифікують поведінку getText/display/getDescription.
 *
 * Учасник шаблону: Decorator.
 */
public abstract class BaseDecorator implements TextComponent {
    /**
     * Вкладений компонент.
     */
    protected final TextComponent component;

    public BaseDecorator(TextComponent component) {
        this.component = component;
    }

    @Override
    public String getText() {
        // Делегуємо отримання тексту.
        return component.getText();
    }

    @Override
    public void display() {
        // Делегуємо відображення.
        component.display();
    }

    @Override
    public String getDescription() {
        // Делегуємо опис.
        return component.getDescription();
    }
}
