package com.bedoya.esau.list_2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Lista_Entrada[] datos=new Lista_Entrada[]{new Lista_Entrada(R.drawable.super1,"Superman","Clarck Kent", "1938"),
            new Lista_Entrada(R.drawable.batman,"Batman","Bruce Wayne","1939"),
            new Lista_Entrada(R.drawable.maravilla,"Mujer Maravilla","Diana Prince","1941")};

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Adapter adapter=new Adapter(this,datos);
        listView=(ListView)findViewById(R.id.list2);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String opcionSel=((Lista_Entrada)parent.getItemAtPosition(position)).getNombre();
                Toast.makeText(MainActivity.this,opcionSel,Toast.LENGTH_SHORT).show();
            }
        });
    }

    class Adapter extends ArrayAdapter<Lista_Entrada> {
        public Adapter(Context context, Lista_Entrada[] datos) {
            super(context, R.layout.list_item,datos);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater=LayoutInflater.from(getContext());
            View item=inflater.inflate(R.layout.list_item, null);

            ImageView imagen=(ImageView) item.findViewById(R.id.imagen);
            imagen.setImageResource(datos[position].getIdImagen());

            TextView nombre=(TextView) item.findViewById(R.id.nombre);
            nombre.setText(datos[position].getNombre());

            TextView nombrePila=(TextView) item.findViewById(R.id.npila);
            nombrePila.setText(datos[position].getNombrePila());

            TextView year=(TextView) item.findViewById(R.id.fecha);
            year.setText(datos[position].getFecha());


            return (item);
        }
    }
}
