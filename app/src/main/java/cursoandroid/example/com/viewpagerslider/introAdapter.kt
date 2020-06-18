package cursoandroid.example.com.viewpagerslider

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter

class introAdapter: FragmentPagerAdapter {




    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            //2 -> ThirdFragment()
            else -> null
        }!!
    }

    override fun getCount(): Int {
        return 2
    }
}
