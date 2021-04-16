package com.anastazijazivkovic.lv2_famouspeopleapp


class famousPerson(val name: String, val imageURL: String, private val dateOfBirth: String, private val dateOfDeath: String, val personDescription: String, val quotes: MutableList<person_quote>)
{
    fun birth_and_die(): String {
        return "Born on $dateOfBirth, died on $dateOfDeath";
    }
}

class person_quote(val quote: String) {

}