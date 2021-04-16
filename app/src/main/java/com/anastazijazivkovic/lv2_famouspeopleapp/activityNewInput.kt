package com.anastazijazivkovic.lv2_famouspeopleapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_people_input.*

class activityNewInput : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_people_input)

        BtnInput.setOnClickListener {
            val newPerson = famousPerson(
                newName.text.toString(),
                image.text.toString(),
                input_date_of_birth.text.toString(),
                input_date_of_death.text.toString(),
                short_desc.text.toString(),
                listOf(
                    person_quote(first_quote.text.toString()),
                    person_quote(second_quote.text.toString()),
                    person_quote(third_quote.text.toString())
                ) as MutableList<person_quote>
            )
            peopleRepository.instance.addNewPerson(newPerson)
            newName.text.clear()
            image.text.clear()
            input_date_of_birth.text.clear()
            input_date_of_death.text.clear()
            short_desc.text.clear()
            first_quote.text.clear()
            second_quote.text.clear()
            third_quote.text.clear()

        }

        list_of_people.setOnClickListener {
            startActivity(Intent(this, activityMain::class.java))
        }
    }
}
