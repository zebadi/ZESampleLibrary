package advance.android.samplelibrary.custom_view;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.bumptech.glide.Glide;

public class ImageViewLib extends AppCompatImageView {

    Context mContext;

    public ImageViewLib(Context context) {
        super(context);

        mContext = context;
    }

    public ImageViewLib(Context context, AttributeSet attrs) {
        super(context, attrs);

        mContext = context;
    }

    public void load(String url) {

        Glide.with(mContext).load(url).into(this);
    }
}