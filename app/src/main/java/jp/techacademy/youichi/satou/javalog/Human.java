package jp.techacademy.youichi.satou.javalog;

/**
 * Created by Fujino_ya on 2018/03/11.
 */
import android.util.Log;


public class Human extends Animal implements Thinkable {
    //メンバ変数
    String hobby = "日本歴史";

    // コンストラクタ
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void say(){
        Log.d("javatest", "「私の名前は" + this.name + "です。年は" + this.age + "歳です。」");
    }

    @Override
    public void think(){
        Log.d("javatest", "私は" + this.hobby + "について考える。");
    }

}