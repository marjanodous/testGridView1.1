package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class general extends AppCompatActivity {

    TextView txtTitle;
    GridView gridView;
    public static String titleMenu;
    public ArrayList<item_model_menu_general> listomumi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        txtTitle = findViewById(R.id.title_general);
        txtTitle.setText(titleMenu);
        gridView = findViewById(R.id.grid_menu);

        Bundle bundle = getIntent().getExtras();
        Boolean omumi = bundle.getBoolean("omumi");

        if (omumi) {
            setOmumi();
            adapter_menu_general adapter = new adapter_menu_general(general.this, R.layout.item_grid_menu_general, listomumi);
            gridView.setAdapter(adapter);
        }
    }

    private void setOmumi() {
        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
    }

}