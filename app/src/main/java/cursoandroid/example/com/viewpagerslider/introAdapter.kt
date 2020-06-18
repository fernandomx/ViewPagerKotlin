package cursoandroid.example.com.viewpagerslider

import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class introAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {


    @NonNull
    @Override
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            //2 -> ThirdFragment()
            else -> null
        }!!
    }

    @Override
    override fun getCount(): Int {
        return 2
    }



}
