# persianradiogroup
A custom radio group for handling radio buttons in android
If you use native android RadioGroup class for radio buttons with Persian text, you will have some problem in arranging them.
By using PersianRadioGroup, you can layout radio buttons separated (not inside of a RadioGroup view) and then add them to an object of PersianRadioGroup programmatically. You will need to use PersianRadioGroupListener to set a listener for radio buttons. 
here is an example of how to use PersianRadioGroup and PersianRadioGroupListener: 

RadioButton rb1 = (RadioButton) findViewById(R.id.rb1);
RadioButton rb2 = (RadioButton) findViewById(R.id.rb2);
RadioButton rb3 = (RadioButton) findViewById(R.id.rb3);
List<RadioButton> radioList = new ArrayList<RadioButton>();
radioList.add(rb1);
radioList.add(rb2);
radioList.add(rb3);

final PersianRadioGroup prg = new PersianRadioGroup(radioList, this);
prg.setPersianListener(new PersianRadioGroupListener() {
			
	@Override
	public void onClick(View v) {
		Log.d("option",prg.getSelectedButton().getText().toString());
	}
});
		
