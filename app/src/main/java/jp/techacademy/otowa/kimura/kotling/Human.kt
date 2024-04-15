package jp.techacademy.otowa.kimura.kotling

import android.util.Log

class Human(name:String,age:Int,var hobby:String):Animal(name,age),Thinkable{
    //クラスの初期化
    init {
        this.name = name
        this.age = age
        this.hobby = hobby
    }

        // Animalクラスのメソッドをオーバーライド
        override fun say() {
            Log.d("kotlintest", "私の名前は" + this.name + "です。" + "年は" + this.age +"歳です。" )

        }
        //Thinkableインターフェースのメソッドをオーバーライド
        override fun think(){
            Log.d("kotlintest", "私は" + this.hobby + "について考える。" )
        }
    }