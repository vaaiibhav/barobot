package com.barobot;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TabHost;
import android.widget.ToggleButton;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.TabHost.TabContentFactory;

public class DebugWindow extends Activity {

	TextView tvAdcvalue;
	private static DebugWindow instance;
	SeekBar sbAdcValue;
    private ListView mConversationView;
    ArrayAdapter<String> mConversationArrayAdapter;

	public View getObject(String namespace, String mDrawableName) {
		int resID = getResources().getIdentifier(mDrawableName, namespace,
				getPackageName());
		return findViewById(resID);
	}

	public int getResource(String namespace, String mDrawableName) {
		int resID = getResources().getIdentifier(mDrawableName, namespace,
				getPackageName());
		return resID;
	}

	public static DebugWindow getInstance() {
		return instance;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		instance = this;
		super.onCreate(savedInstanceState);

		// Setup the window
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.debug);

		// Set result CANCELED in case the user backs out
		setResult(Activity.RESULT_CANCELED);

		TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);
		tabHost.setup();
		final TabWidget tabWidget = tabHost.getTabWidget();
		final FrameLayout tabContent = tabHost.getTabContentView();
		// Get the original tab textviews and remove them from the viewgroup.
		
		Constant.log(Constant.TAG,"TAB JEST:"+ tabWidget.getTabCount());

		TextView[] originalTextViews = new TextView[tabWidget.getTabCount()];
		for (int index = 0; index < tabWidget.getTabCount(); index++) {
			originalTextViews[index] = (TextView) tabWidget
					.getChildTabViewAt(index);
		}
		tabWidget.removeAllViews();
		// Ensure that all tab content childs are not visible at startup.
		for (int index = 0; index < tabContent.getChildCount(); index++) {
			Constant.log(Constant.TAG,"TAB index:"+ index);
			tabContent.getChildAt(index).setVisibility(View.GONE);
		}
		// Create the tabspec based on the textview childs in the xml file.
		// Or create simple tabspec instances in any other way...
		for (int index = 0; index < originalTextViews.length; index++) {
			final TextView tabWidgetTextView = originalTextViews[index];
			final View tabContentView = tabContent.getChildAt(index);
			TabSpec tabSpec = tabHost.newTabSpec((String) tabWidgetTextView
					.getTag());
			tabSpec.setContent(new TabContentFactory() {
				@Override
				public View createTabContent(String tag) {
					return tabContentView;
				}
			});
			if (tabWidgetTextView.getBackground() == null) {
				tabSpec.setIndicator(tabWidgetTextView.getText());
			} else {
				tabSpec.setIndicator(tabWidgetTextView.getText(),
						tabWidgetTextView.getBackground());
			}
			Constant.log(Constant.TAG,"TAB:"+ tabSpec.getTag());
			tabHost.addTab(tabSpec);
		}
		tabHost.setCurrentTab(0);
		tabHost.bringToFront();
		tabHost.setEnabled(true);
		
		button_click bc = new button_click();
		button_toggle bt = new button_toggle();
		button_zajedz bz = new button_zajedz();

		int[] buttons = {
				R.id.kalibrujx,
				R.id.kalibrujy,
				R.id.kalibrujz,
				
				R.id.length_x,
				R.id.length_x2,
				R.id.length_y,
				R.id.length_y2,
				R.id.max_x,
				R.id.min_x,		
				R.id.max_y,
				R.id.min_y,
				R.id.max_z,
				R.id.min_z,			
				R.id.machajx,
				R.id.machajy,
				R.id.machajz,
				R.id.losujx,
				R.id.losujy,
				R.id.losujz,
				R.id.set_x1000,
				R.id.set_x100,
				R.id.set_x10,
				R.id.set_x_1,
				R.id.set_x_1000,
				R.id.set_x_100,
				R.id.set_x_10,
				R.id.set_y_600,
				R.id.set_y_100,
				R.id.set_y_10,
				R.id.set_y_0,
				R.id.set_y10,
				R.id.set_y100,
				R.id.set_y600,
				R.id.glweight,
				R.id.bottweight,
				R.id.fill5000};
		for(int i =0; i<buttons.length;i++){
			Button xb1 = (Button) findViewById(buttons[i]);
			xb1.setOnClickListener(bc);			
		}

		int[] togglers = {
				R.id.wagi_live,
				R.id.led1,
				R.id.led2,
				R.id.led3,
				R.id.led4,
				R.id.led5,
				R.id.led6,
				R.id.led7,
				R.id.led8,
				R.id.led9,
				R.id.led10};
		for(int i =0; i<togglers.length;i++){
			Button xb1 = (Button) findViewById(togglers[i]);
			xb1.setOnClickListener(bt);			
		}

		int[] nalejs = {
				R.id.nalej1,
				R.id.nalej2,
				R.id.nalej3,
				R.id.nalej4,
				R.id.nalej5,
				R.id.nalej6,
				R.id.nalej7,
				R.id.nalej8,
				R.id.nalej9,
				R.id.nalej10,
				R.id.nalej11,
				R.id.nalej12,
				R.id.nalej13,
				R.id.nalej14,
				R.id.nalej15,
				R.id.nalej16};
		
		for(int i =0; i<nalejs.length;i++){
			Button xb1 = (Button) findViewById(nalejs[i]);
			xb1.setOnClickListener(bz);			
		}

		int[] wagi = {R.id.waga1,
				R.id.waga2,
				R.id.waga3,
				R.id.waga4,
				R.id.waga5,
				R.id.waga6,
				R.id.waga7,
				R.id.waga8,
				R.id.waga9,
				R.id.waga10,
				R.id.waga11,
				R.id.waga12,
				R.id.waga13,
				R.id.waga14,
				R.id.waga15,
				R.id.waga16};
