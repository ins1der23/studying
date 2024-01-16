package View;

import View.Text.TextEng;
// вариант класса View с предустановленным английским интерфейсом
public class ViewClassEng extends ViewClass {

    public ViewClassEng() {
        text = new TextEng();
        text.setFields();
    }
}