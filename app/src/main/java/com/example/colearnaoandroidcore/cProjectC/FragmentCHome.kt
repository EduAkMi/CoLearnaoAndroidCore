package com.example.colearnaoandroidcore.cProjectC

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.colearnaoandroidcore.R
import com.example.colearnaoandroidcore.cProjectC.model.Mountain

class FragmentCHome : Fragment() {
    private var listMountains = mutableListOf<Mountain>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_c_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        populateList()

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerCHome)

        recyclerView.adapter = MountainsAdapter(listMountains)
        recyclerView.layoutManager = LinearLayoutManager(view.context)
    }

    private fun populateList() {
        listMountains.clear()
        listMountains.add(Mountain("https://www.swedishnomad.com/wp-content/images/2019/08/Mount-Everest-Facts.jpg",
            "Mount Everest", "8.848", "Nepal/China"))
        listMountains.add(Mountain("https://media-cdn.tripadvisor.com/media/photo-s/16/f5/15/54/king-of-mountain-k2-8611.jpg",
            "K2", "8.611", "Pakistan"))
        listMountains.add(Mountain("https://www.deccanherald.com/sites/dh/files/article_images/2019/05/26/800px-Kangchenjunga-from-Gangtok-1558862922.jpg",
            "Kangchenjunga", "8.586", "Nepal/India"))
        listMountains.add(Mountain("https://upload.wikimedia.org/wikipedia/commons/4/4e/LhotseMountain.jos.500pix.jpg",
            "Lhotse", "8.516", "Nepal/China"))
        listMountains.add(Mountain("https://static.educalingo.com/img/de/800/makalu.jpg",
            "Makalu", "8.485", "Nepal/China"))
        listMountains.add(Mountain("https://extreme-expedition.com/wp-content/uploads/2016/12/cho-oyu-2-e1494231116262.jpg",
            "Cho Oyu", "8.201", "Nepal/China"))
        listMountains.add(Mountain("https://mountainplanet.com/uploads/public/8c5bb51e-8e31-4311-ae7f-ef0494aab264/1789620188_1_crop_forcepi_795x483.jpg",
            "Dhaulagiri", "8.167", "Nepal"))
        listMountains.add(Mountain("https://media.tacdn.com/media/attractions-splice-spp-674x446/06/72/f0/90.jpg",
            "Manaslu", "8.163", "Nepal"))
        listMountains.add(Mountain("https://nation.com.pk/print_images/large/2018-12-11/nanga-parbat-most-appealing-point-for-mountaineers-in-pakistan-1544549180-4288.jpg",
            "Nanga Parbat", "8.126", "Pakistan"))
        listMountains.add(Mountain("https://www.liveabout.com/thmb/e8kwe1ib8TgKKgORmiVwyzUmAEE=/768x0/filters:no_upscale():max_bytes(150000):strip_icc()/GettyImages-574855961-5ad9110f642dca00369e33af.jpg",
            "Annapurna", "8.091", "Nepal"))
    }

}