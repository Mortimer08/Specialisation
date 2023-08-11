package mvp;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(View view, Model model) {
        view.setPresenter(this);
    }
}
