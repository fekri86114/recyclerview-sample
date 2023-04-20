package info.fekri.dependencyinjection

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import info.fekri.dependencyinjection.databinding.ItemRecyclerBinding

class NatureAdapter(private val data: ArrayList<NatureShow>) :
    RecyclerView.Adapter<NatureAdapter.NatureViewHolder>() {
    private lateinit var binding: ItemRecyclerBinding

    inner class NatureViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: NatureShow) {

            // set description
            binding.txtDescNature.text = data.desc

            // set image
            Picasso
                .get()
                .load(data.imgUrl)
                .into(binding.imgShowNature)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NatureViewHolder {
        binding = ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NatureViewHolder(binding.root)
    }
    override fun onBindViewHolder(holder: NatureViewHolder, position: Int) {
        holder.bind(data[position])
    }
    override fun getItemCount(): Int = data.size

}