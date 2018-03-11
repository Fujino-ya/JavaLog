package jp.techacademy.youichi.satou.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("平山宣郎",40);     //名前を平山宣郎、年齢40歳で、humanのインスタンスを作る

        human.say();

        human.think();
    }
}
