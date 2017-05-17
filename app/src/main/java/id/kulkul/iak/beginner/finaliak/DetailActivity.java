package id.kulkul.iak.beginner.finaliak;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by anggha on 17/05/17.
 */

public class DetailActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);

        int icon = getIntent().getExtras().getInt("icon");
        String title = getIntent().getExtras().getString("title");
        String sub = getIntent().getExtras().getString("sub");

        ((ImageView) findViewById(R.id.listImg)).setImageResource(icon);
        ((TextView) findViewById(R.id.listTitle)).setText(title);
        ((TextView) findViewById(R.id.listSub)).setText(sub);


    }
}
