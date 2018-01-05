package jp.techacademy.sumika.sugawara.aisatsuapp1;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        mTextView=findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    showTimePickerDialog();
            }
        });
    }
    private void showTimePickerDialog() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        if (hourOfDay >= 2 && hourOfDay < 10) {
                            mTextView.setText("おはよう");
                        } else if (hourOfDay >= 10 && hourOfDay < 18) {
                            mTextView.setText("こんにちは");
                        } else {
                            mTextView.setText("こんばんは");
                        }
                    }
                }, 0,0, true);
        timePickerDialog.show();
    }
}
