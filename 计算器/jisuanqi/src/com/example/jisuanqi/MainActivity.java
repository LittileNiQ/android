package com.example.jisuanqi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends Activity  implements OnClickListener{
	 private Button Button1=null;
     private Button Button2=null;
     private Button Button3=null;
     private Button Button4=null;
     private Button Button5=null;
     private Button Button6=null;
     private Button Button7=null;
     private Button Button8=null;
     private Button Button9=null;
     private Button Button0=null;
     private Button Buttonjia=null;
     private Button Buttonjian=null;
     private Button Buttoncheng=null;
     private Button Buttonchu=null;
     private Button Buttondeng=null;
     //private Button Buttonkuo1;
   //  private Button Buttonkuo2;
     private Button Buttonqingchu=null;
     private TextView mTextView=null;
     boolean isClickEqu=false;//判断是否按了“=”按钮
     double num1=0,num2=0;//声明两个参数。接收tvResult前后的值
     double Result=0;//计算结果
     int op=0;//判断操作数，
     
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button1=(Button)this.findViewById(R.id.button1);  
        Button2=(Button)this.findViewById(R.id.button2);       
        Button3=(Button)this.findViewById(R.id.button3);  
        Button4=(Button)this.findViewById(R.id.button4); 
        Button5=(Button)this.findViewById(R.id.button5);  
        Button6=(Button)this.findViewById(R.id.button6); 
        Button7=(Button)this.findViewById(R.id.button7);  
        Button8=(Button)this.findViewById(R.id.button8); 
        Button9=(Button)this.findViewById(R.id.button9);  
        Button0=(Button)this.findViewById(R.id.button0); //数字按钮
        
        Buttonjia=(Button)this.findViewById(R.id.buttonjia);  
        Buttonjian=(Button)this.findViewById(R.id.buttonjian);       
        Buttoncheng=(Button)this.findViewById(R.id.buttoncheng);  
        Buttonchu=(Button)this.findViewById(R.id.buttonchu); 
        Buttondeng=(Button)this.findViewById(R.id.buttondeng);  
    //    Buttonkuo1=(Button)this.findViewById(R.id.buttonkuo1);  
        Buttonqingchu=(Button)this.findViewById(R.id.buttonqingchu); 
     //   Buttonkuo2=(Button)this.findViewById(R.id.buttonkuo2);//功能按钮
      
        mTextView=(TextView)this.findViewById(R.id.tv1);//显示器
       
        //设置监听
        Button1.setOnClickListener(this);
        Button2.setOnClickListener(this);

        Button3.setOnClickListener(this);
        Button4.setOnClickListener(this);
        Button5.setOnClickListener(this);
        Button6.setOnClickListener(this);
        Button7.setOnClickListener(this);
        Button8.setOnClickListener(this);
        Button9.setOnClickListener(this);
        Button0.setOnClickListener(this);
        Buttonjia.setOnClickListener(this);
        Buttonjian.setOnClickListener(this);
        Buttoncheng.setOnClickListener(this);
        Buttonchu.setOnClickListener(this);
        Buttondeng.setOnClickListener(this);
        Buttonqingchu.setOnClickListener(this);
        mTextView.setOnClickListener(this);
    }
        @Override
		public void onClick(View v) {
        	String a;
			// TODO Auto-generated method stub
			switch (v.getId()) {
			//-------------0-9数字键-----------
			case R.id.button0:
		    if(isClickEqu)
            {
		    	mTextView.setText(null);
                isClickEqu=false;
            }
			String mystring=mTextView.getText().toString();
			//mystring+="0"; 
			mTextView.setText(mystring);
			break;
			case R.id.button1:
		    if(isClickEqu)
            {
		    	mTextView.setText(null);
                isClickEqu=false;
            }
			String mystring1=mTextView.getText().toString();
			//mystring1+="1"; 
			mTextView.setText(mystring1+"1");
			break;
			case R.id.button2:
		    if(isClickEqu)
            {
		    	mTextView.setText(null);
                isClickEqu=false;
            }
			String mystring2=mTextView.getText().toString();
			//mystring2+="2"; 
			mTextView.setText(mystring2+"2");
			break;
			case R.id.button3:
		    if(isClickEqu)
            {
		    	mTextView.setText(null);
                isClickEqu=false;
            }
			String mystring3=mTextView.getText().toString();
			//mystring3+="3";
			mTextView.setText(mystring3+"3");
			break;
			case R.id.button4:
			if(isClickEqu)
            {
		    	mTextView.setText(null);
                isClickEqu=false;
            }
			String mystring4=mTextView.getText().toString();
			//mystring4+="4";
			mTextView.setText(mystring4+"4");
			break;
			case R.id.button5:
			if(isClickEqu)
            {
		    	mTextView.setText(null);
                isClickEqu=false;
            }
			String mystring5=mTextView.getText().toString();
			//mystring5+="5";
			mTextView.setText(mystring5+"5");
			break;
			case R.id.button6:
			if(isClickEqu)
            {
		    	mTextView.setText(null);
                isClickEqu=false;
            }
			String mystring6=mTextView.getText().toString();
			//mystring6+="6";
			mTextView.setText(mystring6+"6");
			break;
			case R.id.button7:
			if(isClickEqu)
            {
		    	mTextView.setText(null);
                isClickEqu=false;
            }
			String mystring7=mTextView.getText().toString();
			//mystring7+="7";
			mTextView.setText(mystring7+"7");
			break;
			case R.id.button8:
			if(isClickEqu)
            {
		    	mTextView.setText(null);
                isClickEqu=false;
            }
			String mystring8=mTextView.getText().toString();
			//mystring8+="8";
			mTextView.setText(mystring8+"8");
			break;
			case R.id.button9:
			if(isClickEqu)
            {
		    	mTextView.setText(null);
                isClickEqu=false;
            }
			String mystring9=mTextView.getText().toString();
		//	mystring9+="9";
			mTextView.setText(mystring9+"9");
			break;
			//--------------button+-*/=------------------
			case R.id.buttonjia:
			     String myStringAdd=mTextView.getText().toString();
			     if(myStringAdd.equals(null))
		            {
		                return;
		            }
			        num1=Double.valueOf(myStringAdd);
			        mTextView.setText(null);
		            op=1;
		            isClickEqu=false;
		           // myStringAdd+="+";
		            mTextView.setText(myStringAdd+"+");
		            break;
			    case R.id.buttonjian:
				String myStringSub=mTextView.getText().toString();
			     if(myStringSub.equals(null))
		            {
		                return;
		            }
			     num1=Double.valueOf(myStringSub);
			        mTextView.setText(null);
		            op=2;
		            isClickEqu=false;
		          //  myStringSub+="-";
		            mTextView.setText(myStringSub+"-");
		            break;
			 case R.id.buttoncheng:
				 String myStringMul=mTextView.getText().toString();
			     if(myStringMul.equals(null))
		            {
		                return;
		            }
			     num1=Double.valueOf(myStringMul);
			        mTextView.setText(null);
		            op=3;
		            isClickEqu=false;
		           // myStringMul+="*";
		            mTextView.setText(myStringMul+"*");
		            break;
			 case R.id.buttonchu:
				String myStringDiv=mTextView.getText().toString();
			     if(myStringDiv.equals(null))
		            {
		                return;
		            }
			     num1=Double.valueOf(myStringDiv);
			        mTextView.setText(null);
		            op=4;
		            isClickEqu=false;
		            //myStringDiv+="/";
			        mTextView.setText(myStringDiv+"/");
		            break;
			 case R.id.buttonqingchu:
				mTextView.setText(null);
	            break;
			 case R.id.buttondeng:
				String myStringEqu=mTextView.getText().toString();
				int i;
				for( i=0;i<myStringEqu.length();i++)
				{
				   char  item =  myStringEqu.charAt(i);
				   if(item=='-')
				     break;
				    if(item=='+')
					   break;
				     if(item=='/')
					   break;
				    if(item=='*')
					  break;
				}
				String l=myStringEqu.substring(i+1,myStringEqu.length());
	            if(myStringEqu.equals(null))
	            {
	                return;
	            }
	            num2=Double.valueOf(l.toString());
	            mTextView.setText(null);
			 case R.id.buttonkuo2:
			 case R.id.buttonkuo1:
			 switch (op) {
	            case 0:
	                Result=num2;
	                break;
	            case 1:
	                Result=num1+num2;
	                break;
	            case 2:
	                Result=num1-num2;
	                break;
	            case 3:
	                Result=num1*num2;
	                break;
	            case 4:
	                Result=num1/num2;
	                break;
	            default:
	                Result=0;
	                break;
	            }
			    mTextView.setText(String.valueOf(Result));
	            isClickEqu=true;
	            break;
	        default:
	            break;
		}
    }

 }

