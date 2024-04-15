package jp.techacademy.otowa.kimura.kotling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //インスタンス2つ作成
        val human1 = Human("Aoi",20,"reading")
        val human2 = Human("Haru",23,"cooking")

        //sayとthinkでメソッド呼び出し
        human1.say()
        human1.think()

        human2.say()
        human2.think()

    }
}
