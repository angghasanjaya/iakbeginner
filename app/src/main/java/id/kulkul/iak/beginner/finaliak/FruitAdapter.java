package id.kulkul.iak.beginner.finaliak;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anggha on 17/05/17.
 */

public class FruitAdapter extends ArrayAdapter<FruitModel>{

    Context context;
    int layoutResourceId;

    ArrayList<FruitModel> data = null;

    //    Class constructor
    public FruitAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<FruitModel> objects) {
        super(context, resource, objects);
        this.context = context;
        this.layoutResourceId = resource;
        this.data = objects;
    }

    // subclass to hold view from custom view, I guess

    static class FruitLayoutHolder{

        ImageView listImg;
        TextView listTitle;
        TextView listSub;

    }

    //override method get view from arrayadapter class
    // java why you do dis ?

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // wtf is convertview ?
        View row = convertView;

        // mkaayy....
        FruitLayoutHolder layoutHolder = null;


        if( row == null){

            // wtf is layoutinflater ?
            LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
            row = layoutInflater.inflate(layoutResourceId, parent, false);

            // Ok, layoutinflater pass custom layout resource id to adapter


            layoutHolder = new FruitLayoutHolder(); // <----- java is funny
            layoutHolder.listImg = (ImageView) row.findViewById(R.id.listImg);
            layoutHolder.listTitle = (TextView) row.findViewById(R.id.listTitle);
            layoutHolder.listSub= (TextView) row.findViewById(R.id.listSub);

            // I told you
            row.setTag(layoutHolder);

        }else{

            layoutHolder = (FruitLayoutHolder) row.getTag();

        }

        FruitModel fruit = data.get(position);
        layoutHolder.listImg.setImageResource(fruit.icon);
        layoutHolder.listTitle.setText(fruit.title);
        layoutHolder.listSub.setText(fruit.sub);

        return row;


    }
}
