package com.example.s201010lykkehjulet
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class CategoryScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.category_screen_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val categoriesList = addCategories()
        val recyclerView = view.findViewById<RecyclerView>(R.id.categoryRecyclerView)
        recyclerView.adapter = CategoryAdapter(categoriesList)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.setHasFixedSize(true)

    }

    private fun addCategories(): List<CategoryItem> {
        val list = ArrayList<CategoryItem>(10)
        list.add(0, CategoryItem("Countries"))
        list.add(1, CategoryItem("Colors"))
        list.add(2, CategoryItem("Holidays"))
        list.add(3, CategoryItem("Sports"))
        list.add(4, CategoryItem("Car brands"))
        list.add(5, CategoryItem("Board games"))
        list.add(6, CategoryItem("Fruits"))
        list.add(7, CategoryItem("Vegetables"))
        list.add(8, CategoryItem("Body parts"))
        list.add(9, CategoryItem("Capitals"))
        list.add(10, CategoryItem("Programming languages"))






        return list
    }


}








