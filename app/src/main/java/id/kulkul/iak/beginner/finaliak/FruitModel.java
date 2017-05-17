package id.kulkul.iak.beginner.finaliak;

/**
 * Created by anggha on 17/05/17.
 */

public class FruitModel {

    public int icon;
    public String title;
    public String sub;

    public FruitModel(int icon, String title, String sub){

        this.icon = icon;
        this.title = title;
        this.sub = sub;

    }

    public FruitModel getFruit(){
        return this;
    }

}
