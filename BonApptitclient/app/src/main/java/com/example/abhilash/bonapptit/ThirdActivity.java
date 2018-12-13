package com.example.abhilash.bonapptit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imageView;
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    ArrayList<MenuItem> menuItems=new ArrayList<>();
    Bundle bundle=new Bundle();
    int menutype;
    FloatingActionButton orderBtn;

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        bundle=getIntent().getBundleExtra("bundle");
        menutype=bundle.getInt("menuType");
        setContentView(R.layout.recycler);
        defineMenu();
        recyclerView=findViewById(R.id.recyclerview);
        recyclerViewAdapter=new RecyclerViewAdapter(this,menuItems,bundle);
        Log.d("Menu items size"," Size = "+menuItems.size());
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));
       // recyclerViewAdapter.menuItems.addAll(menuItems);
      //  recyclerViewAdapter.notifyDataSetChanged();
//        orderBtn=findViewById(R.id.co_button);
//        orderBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String jsonString = "{\"Order\": [\"";
//                float price = 0.00f;
//                for(int i = 0; i < menuItems.size(); i++) {
//                    if (menuItems.get(i).getQuantity() != 0) {
//                        price += menuItems.get(i).getPrice() * menuItems.get(i).getQuantity();
//                        if (i != menuItems.size() - 1) {
//                            jsonString += menuItems.get(i).getQuantity() + " " + menuItems.get(i).getName() + "\", \"";
//                        } else {
//                            jsonString += menuItems.get(i).getQuantity() + " " + menuItems.get(i).getName() + "\"]";
//                        }
//                    }
//                }
//                if(menuItems.get(menuItems.size() - 1).getQuantity() == 0) {
//                    jsonString = jsonString.substring(0, jsonString.length() - 4) + "]";
//                }
//                jsonString += ", \"Price\": \"" + price + "\"}";
//                Log.d(null, "jsonString: " + jsonString);
//                bundle.putString("jsonString",jsonString);
//                bundle.putString("Price",Float.toString(price));
//                Intent newIntent = new Intent(ThirdActivity.this, FourthActivity.class);
//                startActivity(newIntent);
//            }
//        });

    }
    @SuppressLint("ResourceType")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.submit_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(android.view.MenuItem item) {
        int menuclicked=item.getItemId();
        if (menuclicked==R.id.co_button){
            String jsonString = "{\"Order\": [\"";
            float price = 0.00f;
            for(int i = 0; i < menuItems.size(); i++) {
                if (menuItems.get(i).getQuantity() != 0) {
                    price += menuItems.get(i).getPrice() * menuItems.get(i).getQuantity();
                    if (i != menuItems.size() - 1) {
                        jsonString += menuItems.get(i).getQuantity() + " " + menuItems.get(i).getName() + "\", \"";
                    } else {
                        jsonString += menuItems.get(i).getQuantity() + " " + menuItems.get(i).getName() + "\"]";
                    }
                }
            }
            if(menuItems.get(menuItems.size() - 1).getQuantity() == 0) {
                jsonString = jsonString.substring(0, jsonString.length() - 4) + "]";
            }
            jsonString += ", \"Price\": \"" + price + "\"}";
            Log.d(null, "jsonString: " + jsonString);

            Intent newIntent = new Intent(ThirdActivity.this, FourthActivity.class);
            bundle.putString("jsonString",jsonString);
            bundle.putString("Price",Float.toString(price));
            newIntent.putExtra("bundle",bundle);
            startActivity(newIntent);
        }
        return super.onOptionsItemSelected(item);
    }

    private void defineMenu() {
        switch (menutype){
            case Keys.MENU_BREAKFAST:
                Log.d("BreakFast" , " Switch ");
                menuItems.add(new MenuItem("Blueberry buttermilk pancakes",
                        5.99f,
                        Keys.MENU_BREAKFAST,
                        "Buttermilk pancakes studded with juicy fresh blueberries and topped with a gorgeous deep purple blueberry syrup.",
                        "drawable/blueberry_buttermilk_pancakes.png"));
                menuItems.add(new MenuItem("drawable/blueberry_buttermilk_pancakes.png",
                        3.99f,
                        Keys.MENU_BREAKFAST,
                        "Egg whites, tomatoes and spinach in between two bagel halves.",
                        "drawable/bagel_breakfast_sliders.png"));
                menuItems.add(new MenuItem("Foodname: Breakfast Strata",
                        7.99f,
                        Keys.MENU_BREAKFAST,
                        "A classic food dish, generally considered a brunch dish, that is traditionally made with layers of ingredients placed over a base of day old bread and fresh cheese, covered with a blended mixture of eggs and milk, and baked in an oven.",
                        "drawable/breakfast_strata.png"));
                menuItems.add(new MenuItem("Classic Coffee Cake",
                        4.99f,
                        Keys.MENU_BREAKFAST,
                        "Coffee cake is a traditional sweet pound cake layered with a brown sugar, cinnamon, and pecan-laced streusel. The reason this beauty is called coffee cake is because it's the perfect complement to a cup of coffee or a foamy latte.",
                        "drawable/classic_coffee_cake.png"));
                menuItems.add(new MenuItem("Biscuits 'N Gravy Pie",
                        9.99f,
                        Keys.MENU_BREAKFAST,
                        "Biscuits and gravy is a popular breakfast dish in the United States especially in the South. The dish consists of soft dough biscuits covered in either sawmill or meat gravy made from the drippings of cooked pork sausage white flour milk and often bits of sausage bacon ground beef or other meat",
                        "drawable-v24/biscuits_gravy_pie.png"));
                break;
            case Keys.MENU_LUNCH:
                Log.d("Lunch" , " Switch ");
                menuItems.add(new MenuItem("Chicken Salad",
                        5.99f,
                        Keys.MENU_LUNCH,
                        "Chicken served with lettuce, mayonnaise, hard-boiled egg, celery, onion, pepper, pickles (or pickle relish) and a variety of mustards.",
                        "drawable/chicken_salad.png"));
                menuItems.add(new MenuItem("Sauteed Shrimp",
                        7.99f,
                        Keys.MENU_LUNCH,
                        "Shrimps sautéed in olive oil, garlic, lemon juice and fresh basil.",
                        "drawable/sauteed_shrimp.png"));
                menuItems.add(new MenuItem("Buttered Egg Noodles",
                        4.99f,
                        Keys.MENU_LUNCH,
                        "Buttered Noodles cooked in butter, egg white and chicken broth, topped with  grated Parmesan cheese, parsley, and plenty of butter.",
                        "drawable/buttered_egg_noodles.png"));
                menuItems.add(new MenuItem("Oven-Fried Chicken",
                        10.99f,
                        Keys.MENU_LUNCH,
                        "Simple and lighter fried chicken coated with a seasoned flour mixture and then baked to perfection.",
                        "drawable/oven_fried_chicken.png"));
                menuItems.add(new MenuItem("Chicken and Waffles",
                        9.99f,
                        Keys.MENU_LUNCH,
                        "An American Classic. The best known chicken and waffle pairing comes from the American soul food tradition and uses fried chicken.",
                        "drawable/chicken_and_waffles.png"));
                break;
            case Keys.MENU_DINNER:
                Log.d("Dinner" , " Switch ");
                menuItems.add(new MenuItem("Smoked Salmon Pasta",
                        8.99f,
                        Keys.MENU_DINNER,
                        "Smoked salmon with pasta in a sauce of shallots, garlic, white wine, lemon, and cream, with toasted pine nuts and parsley.",
                        "drawable/smoked_salmon_pasta.png"));
                menuItems.add(new MenuItem("Cacio e Pepe",
                        9.99f,
                        Keys.MENU_DINNER,
                        "Cacio e Pepe is a pasta dish from Roman cuisine. Cacio e Pepe means cheese and pepper in several central Italian dialects.",
                        "drawable/cacio_e_pepe.png"));
                menuItems.add(new MenuItem("Lasagna Roll-Ups",
                        10.99f,
                        Keys.MENU_DINNER,
                        "Lasagna noodle topped with marinara and cooked spinach, then sprinkle with mozzarella and roll up tightly",
                        "drawable/lasagna_roll_ups.png"));
                menuItems.add(new MenuItem("Baked Spaghetti",
                        8.99f,
                        Keys.MENU_DINNER,
                        "A baked pasta dish, made with cheese, meat and vegetables.",
                        "drawable/baked_spaghetti.png"));
                menuItems.add(new MenuItem("Southwestern Pasta Salad",
                        9.99f,
                        Keys.MENU_DINNER,
                        "A mix of Mexican-inspired ingredients such as black beans, corn, and avocado, along with hearty whole wheat pasta and a light and creamy Greek yogurt paprika dressing, this Southwestern pasta salad boasts simple prep and complex flavor, with wide crowd appeal.",
                        "drawable/southwestern_pasta_salad.png"));
                break;
        }
    }

    @Override
    public void onClick(View v) {
        int click=v.getId();
        if(click==R.id.co_button){

        }
        }
    }

