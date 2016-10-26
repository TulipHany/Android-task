# Android-task
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation= "vertical">

    <TextView
        android:text="Name"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/textView4" />

    <EditText
        android:layout_width="315dp"
        android:layout_height="wrap_content"
        android:inputType="textPersonName"
        android:ems="10"
        android:id="@+id/TFname" />

    <TextView
        android:text="Email Address"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/textView5" />

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="textEmailAddress"
        android:ems="10"
        android:id="@+id/TFemailaddress" />

    <TextView
        android:text="Username"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/textView6" />

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="textPersonName"
        android:ems="10"
        android:id="@+id/TFusername1" />

    <TextView
        android:text="Password"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/textView7" />

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="textPassword"
        android:ems="10"
        android:id="@+id/TFpassword" />

    <TextView
        android:text="Confirm Password"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/textView8" />

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="textPassword"
        android:ems="10"
        android:id="@+id/TFconfirmpassword" />

    <Button
        android:text="Sign Up"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/Bsignupbutton"
        android:onClick="onSignUpClick" />

</LinearLayout>
