package com.anastazijazivkovic.lv2_famouspeopleapp


class peopleRepository private constructor() {

    private val persons: MutableList<famousPerson> = mutableListOf()

    private object holder_object {
        val instance = peopleRepository()
    }

    companion object {
        val instance: peopleRepository by lazy { holder_object.instance }
    }

    fun getPersons(): MutableList<famousPerson>
    {
        return persons;
    }

    fun addNewPerson(person: famousPerson)
    {
        persons.add(person)
    }

    fun length(): Int
    {
        return persons.size;
    }

}