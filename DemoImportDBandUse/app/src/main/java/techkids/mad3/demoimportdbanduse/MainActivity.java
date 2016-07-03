package techkids.mad3.demoimportdbanduse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    private ListView lvQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        displayQuestions();
    }

    private void initComponents()
    {
        lvQuestions = (ListView) this.findViewById(R.id.lvQuestions);
    }

    private void displayQuestions()
    {
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();
        List<String> questions = databaseAccess.getQuestions();
        databaseAccess.close();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, questions);
        lvQuestions.setAdapter(adapter);
    }

}
