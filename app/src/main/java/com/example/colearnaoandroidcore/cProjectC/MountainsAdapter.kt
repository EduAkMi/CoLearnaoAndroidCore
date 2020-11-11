package com.example.colearnaoandroidcore.cProjectC

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.colearnaoandroidcore.R
import com.example.colearnaoandroidcore.cProjectC.model.Mountain
import com.squareup.picasso.Picasso

class MountainsAdapter(private val listMountains: List<Mountain>) :
        RecyclerView.Adapter<MountainsAdapter.MountainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MountainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_single_mountain, parent, false)
        return MountainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MountainViewHolder, position: Int) {
//        Picasso.get().load(listMountains[position].image).into(holder.imageView)
        Glide.with(holder.itemView.context).load(listMountains[position].image).into(holder.imageView)
        holder.txtName.text = listMountains[position].name
        holder.txtLocation.text = listMountains[position].location
        holder.txtHeight.text = listMountains[position].height

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Você tocou na montanha: ${listMountains[position].name}", Toast.LENGTH_SHORT).show()
            ActivityProjectC.fm.beginTransaction().replace(R.id.fragmentContainerC, FragmentCSecondary(), null)
                    .addToBackStack(null).commit()
        }
    }

    override fun getItemCount(): Int {
        return listMountains.size
    }

    class MountainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imgRecyclerSingleMountain)
        val txtName: TextView = itemView.findViewById(R.id.txtRecyclerSingleMountainName)
        val txtLocation: TextView = itemView.findViewById(R.id.txtRecyclerSingleMountainLocation)
        val txtHeight: TextView = itemView.findViewById(R.id.txtRecyclerSingleMountainHeight)
    }
}