# Basic-Calculator-in-Android-Studio

## Steps
1. Create **New Project** in android studio > select **Empty Project** and language **Java** > click on **Next**</br></br>
2. Open **activity_main.xml** </br>
      2.1   Remove <TextView ....... /> </br>
      2.2   Replace **android.support.constraint.ConstraintLayout** to **LinearLayout** and Add **```android:orientation="vertical"```**</br>
            Eg.     <br/>
            
        <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
              xmlns:app="http://schemas.android.com/apk/res-auto"
              xmlns:tools="http://schemas.android.com/tools"
              android:layout_width="match_parent"
              android:layout_height="match_parent"
              android:orientation="vertical"
              tools:context=".MainActivity">
                    
      2.3   Add following componets </br>
      
        <EditText
            android:id="@+id/num1"
            android:hint="Enter Number 1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />
        <EditText
            android:id="@+id/num2"
            android:hint="Enter Number 2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />
        <Button
            android:id="@+id/add"
            android:text="ADD(N1+N2)"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />
        <Button
            android:id="@+id/sub"
            android:text="SUB(N1-N2)"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />
        <Button
            android:id="@+id/mul"
            android:text="MUL(N1*N2)"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />
        <Button
            android:id="@+id/div"
            android:text="DIV(N1/N2)"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />
        <TextView
            android:id="@+id/result"
            android:layout_width="match_parent"
            android:text="Result"
            android:gravity="center"
            android:textSize="30dp"
            android:layout_height="wrap_content" /> 


3. Open **MainActivity.java** and make the following changes</br>

          public class MainActivity extends AppCompatActivity {
              EditText Num1, Num2;
              TextView Result;
              Button Add, Sub, Mul, Div;
              int NUM1, NUM2;

              @Override
              protected void onCreate(Bundle savedInstanceState) {
                  super.onCreate(savedInstanceState);
                  setContentView(R.layout.activity_main);

                  Num1 = (EditText)findViewById(R.id.num1);
                  Num2 = (EditText)findViewById(R.id.num2);
                  Result = (TextView)findViewById(R.id.result);
                  Add = (Button)findViewById(R.id.add);
                  Sub = (Button)findViewById(R.id.sub);
                  Mul = (Button)findViewById(R.id.mul);
                  Div = (Button)findViewById(R.id.div);

                  Add.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          NUM1 = Integer.parseInt(Num1.getText().toString());
                          NUM2 = Integer.parseInt(Num2.getText().toString());
                          Result.setText(Integer.toString(NUM1+NUM2));
                      }
                  });

                  Sub.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          NUM1 = Integer.parseInt(Num1.getText().toString());
                          NUM2 = Integer.parseInt(Num2.getText().toString());
                          Result.setText(Integer.toString(NUM1-NUM2));
                      }
                  });

                  Mul.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          NUM1 = Integer.parseInt(Num1.getText().toString());
                          NUM2 = Integer.parseInt(Num2.getText().toString());
                          Result.setText(Integer.toString(NUM1*NUM2));
                      }
                  });

                  Div.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          NUM1 = Integer.parseInt(Num1.getText().toString());
                          NUM2 = Integer.parseInt(Num2.getText().toString());
                          Result.setText(Integer.toString(NUM1/NUM2));
                      }
                  });
              }
          }
          
 4. **Run** the app.
 </br></br>
 
 


**Note:- App Will Crash if Num1 or Num2 is empty, Currently our app is not caple to handle this cases.**
# Thank You!
Dev:- **Ankesh Gaikwad**
      
