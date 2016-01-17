package sample.kotlin.bool

import main.java.JavaBooleanSample

/**
 * Created by yy_yank on 2016/01/17.
 */
class KotlinBooleanSample {

    var hoge  = true
    var isFuga = true
}


fun main(args : Array<String>) {
    val sample = JavaBooleanSample()
    // setterアクセス
    sample.isHoge = false
    // getterアクセス
    sample.isHoge

    // setterアクセス
    sample.fuga = true
    // getterアクセス
    sample.fuga
}
