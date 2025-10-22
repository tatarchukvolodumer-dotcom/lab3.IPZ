package work3.gui;

/**
 * Checkbox — конкретна абстракція для чекбоксу.
 */
public class Checkbox extends GUIElement {
    private boolean checked;

    public Checkbox(GUIRenderer renderer, String label, int x, int y, boolean checked) {
        super(renderer, label, x, y, 100, 20);
        this.checked = checked;
    }

    @Override
    public void draw() {
        renderer.render("CHECKBOX", text + (checked ? " [x]" : " [ ]"), x, y, width, height);
    }

    @Override
    public String getDescription() {
        return "Checkbox \"" + text + "\" checked=" + checked + " via " + renderer.getClass().getSimpleName();
    }

    public void toggle() {
        checked = !checked;
        System.out.println("Checkbox.toggle(): новий стан = " + checked);
    }
}
