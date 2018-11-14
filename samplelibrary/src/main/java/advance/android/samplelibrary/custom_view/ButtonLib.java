package advance.android.samplelibrary.custom_view;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import advance.android.samplelibrary.utils.LibMethods;

public class ButtonLib extends AppCompatButton {
    public ButtonLib(Context context) {
        super(context);
        this.setTypeface(LibMethods.setTypeface(context));

    }

    public ButtonLib(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(LibMethods.setTypeface(context));

    }

}
