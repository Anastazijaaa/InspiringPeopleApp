package com.anastazijazivkovic.lv2_famouspeopleapp


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class activityMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        people_in_list()

        listOfPerson.apply {
            layoutManager = LinearLayoutManager(this@activityMain)
            adapter = famousPeopleAdapter()
        }
        inputNewItemButton.setOnClickListener {
            startActivity(Intent(this, activityNewInput::class.java))
        }

    }

    private fun people_in_list()
    {if(peopleRepository.instance.length() != 0) {
          return
    }
        peopleRepository.instance.addNewPerson(
            famousPerson(
                "Nikola Tesla",
                "https://www.sensa.hr/repository/images/_variations/0/0/00d91d3f192bc846fcec9e5435779c93d41a30e9_138fc21807d00fd03ee4998a736195c422fda2bb_articlemain.jpg",
                "10/07/1856",
                "07/01/1943",
                "Nikola Tesla was an inventor, electrical engineer, mechanical engineer, and futurist best known for his contributions to the design of the modern alternating current (AC) electricity supply system.",
                listOf(
                    person_quote("If you want to find the secrets of the universe, think in terms of energy, frequency and vibration."),
                    person_quote("I don't care that they stole my idea . . I care that they don't have any of their own."),
                    person_quote("The present is theirs; the future, for which I really worked, is mine.")
                ) as MutableList<person_quote>
            )
        )

        peopleRepository.instance.addNewPerson(
            famousPerson(
                "Tim Berners-Lee",
                "https://upload.wikimedia.org/wikipedia/commons/4/4e/Sir_Tim_Berners-Lee_%28cropped%29.jpg",
                "08/06/1955",
                "-",
                "Dot coms, bloggers and Google all have one man to thank for their place in the 21st century world. In 1990, Tim Berners-Lee made the imaginative leap to combine the internet with the hypertext concept, and the worldwide web was born. The first website built was at http://info.cern.ch/ and was put online on 6 August 1991. The URL is still in use today.",
                listOf(
                    person_quote("Anyone who has lost track of time when using a computer knows the propensity to dream, the urge to make dreams come true and the tendency to miss lunch."),
                    person_quote("We need diversity of thought in the world to face the new challenges."),
                    person_quote("You affect the world by what you browse.")
                ) as MutableList<person_quote>
            )
        )

        peopleRepository.instance.addNewPerson(
            famousPerson(
                "Steve Jobs",
                "https://s.france24.com/media/display/45d7141a-0ace-11e9-8875-005056a964fe/w:1280/p:16x9/090910-stevejobs-m.jpg",
                "24/02/1955",
                "05/10/2011",
                " Steve Jobs, the co-founder and chief executive of Apple Computer, topped the Computer Weekly 40th anniversary poll due to the devoted following he has generated through his pioneering work in personal computing and product design.",
                listOf(
                    person_quote("Let’s go invent tomorrow rather than worrying about what happened yesterday."),
                    person_quote("Remembering that I’ll be dead soon is the most important tool I’ve ever encountered to help me make the big choices in life."),
                    person_quote("I think all of us need to be on guard against arrogance which knocks at the door whenever you’re successful.")
                ) as MutableList<person_quote>
            )
        )

        peopleRepository.instance.addNewPerson(
            famousPerson(
                "Linus Torvalds",
                "https://upload.wikimedia.org/wikipedia/commons/0/01/LinuxCon_Europe_Linus_Torvalds_03_%28cropped%29.jpg",
                "28/12/1969",
                "-",
                "Linus Torvalds created the Linux kernel and oversaw open source development of the widely-used Linux operating system. ",
                listOf(
                    person_quote("I'd argue that everybody wants to do something that matters"),
                    person_quote("Do no harm"),
                    person_quote("La UANL es la verga")
                ) as MutableList<person_quote>
            )
        )

        peopleRepository.instance.addNewPerson(
            famousPerson(
                "Grace Hopper",
                "https://miro.medium.com/max/2800/1*W7QpgyGBrYpD2VsL08XdaA.jpeg",
                "09/12/1906",
                "01/01/1992",
                "Grace Hopper was one of the first programmers of the Harvard Mark I computer, she was a pioneer of computer programming who invented one of the first linkers.",
                listOf(
                    person_quote("You don't manage people, you manage things. You lead people."),
                    person_quote("I've always been more interested in the future than in the past."),
                    person_quote("We’ve tended to forget that no computer will ever ask a new question.")
                ) as MutableList<person_quote>
            )
        )
    }
}