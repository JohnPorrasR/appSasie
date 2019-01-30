package johnporrasr.com.sasie

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var viewPager:ViewPager? = null
    var tabLayout:TabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabs)

        configurarViewPager()
        tabLayout?.setupWithViewPager(viewPager)

        configurarIconos()

    }

    fun configurarIconos(){
        tabLayout?.getTabAt(0)!!.setIcon(R.drawable.icon01)
        tabLayout?.getTabAt(1)!!.setIcon(R.drawable.icon02)
        tabLayout?.getTabAt(2)!!.setIcon(R.drawable.icon03)
    }

    fun configurarViewPager(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(Fragmento01(), "Fragmento 01")
        adapter.addFragment(Fragmento01(), "Fragmento 02")
        adapter.addFragment(Fragmento01(), "Fragmento 03")

        viewPager?.adapter = adapter
    }

}
