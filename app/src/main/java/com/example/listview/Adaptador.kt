import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.listview.Persona
import com.example.listview.R


class Adaptador:BaseAdapter {
    //atributos
    lateinit var  contexto:Context
    var layout:Int=0
    lateinit var listaPersonas:List<Persona>

    /**
     *contructor que inicializa el objeto
     */
    constructor(contexto: Context,layout:Int,listaPersonas:List<Persona>){
        this.contexto=contexto
        this.layout=layout
        this.listaPersonas=listaPersonas
    }
    /*
    * obtiene el tamaño de la lista del adaptador
    */
    override fun getCount(): Int {
        return listaPersonas.size
    }

    /*
    * obtiene el item del elemento de acuerdo a su posicion
    * */

    override fun getItem(position: Int): Any {
        return listaPersonas[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    /*
    * Retorna la vista de los elementos
    * */

    override fun getView(position: Int, vista: View?, parent: ViewGroup?): View {
        var v:View
        var inflater:LayoutInflater=LayoutInflater.from(contexto)
        v= inflater.inflate(R.layout.elementopersona,null)
        val txtNombre:TextView=v.findViewById(R.id.txtNombre)
        txtNombre.text = listaPersonas[position].nombre
        val txtTelefono:TextView=v.findViewById(R.id.txtTelefono)
        txtTelefono.text =listaPersonas[position].celular
        val imgFoto:ImageView=v.findViewById(R.id.imgFoto)
        imgFoto.setImageResource(listaPersonas[position].foto)
        return v;
    }
}