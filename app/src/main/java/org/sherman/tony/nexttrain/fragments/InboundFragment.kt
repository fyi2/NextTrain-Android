package org.sherman.tony.nexttrain.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import org.sherman.tony.nexttrain.R


/**
 * A simple [Fragment] subclass.
 */
class InboundFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_inbound, container, false)
    }

}// Required empty public constructor
