package advance.android.samplelibrary.custom_view;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import advance.android.samplelibrary.utils.LibMethods;

public class TextViewLib extends AppCompatTextView {
    public TextViewLib(Context context) {
        super(context);

        this.setTypeface(LibMethods.setTypeface(context));


    }

    public TextViewLib(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.setTypeface(LibMethods.setTypeface(context));


    }

}
