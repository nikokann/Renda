package com.github.nikokann.renda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.nikokann.renda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //バインディングクラスの変数
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        //タップを数える変数を準備する
        var tapCount: Int = 0

        binding.tapBottun.setOnClickListener {
            //タップを数える変数にプラス１する
            tapCount = tapCount + 1

            //タップされた回数をテキストビューに表示
            binding.countText.text = tapCount.toString()
        }
    }
}