package com.example.masoudhababah.assignment2;



import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends Activity {

        private boolean status =true;
        private  int MemoryValue=0;
        @Override
        protected void onStart() {
            super.onStart();

            Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }


        public void Number_0(View v){
            TextView editText=(TextView)findViewById(R.id.EditText);
            if(status==true)
                editText.setText(editText.getText().toString()+"0");
            else {
                editText.setText("0");
                status=true;
            }
        }
        public void Number_1(View v){
        TextView editText=(TextView)findViewById(R.id.EditText);
        if(status==true)
            editText.setText(editText.getText().toString()+"1");
        else {
            editText.setText("1");
            status=true;
        }    }
        public void Number_2(View v){
        TextView editText=(TextView)findViewById(R.id.EditText);
        if(status==true)
            editText.setText(editText.getText().toString()+"2");
        else {
            editText.setText("2");
            status=true;
        }    }
        public void Number_3(View v){
        TextView editText=(TextView)findViewById(R.id.EditText);
        if(status==true)
            editText.setText(editText.getText().toString()+"3");
        else {
            editText.setText("3");
            status=true;
        }
    }
        public void Number_4(View v){
        TextView editText=(TextView)findViewById(R.id.EditText);
        if(status==true)
            editText.setText(editText.getText().toString()+"4");
        else {
            editText.setText("4");
            status=true;
        }    }
        public void Number_5(View v){
        TextView editText=(TextView)findViewById(R.id.EditText);
        if(status==true)
            editText.setText(editText.getText().toString()+"5");
        else {
            editText.setText("5");
            status=true;
        }    }
        public void Number_6(View v){
        TextView editText=(TextView)findViewById(R.id.EditText);
        if(status==true)
            editText.setText(editText.getText().toString()+"6");
        else {
            editText.setText("6");
            status=true;
        }    }
        public void Number_7(View v){
        TextView editText=(TextView)findViewById(R.id.EditText);
        if(status==true)
            editText.setText(editText.getText().toString()+"7");
        else {
            editText.setText("7");
            status=true;
        }
    }
        public void Number_8 (View v){
        TextView editText=(TextView)findViewById(R.id.EditText);
        if(status==true)
            editText.setText(editText.getText().toString()+"8");
        else {
            editText.setText("8");
            status=true;
        }    }
        public void Number_9(View v){
        TextView editText=(TextView)findViewById(R.id.EditText);
        if(status==true)
            editText.setText(editText.getText().toString()+"9");
        else {
            editText.setText("9");
            status=true;
        }    }



        public void  N (View v){

            TextView editText= (TextView) findViewById(R.id.EditText);
            Double value = Double.parseDouble(editText.getText().toString());
            if(editText.getText().toString().length()==0){
                Toast.makeText(this,"Please Enter Number",Toast.LENGTH_SHORT).show();
            }
            else {



                if (value > 0) {
                    editText.setText(value * -1 + "");
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        }
        public void Div(View v){
            Button div= (Button) findViewById(R.id.div);
            TextView editText=(TextView)findViewById(R.id.EditText);
            if(editText.getText().toString().length()==0)
            {

            }
            else{
                if (editText.getText().toString().charAt(editText.getText().toString().length() - 1) == '*' || editText.getText().toString().charAt(editText.getText().toString().length() - 1) == '-' || editText.getText().toString().charAt(editText.getText().toString().length() - 1) == '+' || editText.getText().toString().charAt(editText.getText().toString().length() - 1) == '/')
                    editText.setText(editText.getText().toString().substring(0, editText.getText().toString().length() - 1) + div.getText().toString());
                else
                    editText.setText(editText.getText().toString() + div.getText().toString());
            }
        }
        public void Multi(View v) {
            Button multi = (Button) findViewById(R.id.multi);
            TextView editText = (TextView) findViewById(R.id.EditText);
            if (editText.getText().toString().length() == 0) {

            } else {
                if (editText.getText().toString().charAt(editText.getText().toString().length() - 1) == '*' || editText.getText().toString().charAt(editText.getText().toString().length() - 1) == '-' || editText.getText().toString().charAt(editText.getText().toString().length() - 1) == '+' || editText.getText().toString().charAt(editText.getText().toString().length() - 1) == '/')
                    editText.setText(editText.getText().toString().substring(0, editText.getText().toString().length() - 1) + multi.getText().toString());
                else
                    editText.setText(editText.getText().toString() + multi.getText().toString());
            }
        }
        public void Sub (View v) {
            Button sub = (Button) findViewById(R.id.sub);
            TextView editText = (TextView) findViewById(R.id.EditText);
            if (editText.getText().toString().length() == 0) {

            } else {
                if (editText.getText().toString().charAt(editText.getText().toString().length() - 1) == '*' || editText.getText().toString().charAt(editText.getText().toString().length() - 1) == '-' || editText.getText().toString().charAt(editText.getText().toString().length() - 1) == '+' || editText.getText().toString().charAt(editText.getText().toString().length() - 1) == '/')
                    editText.setText(editText.getText().toString().substring(0, editText.getText().toString().length() - 1) + sub.getText().toString());
                else
                    editText.setText(editText.getText().toString() + sub.getText().toString());
            }
        }
        public void Add(View v){
            Button add= (Button) findViewById(R.id.add);
            TextView editText=(TextView)findViewById(R.id.EditText);
            if(editText.getText().toString().length()==0)
            {

            }else{
                if(editText.getText().toString().charAt(editText.getText().toString().length()-1)=='*' ||editText.getText().toString().charAt(editText.getText().toString().length()-1)=='-' || editText.getText().toString().charAt(editText.getText().toString().length()-1)=='+'||editText.getText().toString().charAt(editText.getText().toString().length()-1)=='/')
                    editText.setText(editText.getText().toString().substring(0,editText.getText().toString().length()-1)+add.getText().toString());
                else
                    editText.setText(editText.getText().toString()+add.getText().toString());
            }}
        public void Equal (View v) {
            TextView editText = (TextView) findViewById(R.id.EditText);
            String s = editText.getText().toString();
            Stack stack = new Stack();
            if (s.length()>0) {
                if (stack.check(s)) {
                    editText.setText(stack.toResult(stack.changeFromInfixToPostfi(s)));
                    status=false;
                }

            }
        }
        public void Back(View v){
            TextView editText= (TextView) findViewById(R.id.EditText);
            if(editText.getText().toString().length()<=0){
                editText.setText("");
            }
            else
                editText.setText(editText.getText().toString().substring(0,editText.getText().toString().length()-1));
        }
        public void M (View v) {
            TextView editText = (TextView) findViewById(R.id.EditText);

            if (editText.getText().toString().length() == 0) {
                Toast.makeText(this, "Please Enter Number ", Toast.LENGTH_SHORT).show();
            }

            else

                MemoryValue = Integer.parseInt(editText.getText().toString());
                editText.setText("");
                Toast.makeText(this, "value used later = " + MemoryValue, Toast.LENGTH_SHORT).show();
            }
        public void C (View v){
        TextView editText=(TextView)findViewById(R.id.EditText);
        editText.setText("");
    }
        public void MR (View v){
        Stack stack=new Stack();
        TextView editText= (TextView) findViewById(R.id.EditText);
        editText.setText(stack.toResult(editText.getText().toString() + MemoryValue));


    }
        public void MC (View v){
        MemoryValue=0;
        Toast.makeText(this,"Memory Clean",Toast.LENGTH_SHORT).show();
    }




        @Override
        protected void onDestroy() {
            super.onDestroy();
            Toast.makeText(this,"Bye Bye ",Toast.LENGTH_SHORT).show();
        }



    public boolean isDouble(String str){


        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}

