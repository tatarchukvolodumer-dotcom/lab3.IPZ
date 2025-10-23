package work3.text;

/**
 * TextElementAdapter — адаптер існуючого класу TextElement до інтерфейсу TextComponent.
 * Не змінює TextElement, а делегує йому читання сирого тексту.
 *
 * Учасник шаблону: ConcreteComponent.
 */
public class TextElementAdapter implements TextComponent {
    /**
     * Існуючий об'єкт, який ми не змінюємо.
     */
    private final TextElement adaptee;

    public TextElementAdapter(TextElement adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String getText() {
        // Делегуємо отримання сирого тексту адаптованому об'єкту.
        return adaptee.getText();
    }

    @Override
    public void display() {
        // Заглушка.
        System.out.println("TextElementAdapter.display(): \"" + getText() + "\"");
    }

    @Override
    public String getDescription() {
        return "Базовий текстовий елемент";
    }
}
