package com.example.csi319androidhangman;

import android.os.Bundle;
import android.app.Activity;
import android.view.Display;
import android.view.Gravity;
import android.view.Menu;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    String[] wordBank = new String[]
    		{
    			"funny", 
    			"classic", 
    			"android", 
    			"constant", 
    			"numbers", 
    			"forgetful", 
    			"citizen", 
    			"sustained", 
    			"reflect", 
    			"underwear"
    		};
    int rand = (int)(Math.random() * 10 + 1);
	String word = wordBank[rand - 1];
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Display display = getWindowManager().getDefaultDisplay();
        @SuppressWarnings("deprecation")
                int width = display.getWidth();
        
        //buildWord(R.id.wordField, word);
        buildWordField(R.id.wordField, word);
        
        buildKeyboard(R.id.row1, topAlpha, width);
        buildKeyboard(R.id.row2, midAlpha, width);
        buildKeyboard(R.id.row3, botAlpha, width);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    private static final String TAG = "CSI319MobileApp1";
    //private static char[] topQwerty = new char[] {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
    //private static char[] midQwerty = new char[] {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
    //private static char[] botQwerty = new char[] {'z', 'x', 'c', 'v', 'b', 'n', 'm'};
    private static char[] topAlpha = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
    private static char[] midAlpha = new char[] {'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r'};
    private static char[] botAlpha = new char[] {'s', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    
    private View.OnClickListener onClick = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            Log.d(TAG, String.valueOf((char)v.getId()));
            //((Button) v).setText("#");
            ((Button) v).setClickable(false);
            checkWordField(v.getId());
        }
    };
    
    private void buildKeyboard(int rowResId, char[] letters, int width)
    {
        LinearLayout row = (LinearLayout)this.findViewById(rowResId);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, 
                LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(-5, -5, -5, -5);
        int buttWidth = (1/10) * width;
        
        for(int i = 0; i < letters.length; ++i)
        {
            Button button = new Button(this.getApplicationContext(), null, android.R.attr.buttonStyleSmall);
            button.setText(String.valueOf(letters[i]));
            button.setId(Character.getNumericValue(letters[i]));
            button.setHeight(20);
            button.setWidth(buttWidth);
            button.setPadding(-5, -5, -5, -5);
            button.setOnClickListener(onClick);
            row.addView(button, params);
        }
    }
    
    private void buildWord(int textId, String word)
    {       
        LinearLayout field = (LinearLayout)this.findViewById(textId);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, 
                LinearLayout.LayoutParams.WRAP_CONTENT, 
                Gravity.CENTER_HORIZONTAL);
                
        for(int i = 0; i < word.length(); ++i)
        {
            TextView view = new TextView(this);
            view.setId(word.charAt(i));
            view.setTextSize(20);
            view.setPadding(5, 5, 5, 5);
            if(word.charAt(i) == ' ')
            {
                view.setText(" ");
            }
            else
            {
                view.setText("_");
            }
            field.addView(view, params);
        }
    }
    
    private void buildWordField(int textId, String word)
    {
        if(word.length() >= 1)
        {
            TextView view = (TextView)findViewById(R.id.letter1);
            if(word.charAt(0) == ' ')
                    view.setText(" ");
            else
                    view.setText("_");
            view.setPadding(5, 5, 5, 5);
        }
        if(word.length() >= 2)
        {
            TextView view = (TextView)findViewById(R.id.letter2);
            if(word.charAt(1) == ' ')
                    view.setText(" ");
            else
                    view.setText("_");
            view.setPadding(5, 5, 5, 5);
        }
        if(word.length() >= 3)
        {
            TextView view = (TextView)findViewById(R.id.letter3);
            if(word.charAt(2) == ' ')
                    view.setText(" ");
            else
                    view.setText("_");
            view.setPadding(5, 5, 5, 5);
        }
        if(word.length() >= 4)
        {
            TextView view = (TextView)findViewById(R.id.letter4);
            if(word.charAt(3) == ' ')
                    view.setText(" ");
            else
                    view.setText("_");
            view.setPadding(5, 5, 5, 5);
        }
        if(word.length() >= 5)
        {
            TextView view = (TextView)findViewById(R.id.letter5);
            if(word.charAt(4) == ' ')
                    view.setText(" ");
            else
                    view.setText("_");
            view.setPadding(5, 5, 5, 5);
        }
        if(word.length() >= 6)
        {
            TextView view = (TextView)findViewById(R.id.letter6);
            if(word.charAt(5) == ' ')
                    view.setText(" ");
            else
                    view.setText("_");
            view.setPadding(5, 5, 5, 5);
        }
        if(word.length() >= 7)
        {
            TextView view = (TextView)findViewById(R.id.letter7);
            if(word.charAt(6) == ' ')
                    view.setText(" ");
            else
                    view.setText("_");
            view.setPadding(5, 5, 5, 5);
        }
        if(word.length() >= 8)
        {
            TextView view = (TextView)findViewById(R.id.letter8);
            if(word.charAt(8) == ' ')
                    view.setText(" ");
            else
                    view.setText("_");
            view.setPadding(5, 5, 5, 5);
        }
        if(word.length() >= 9)
        {
            TextView view = (TextView)findViewById(R.id.letter9);
            if(word.charAt(8) == ' ')
                    view.setText(" ");
            else
                    view.setText("_");
            view.setPadding(5, 5, 5, 5);
        }
        if(word.length() >= 10)
        {
            TextView view = (TextView)findViewById(R.id.letter10);
            if(word.charAt(9) == ' ')
                    view.setText(" ");
            else
                    view.setText("_");
            view.setPadding(5, 5, 5, 5);
        }
    }
    
    private void checkWordField(int buttId)
    {
        boolean letterExists = false;
        int[] asciis = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(int i = 0; i < word.length(); i++)
        {
                asciis[i] = Character.getNumericValue((char)word.charAt(i));
        }
        if(word.length() >= 1 && buttId == asciis[0])
        {
                TextView view = (TextView)findViewById(R.id.letter1);
                view.setText(String.valueOf(word.charAt(0)));
                letterExists = true;
        }
        if(word.length() >= 2 && buttId == asciis[1])
        {
                TextView view = (TextView)findViewById(R.id.letter2);
                view.setText(String.valueOf(word.charAt(1)));
                letterExists = true;
        }
        if(word.length() >= 3 && buttId == asciis[2])
        {
                TextView view = (TextView)findViewById(R.id.letter3);
                view.setText(String.valueOf(word.charAt(2)));
                letterExists = true;
        }
        if(word.length() >= 4 && buttId == asciis[3])
        {
                TextView view = (TextView)findViewById(R.id.letter4);
                view.setText(String.valueOf(word.charAt(3)));
                letterExists = true;
        }
        if(word.length() >= 5 && buttId == asciis[4])
        {
                TextView view = (TextView)findViewById(R.id.letter5);
                view.setText(String.valueOf(word.charAt(4)));
                letterExists = true;
        }
        if(word.length() >= 6 && buttId == asciis[5])
        {
                TextView view = (TextView)findViewById(R.id.letter6);
                view.setText(String.valueOf(word.charAt(5)));
                letterExists = true;
        }
        if(word.length() >= 7 && buttId == asciis[6])
        {
                TextView view = (TextView)findViewById(R.id.letter7);
                view.setText(String.valueOf(word.charAt(6)));
                letterExists = true;
        }
        if(word.length() >= 8 && buttId == asciis[7])
        {
                TextView view = (TextView)findViewById(R.id.letter8);
                view.setText(String.valueOf(word.charAt(7)));
                letterExists = true;
        }
        if(word.length() >= 9 && buttId == asciis[8])
        {
                TextView view = (TextView)findViewById(R.id.letter9);
                view.setText(String.valueOf(word.charAt(8)));
                letterExists = true;
        }
        if(word.length() >= 10 && buttId == asciis[9])
        {
                TextView view = (TextView)findViewById(R.id.letter10);
                view.setText(String.valueOf(word.charAt(9)));
                letterExists = true;
        }
        if(letterExists == false)
        {
            score++;
            if(score >= 1)
            {
                    ImageView image = (ImageView)findViewById(R.id.scoreImage);
                    image.setImageResource(R.drawable.image2);
            }
            if(score >= 2)
            {
                    ImageView image = (ImageView)findViewById(R.id.scoreImage);
                    image.setImageResource(R.drawable.image3);
            }
            if(score >= 3)
            {
                    ImageView image = (ImageView)findViewById(R.id.scoreImage);
                    image.setImageResource(R.drawable.image4);
            }
            if(score >= 4)
            {
                    ImageView image = (ImageView)findViewById(R.id.scoreImage);
                    image.setImageResource(R.drawable.image5);
            }
            if(score >= 5)
            {
                    ImageView image = (ImageView)findViewById(R.id.scoreImage);
                    image.setImageResource(R.drawable.image6);
            }
            if(score >= 6)
            {
                    ImageView image = (ImageView)findViewById(R.id.scoreImage);
                    image.setImageResource(R.drawable.image7);
            }
        }
    }
}
