package com.example.aplikasisederhanadicoding

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), CityAdapter.OnItemClickListener {
    private lateinit var recyclerView: RecyclerView
    private lateinit var cityList: ArrayList<City>
    private lateinit var cityAdapter: CityAdapter
    private lateinit var imageProfile: ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.green_android)
            window.navigationBarColor = ContextCompat.getColor(this, R.color.white)
            window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR)
        }

        // Initialize cityList
        cityList = getCity()

        // Initialize recyclerView
        recyclerView = findViewById(R.id.recycleView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Initialize cityAdapter
        cityAdapter = CityAdapter(cityList, this)
        recyclerView.adapter = cityAdapter

        // Initialize imageProfile
        imageProfile = findViewById(R.id.img_profile)
        imageProfile.setOnClickListener {
            goToAboutPage()
        }

    }

    // Function to initialize cityList
    private fun getCity(): ArrayList<City> {
        val cities = ArrayList<City>()
        cities.add(City(R.drawable.ic_city_0, "Ubud", "Bali, Indonesia"))
        cities.add(City(R.drawable.ic_city_1, "Yogyakarta", "Daerah Istimewa Yogyakarta, Indonesia"))
        cities.add(City(R.drawable.ic_city_2, "Solo", "Jawa Tengah, Indonesia"))
        cities.add(City(R.drawable.ic_city_3, "Bandung", "Jawa Barat, Indonesia"))
        cities.add(City(R.drawable.ic_city_4, "Malang", "Jawa Timur, Indonesia"))
        cities.add(City(R.drawable.ic_city_5, "Padang", "Sumatera Barat, Indonesia"))
        cities.add(City(R.drawable.ic_city_6, "Manado", "Sulawesi Utara, Indonesia"))
        cities.add(City(R.drawable.ic_city_7, "Bogor", "Jawa Barat, Indonesia"))
        cities.add(City(R.drawable.ic_city_8, "Surabaya", "Jawa Timur, Indonesia"))
        cities.add(City(R.drawable.ic_city_9, "Palembang", "Sumatera Selatan, Indonesia"))

        return cities
    }

    override fun onItemClick(position: Int) {
        val city = cityList[position]
        val intent = Intent(this, DetailedCity::class.java)
        intent.putExtra("city", city)
        intent.putExtra("index", position)
        startActivityForResult(intent, REQUEST_CODE_DETAILED_CITY)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE_DETAILED_CITY && resultCode == RESULT_OK) {
            val index = data?.getIntExtra("index", -1)
            val cityName = data?.getStringExtra("cityName")
            val cityDescription = data?.getStringExtra("cityDescription")

            // Handle the data accordingly
            // For example, you can update the city in the cityList and notify the adapter
            if (index != null && index >= 0 && index < cityList.size && cityName != null && cityDescription != null) {
                cityList[index] = City(cityList[index].image, cityName, cityDescription)
                cityAdapter.notifyItemChanged(index)
            }
        }
    }

    private fun goToAboutPage() {
        val intent = Intent(this, About::class.java)
        startActivity(intent)
    }

    companion object {
        const val REQUEST_CODE_DETAILED_CITY = 100
    }
}