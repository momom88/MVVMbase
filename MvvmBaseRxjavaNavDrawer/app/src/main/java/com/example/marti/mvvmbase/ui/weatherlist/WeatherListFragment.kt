package com.example.marti.mvvmbase.ui.weatherlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marti.mvvmbase.R


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [WeatherListFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 *
 */
//TODO change package name and fragment name
class WeatherListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weather_list, container, false)
    }
}
