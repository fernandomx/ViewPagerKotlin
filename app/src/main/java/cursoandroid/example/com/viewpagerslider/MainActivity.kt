package cursoandroid.example.com.viewpagerslider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //var viewPager: ViewPager? = null
    private lateinit var viewPager: ViewPager

    private lateinit var pagerAdapter: introAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)

        //val adapter = introAdapter(supportFragmentManager)
        //viewPager!!.setAdapter(adapter)


        val adapter = introAdapter(getSupportFragmentManager())


        //pagerAdapter = introAdapter(supportFragmentManager)
        viewPager!!.adapter = adapter



    }
}