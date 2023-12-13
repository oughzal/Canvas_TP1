package ma.ofppt.canvastp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ma.ofppt.canvastp1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLeft.setOnClickListener {
            binding.myCanvas.cx-=30f
            binding.myCanvas.invalidate() // redessiner le canvas
        }
        binding.btnRight.setOnClickListener {
            binding.myCanvas.cx+=30f
            binding.myCanvas.invalidate() // redessiner le canvas
        }
        binding.btnTop.setOnClickListener {
            binding.myCanvas.cy-=30f
            binding.myCanvas.invalidate() // redessiner le canvas
        }
        binding.btnDown.setOnClickListener {
            binding.myCanvas.cy+=30f
            binding.myCanvas.invalidate() // redessiner le canvas
        }

    }
}