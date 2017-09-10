package piseth.html;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by user on 8/4/2017.
 */

public class Page3 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page3);
        WebView wv = (WebView)findViewById(R.id.mywebview);
        wv.loadUrl("file:///android_asset/page3.html");
    }
}
