package tutorialwing.com.splashscreentutorial;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashScreenActivity2 extends AppCompatActivity {

	// Splash screen timer
	private static int TIME_OUT = 3000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_splash);

		new Handler().postDelayed(new Runnable() {

            /*
			 * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

			@Override
			public void run() {
				// This method will be executed once the timer is over
				// Start your app main activity
				Intent i = new Intent(SplashScreenActivity2.this, MainActivity.class);
				startActivity(i);

				// Close this activity
				finish();
			}
		}, TIME_OUT);
	}
}
