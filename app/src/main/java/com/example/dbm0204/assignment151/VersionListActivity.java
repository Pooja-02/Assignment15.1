package com.example.dbm0204.assignment151;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import java.util.ArrayList;


//creating class by extending Activity class.
public class VersionListActivity extends AppCompatActivity
{
    Toolbar toolbar;   //Creating reference of the class Toolbar.
    ArrayList<String> versionList;    //Creating reference of ArrayList .
    RecyclerView recyclerView;    //creating reference of RecyclerView.

    @Override
    //onCreate method.
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.version_list_activity);    //Setting Content View.

        //Setting toolbar reference to its ID.
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);   //Setting toolbar as a support action bar.
        toolbar.setTitle("Android Versions");     //Setting the title of toolbar.
        toolbar.setTitleTextColor(getResources().getColor(R.color.toolbar_title));   //Setting the color of title.


        //Getting opyion menu as overflow icon.
        getSupportActionBar().openOptionsMenu();

        //Setting RecyclerView with its ID.
        recyclerView = (RecyclerView)findViewById(R.id.rv_version_list);

        //Creating object of LinearLayoutManager and setting to recyclerView.
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        //Creating Array object and adding Values.
        versionList = new ArrayList<>();
        versionList.add("Alpha");
        versionList.add("Beta");
        versionList.add("Cupcake");
        versionList.add("Donut");
        versionList.add("Eclair");
        versionList.add("Froyo");
        versionList.add("Gingerbread");
        versionList.add("Honeycomb");
        versionList.add("Ice Cream Sandwich");
        versionList.add("Jelly Bean");
        versionList.add("Kitkat");
        versionList.add("Lollipop");
        versionList.add("Marshmallow");
        versionList.add("Nougat");


        //Setting RecyclerView adapter.
        RVAdapter adapter = new RVAdapter(versionList);
        recyclerView.setAdapter(adapter);    //Setting Adapter to recyclerView.


    }


    @Override
    //Method which is creating option Menu.
    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);

        //Adding elements to option menu.
        menu.add("Search");
        menu.add("Settings");

        return true;   //returning true.
    }

    @Override
    //Method when item in the option menu is clicked.
    public boolean onOptionsItemSelected(MenuItem item)
    {
        //Displaying Toast.
        Toast.makeText(getApplicationContext(),item.getTitle()+" is Clicked",Toast.LENGTH_SHORT).show();

        return true;    //returning true.
    }


    //When Floating action button is clicked.


}
