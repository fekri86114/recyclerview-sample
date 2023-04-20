package info.fekri.dependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import info.fekri.dependencyinjection.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = arrayListOf<NatureShow>(
            NatureShow(
                "Alaska!",
                "https://www.eligasht.com/Blog/wp-content/uploads/2017/05/alaska.jpg"
            ),
            NatureShow(
                "Alps! (Italy)",
                "https://cdn.britannica.com/00/188300-050-972ACBFB/Dolomites-Italian-Alps.jpg"
            ),
            NatureShow(
                "Kotlin Island (Russia)",
                "https://thumbs.dreamstime.com/b/panoramic-view-height-fort-rif-western-tip-kotlin-island-gulf-finland-city-kronstadt-fortress-219319331.jpg"
            ),
            NatureShow(
                "Finland nature...",
                "https://finland.fi/wp-content/uploads/2015/05/2992-nature2_b-jpg.jpg"
            ),
            NatureShow(
                "Swiss...",
                "https://img.traveltriangle.com/blog/wp-content/uploads/2018/11/swiss-national-park1.jpg"
            )
        )
        val adapter = NatureAdapter(data)

        binding.recyclerMain.adapter = adapter
        binding.recyclerMain.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

    }
}