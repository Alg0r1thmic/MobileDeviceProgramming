package me.mahakagg.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_ITEMS = "me.mahakagg.shoppinglist.extra.ITEMS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
//        Intent intent = getIntent();
    }
    public void selectItem(View view) {
        Intent return_items_intent = new Intent();

        switch (view.getId()){
            case R.id.button_Chocolate:
                return_items_intent.putExtra(EXTRA_ITEMS, "Chocolate"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.button_oil:
                return_items_intent.putExtra(EXTRA_ITEMS, "Aceite"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.button_milk:
                return_items_intent.putExtra(EXTRA_ITEMS, "Leche"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.button_eggs:
                return_items_intent.putExtra(EXTRA_ITEMS, "Huevos"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.button_cheese:
                return_items_intent.putExtra(EXTRA_ITEMS, "Queso"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.button_rice:
                return_items_intent.putExtra(EXTRA_ITEMS, "Arroz"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.button_wheat:
                return_items_intent.putExtra(EXTRA_ITEMS, "Harina de trigo"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.button_bread:
                return_items_intent.putExtra(EXTRA_ITEMS, "Pan"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.button_sugar:
                return_items_intent.putExtra(EXTRA_ITEMS, "Azucar"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.button_salt:
                return_items_intent.putExtra(EXTRA_ITEMS, "Sal"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            default:
                Toast.makeText(SecondActivity.this, "Hubo un error", Toast.LENGTH_LONG).show();
                break;
        }

    }
}
