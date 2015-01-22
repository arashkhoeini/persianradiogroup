package com.zoraq.utils;

import java.util.List;

import com.zoraq.interfaces.PersianRadioGroupListener;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;

public class PersianRadioGroup implements OnClickListener {
	
	List<RadioButton> radios;
	RadioButton selectedButton;
	Activity activity;
	PersianRadioGroupListener persianListener;
	
	public PersianRadioGroup(List<RadioButton> radios,Activity activity){
		this.radios = radios;
		this.activity = activity;
		for(RadioButton rb:radios){
			rb.setOnClickListener(this);
		}
	}
	public PersianRadioGroup(List<RadioButton> radios,Activity activity,PersianRadioGroupListener prgl){
		this.radios = radios;
		this.activity = activity;
		this.persianListener = prgl;
		for(RadioButton rb:radios){
			rb.setOnClickListener(this);
		}
	}
	public void setPersianListener(PersianRadioGroupListener persianListener) {
		this.persianListener = persianListener;
	}
	
	public boolean isAnyButtonSelected(){
		for(RadioButton rb: radios){
			if(rb.isSelected()){
				return true;
			}
		}
		return false;
	}
	public RadioButton getSelectedButton() {
		return selectedButton;
	}

	@Override
	public void onClick(View v) {
		selectedButton = (RadioButton) activity.findViewById(v.getId());
		for(RadioButton rb:radios){
			if(rb != selectedButton){
				rb.setChecked(false);
			}
		}
		persianListener.onClick(v);
	}


}
