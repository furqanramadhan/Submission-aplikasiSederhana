package com.example.aplikasisederhanadicoding

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CityAdapter(private val cityList: ArrayList<City>, private val itemClickListener: OnItemClickListener) :
    RecyclerView.Adapter<CityAdapter.CityViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    inner class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cityImageView: ImageView = itemView.findViewById(R.id.cityImage)
        val cityTextView: TextView = itemView.findViewById(R.id.cityName)
        val cityLocationView: TextView = itemView.findViewById(R.id.cityLocation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.city_itemize, parent, false)
        return CityViewHolder(view)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        val city = cityList[position]
        holder.cityImageView.setImageResource(city.image)
        holder.cityTextView.text = city.name
        holder.cityLocationView.text = city.location

        holder.itemView.setOnClickListener {
            itemClickListener.onItemClick(position)
        }
    }

    override fun getItemCount(): Int {
        return cityList.size
    }
}
