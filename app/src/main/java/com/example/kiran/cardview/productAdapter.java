package com.example.kiran.cardview;

import android.content.Context;
import android.nfc.Tag;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by kiran on 2/4/18.
 */

/*
recyclerview .Aaptrer

and

recyclerview.viewholder is needed for using recyclerview
 */



//there was errot when this class was public

   public class productAdapter  extends RecyclerView.Adapter<productAdapter.productviewholder>{

    private Context mctx; // Context object is needed as we will use layout inflater to inflate to list_layout...
    //to create layout inflater object we need context object

    private List<product> productList;// product is our class
    //it represent all the elements of our product class in a list form

    //to display data we need list so we used List





//constructor
    public productAdapter(Context mctx, List<product> productList) {
        this.mctx = mctx;
        this.productList = productList;


    }



    @Override
    public productviewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mctx);
        View view = inflater.inflate(R.layout.list_layout,null);

        return new productviewholder(view);//returning to out productviewholder class at below

    }

    @Override
    public void onBindViewHolder(productviewholder holder, int position) {
//holder has our UI material and position is to arrange aacording to our List(product)

        final product productclassobj = productList.get(position);//product is class and its object takes its position from list

        holder.textviewtitle.setText(productclassobj.getTitle());//passing value thorough getter from model class product so its object is used

        holder.textviewrating.setText(String.valueOf(productclassobj.getRating()));//as getrating is float in model class product so changing isn string

        holder.textviewdesc.setText(productclassobj.getShort_desc());

        holder.textviewprice.setText(String.valueOf(productclassobj.getPrice()));

        //for imageview

        holder.imageView.setImageDrawable(mctx.getResources().getDrawable(productclassobj.getImage()));


        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mctx,"click on" + productclassobj.getTitle(),Toast.LENGTH_LONG).show();
            }
        });

        //this line will take the corrsponding cardview from productclass object and when we click it it shows the title according to the correct position






    }

    @Override
    public int getItemCount() {
        return productList.size();//no of item to be display in view
    }







    class productviewholder  extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textviewtitle , textviewdesc, textviewrating, textviewprice;
        CardView cardview;




        public productviewholder(View itemView) {//itemview is the view we return from upper productviewholder
            super(itemView);

            imageView = (ImageView)itemView.findViewById(R.id.imageView);
            textviewdesc = (TextView)itemView.findViewById(R.id.textViewShortDesc);
            textviewrating = (TextView)itemView.findViewById(R.id.textViewRating);
            textviewprice = (TextView)itemView.findViewById(R.id.textViewPrice);
            textviewtitle =(TextView)itemView.findViewById(R.id.textViewTitle);
            //pointing to all out view type in list_layout.xml

            //using cardview for onclicck on recyclerview to show some text

            cardview = (CardView) itemView.findViewById(R.id.cardview);
            //pointing to cardview for clicking on it



        }
    }



}
