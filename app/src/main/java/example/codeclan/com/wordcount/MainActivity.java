package example.codeclan.com.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputText;
    TextView answerText;
    TextView answerText2;
    TextView answerText3;
    Button countButton;
    Wordcount word;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = (EditText)findViewById(R.id.input);
        answerText = (TextView)findViewById(R.id.answer_Text);
        answerText2 = (TextView)findViewById(R.id.answer_Text2);
        answerText3 = (TextView)findViewById(R.id.answer_Text3);
        countButton = (Button)findViewById(R.id.count_Button);
        word = new Wordcount();
    }

    public void onclickCountWords(View button){
        String input = inputText.getText().toString();
        answerText.setText("Word count: " + word.getWordCountString(input));
        answerText2.setText(word.getWordOccurencesString(input));
        answerText3.setText("Sorted: " + word.getWordOccurencesSorted(word.getWordOccurences(input)));
    }




}
