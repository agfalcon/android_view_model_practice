package kr.ac.kumoh.KGB.smart_app_w3_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import kr.ac.kumoh.KGB.smart_app_w3_02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val model : CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //옵저버 패턴
        model.getCount().observe(this, Observer{
            binding.txtCounter.text = it.toString()
        })

        binding.btnAdd.setOnClickListener {
            model.add()
//            binding.txtCounter.text = model.getCount().value.toString()
        }
        Log.i("Lifecycle","onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Lifecycle", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Lifecycle", "onResume()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Lifecycle", "onStop()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Lifecycle", "onPause()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Lifecycle", "onDestroy()")
    }
}