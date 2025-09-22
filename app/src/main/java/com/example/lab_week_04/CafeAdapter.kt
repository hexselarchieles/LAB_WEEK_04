package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title,
)

class CafeAdapter(private val parentFragment: Fragment) : FragmentStateAdapter(parentFragment) {

    override fun getItemCount(): Int = TABS_FIXED.size

    override fun createFragment(position: Int): Fragment {
        // Ambil string description sesuai tab
        val content = when (position) {
            0 -> parentFragment.resources.getString(R.string.starbucks_desc)
            1 -> parentFragment.resources.getString(R.string.janjijiwa_desc)
            2 -> parentFragment.resources.getString(R.string.kopikenangan_desc)
            else -> ""
        }
        return CafeDetailFragment.newInstance(content)
    }
}
