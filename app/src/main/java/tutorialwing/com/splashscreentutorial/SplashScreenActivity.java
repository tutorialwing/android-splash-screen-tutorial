package tutorialwing.com.splashscreentutorial;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_splash);

		// Start Http Network call
		new GetOrFetchData().execute();
	}

	/**
	 * Async Task to make HTTP calls.
	 */
	private class GetOrFetchData extends AsyncTask<Void, Void, Void> {

		@Override
		protected void onPreExecute() {
			super.onPreExecute();

			// This is called before sending actual HTTP call...
		}

		@Override
		protected Void doInBackground(Void... arg0) {

			// Write the code here to make HTTP calls....
			// For the sake of simplicity of the post, I am only mentioning what to write here and not the actual code.
			// Once your HTTP calls are complete, onPostExecute method will be called with the intended result.
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			super.onPostExecute(result);

			// This method will be called after completion of HTTP call. So, Retrieve the intended data
			// and start the main activity. You can also pass this data to main activity using putExtra or
			// some similar methods.
			// Make sure you close this activity after starting MainActivity.


			// Start MainActivity...
			Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);
//			i.putExtra("key1", value1);
//			i.putExtra("key2", value2);
			startActivity(i);

			// Close This Activity
			finish();
		}

	}
}
