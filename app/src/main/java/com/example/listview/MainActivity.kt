package com.example.listview

import Adaptador
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaPersonas:ListView=findViewById(R.id.listaPersonas)
        //crear una lista mutable vacia de tipo strin
        var personas = mutableListOf<Persona>()
        //agregar elementos a la lista
        var per1 = Persona("Alex Riaño","3115262803", R.drawable.foto1)
        var per2 = Persona("Emmanuel Gonzalez","3293837449", R.drawable.foto2)
        var per3 = Persona("Sara Perdomo","3112345678",R.drawable.foto3)
        var per4 = Persona("Rick Sanchez","3209837456",R.drawable.foto4)
        personas.add(per1)
        personas.add(per2)
        personas.add(per3)
        personas.add(per4)
        personas.add(per1)
        personas.add(per2)
        personas.add(per3)
        personas.add(per4)
        personas.add(per1)
        personas.add(per2)
        personas.add(per3)
        personas.add(per4)
        //crear un adaptador  asociado al activity con un layout predeterminado y con  los datos
        val adaptador:Adaptador =Adaptador(this,R.layout.elementopersona,personas)
        //al objeto ListView llamado liesta personas asignarle como  adapter el adaptador creado
        listaPersonas.adapter = adaptador
        //respuesta al evento click en un item de la lista
        listaPersonas.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(this@MainActivity,"Click en posicion $position, con nombre: " +
            personas[position].nombre, Toast.LENGTH_SHORT).show()
        }
    }
}