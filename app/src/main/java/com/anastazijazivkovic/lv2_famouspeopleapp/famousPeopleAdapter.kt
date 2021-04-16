package com.anastazijazivkovic.lv2_famouspeopleapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.person_list_item.view.*

class famousPeopleAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
    {
        return viewholderPerson(LayoutInflater.from(parent.context).inflate(R.layout.person_list_item, parent, false))
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int)
    {
        when(holder)
        {
            is viewholderPerson -> {
                holder.makeBind(peopleRepository.instance.getPersons().get(position))
            }

        }
    }


    class viewholderPerson constructor(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val name_of_person: TextView = itemView.personName
        private val photo_of_person: ImageView = itemView.personPhoto
        private val birth_and_die: TextView = itemView.personDates
        private val desc: TextView = itemView.personDescription

        fun makeBind(person_item: famousPerson)
        {
            name_of_person.text = person_item.name
            Picasso.with(itemView.context).load(person_item.imageURL).fit().centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(photo_of_person)
            birth_and_die.text = person_item.birth_and_die()
            desc.text = person_item.personDescription

            photo_of_person.setOnClickListener {
                val text = person_item.quotes.shuffled().take(1)[0].quote
                val duration = Toast.LENGTH_SHORT
                Toast.makeText(itemView.context, text, duration).show()

            }
        }
    }
    override fun getItemCount(): Int
    {
        return peopleRepository.instance.length()
    }
}