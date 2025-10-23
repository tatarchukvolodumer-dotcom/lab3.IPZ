package work3.gui;

/**
 * QtRenderer — приклад конкретної реалізації GUIRenderer для бібліотеки Qt.
 * Тут реалізація — заглушка, в реалі вона викликала б API Qt.
 *
 * Учасник шаблону: ConcreteImplementor.
 */
public class QtRenderer implements GUIRenderer {

    @Override
    public void render(String type, String text, int x, int y, int width, int height) {
        // Заглушка.
        System.out.println("[Qt] render " + type
                + " text=\"" + text + "\""
                + " x=" + x + " y=" + y
                + " w=" + width + " h=" + height);
    }
}