/*
		OnClickListener list1 = new OnClickListener() {
		    @Override
		    public void onClick(View v) {
		    	 queue.getInstance().send("GET WEIGHT");
		    }
		};*/
		for(int i =0; i<wagi.length;i++){
			TextView waga1 = (TextView) findViewById(wagi[i]);
		//	waga1.setOnClickListener( list1 );			
			waga1.setText("init");
		}

	    // Array adapter for the conversation thread
	    // String buffer for outgoing messages
        // Initialize the array adapter for the conversation thread
        mConversationArrayAdapter = new ArrayAdapter<String>(this, R.layout.message);
        mConversationView = (ListView) findViewById(R.id.history_list);
        mConversationView.setAdapter(mConversationArrayAdapter);
	}

	public void addToList(final String string, final boolean direction ) {
		final DebugWindow parent = this;
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				if(direction){	// true = na zewnątrz
					parent.mConversationArrayAdapter.add("<-" +  string.trim() );
				}else{
					parent.mConversationArrayAdapter.add("->" +  string.trim() );
				}
			}
		});	
	}

	public void clearList() {
		final DebugWindow parent = this;
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				parent.mConversationArrayAdapter.clear();
			}
		});	
	}

	
	@Override
	public void onBackPressed() {
		// super.onBackPressed(); Do not call me!
		// Set result CANCELED in case the user backs out
		setResult(Activity.RESULT_CANCELED);
		this.finish();
	}

	// Any update to UI can not be carried out in a non UI thread like the one
	// used
	// for Server. Hence runOnUIThread is used.
	public void setText(final int target, final String result) {
		if (result != null) {
			runOnUiThread(new Runnable() {
				@Override
				public void run() {
					TextView text_field = (TextView) findViewById(target);
					if (text_field != null) {
						text_field.setText(result);
					}
				}
			});
		}
	}
	public void setChecked(final int target, final boolean equals) {
		// 	if (result != null) {
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				ToggleButton tb			= (ToggleButton) findViewById(target);
				if (tb != null) {
					tb.setChecked(equals);
				}
			}
		});
	}

	public static void showToast(String string) {
		Toast.makeText(DebugWindow.getInstance(), R.string.not_connected,
				Toast.LENGTH_SHORT).show();
	}

}
