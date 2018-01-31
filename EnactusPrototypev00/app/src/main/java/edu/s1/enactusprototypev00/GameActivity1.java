package edu.s1.enactusprototypev00;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GameActivity1 extends YouTubeBaseActivity
        implements NavigationView.OnNavigationItemSelectedListener, YouTubePlayer.OnInitializedListener {

    //Youtube player member variables
    //Youtube implementation from https://www.sitepoint.com/using-the-youtube-api-to-embed-video-in-an-android-app/
    private static final int RECOVERY_REQUEST = 1;
    private YouTubePlayerView youTubePlayerView;
    private YouTubePlayer player;

    //For alert dialogFragments
    private int mAnswerSelected = -1;
    AlertDialog.Builder myAlertBuilder;

    //Next question Button
    ImageButton mNextQuestionBtn;

    //Database Variables
    TextView mGame1QuestionTitleTV;
    TextView mGame1QuestionTextTV;
    TextView progressTextView;
    RadioButton mGame1Answer1;
    RadioButton mGame1Answer2;
    RadioButton mGame1Answer3;
    RadioButton mGame1Answer4;

    String msg = "";
    String questionText;
    String questionAnswer1;
    String questionAnswer2;
    String questionAnswer3;
    String questionAnswer4;

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://" +
            DbStrings.DATABASE_URL + "/" +
            DbStrings.DATABASE_NAME;

    //Database PKs
    int questionID = 2;
    int questionContentID = 1;

    //from onCreate
    GetData retrieveData = new GetData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //YoutubePlayerView code
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.game1YoutubeView);
        youTubePlayerView.initialize(Config.YOUTUBE_API_KEY, this);

        myAlertBuilder = new AlertDialog.Builder(this);

        mNextQuestionBtn = (ImageButton) findViewById(R.id.game1NextQuestionBtn);
        mGame1QuestionTitleTV = (TextView) findViewById(R.id.game1QuestionTitleTV);
        mGame1QuestionTextTV = (TextView) findViewById(R.id.game1QuestionTextTV);
        progressTextView = (TextView) findViewById(R.id.progressTextView);
        mGame1Answer1 = (RadioButton) findViewById(R.id.game1Answer1);
        mGame1Answer2 = (RadioButton) findViewById(R.id.game1Answer2);
        mGame1Answer3 = (RadioButton) findViewById(R.id.game1Answer3);
        mGame1Answer4 = (RadioButton) findViewById(R.id.game1Answer4);

        //Database execution
        GetData retrieveData = new GetData();
        retrieveData.execute("");


        /*
        //VideoView code

        VideoView videoView = (VideoView) findViewById(R.id.game1YoutubeView);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        Uri uri = Uri.parse("");

        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.start();
        */
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.game_activity1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

            Intent goToModule1Hub = new Intent(this, Module1HubActivity.class);
            startActivity(goToModule1Hub);

        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

        this.player = youTubePlayer;

        if (!b) {
            //player.cueVideo("6ZfuNTqbHE8");
        }

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

        if (youTubeInitializationResult.isUserRecoverableError()) {

            youTubeInitializationResult.getErrorDialog(this, RECOVERY_REQUEST).show();

        } else {

            String error = String.format(getString(R.string.player_error), youTubeInitializationResult.toString());
            Toast.makeText(this, error, Toast.LENGTH_LONG).show();

        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == RECOVERY_REQUEST) {

            getYouTubePlayerProvider().initialize(Config.YOUTUBE_API_KEY, this);

        }

    }

    protected YouTubePlayer.Provider getYouTubePlayerProvider() {

        return youTubePlayerView;

    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {

            case R.id.game1Answer1:
                if (checked) {
                    mAnswerSelected = 1;
                }
                break;

            case R.id.game1Answer2:
                if (checked) {
                    mAnswerSelected = 2;
                }
                break;

            case R.id.game1Answer3:
                if (checked) {
                    mAnswerSelected = 3;
                }
                break;

            case R.id.game1Answer4:
                if (checked) {
                    mAnswerSelected = 4;
                }
                break;

            default:
                break;
        }
    }

    public void game1SubmitAnswer(View view) {

        switch (mAnswerSelected) {

            case 1: {

                myAlertBuilder.setTitle("You selected answer 1");
                myAlertBuilder.setMessage("Feedback");

                myAlertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                myAlertBuilder.show();
                break;

            }

            case 2: {

                myAlertBuilder.setTitle("You selected answer 2");
                myAlertBuilder.setMessage("Feedback");

                myAlertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                myAlertBuilder.show();
                break;

            }

            case 3: {

                myAlertBuilder.setTitle("You selected answer 3");
                myAlertBuilder.setMessage("Feedback");

                myAlertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                myAlertBuilder.show();
                break;

            }


            case 4: {

                myAlertBuilder.setTitle("You selected answer 4");
                myAlertBuilder.setMessage("Feedback");

                myAlertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                myAlertBuilder.show();
                break;

            }

            default: {

                myAlertBuilder.setTitle("");
                myAlertBuilder.setMessage("Please select an answer.");

                myAlertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                myAlertBuilder.show();
                break;

            }

        }

        //db placeholder data
        int dbAnswer = 2;
        if (mAnswerSelected == dbAnswer) {

            mNextQuestionBtn.setVisibility(View.VISIBLE);

        } else {

            mNextQuestionBtn.setVisibility(View.GONE);

        }

    }

    //Next Question Button
    public void game1NextQuestion(View view) {

        //player.cueVideo("2GTI0MHj3dM");
        /*
        mGame1QuestionTitleTV.setText("Question Title 2");
        mGame1QuestionTextTV.setText("Question Text 2");
        mGame1Answer1.setText("New Answer 1");
        mGame1Answer2.setText("New Answer 2");
        mGame1Answer3.setText("New Answer 3");
        mGame1Answer4.setText("New Answer 4");
        */

        questionID++;
        questionContentID++;
        retrieveData.execute("");

    }

    private class GetData extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {

            progressTextView.setText("Connecting to database...");

        }

        @Override
        protected String doInBackground(String... params) {

            Connection conn = null;
            Statement stmt = null;

            try {
                Class.forName(JDBC_DRIVER);
                conn = DriverManager.getConnection(DB_URL, DbStrings.USERNAME, DbStrings.PASSWORD);

                stmt = conn.createStatement();
                String sql = "SELECT * FROM question WHERE questionID = " + questionID;
                //stmt.executeUpdate("INSERT INTO fruits VALUES ('123', 'abc', '2.5')");
                //stmt.executeUpdate("DELETE FROM fruits WHERE id = '123'");
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()) {

                    questionText = rs.getString("questionDescription");

                }

                rs = stmt.executeQuery("SELECT QuestionChoiceA, QuestionChoiceB, QuestionChoiceC, QuestionChoiceD FROM questioncontent where questionID = " + questionContentID);

                while (rs.next()) {

                    questionAnswer1 = rs.getString("QuestionChoiceA");
                    questionAnswer2 = rs.getString("QuestionChoiceB");
                    questionAnswer3 = rs.getString("QuestionChoiceC");
                    questionAnswer4 = rs.getString("QuestionChoiceD");

                }

                msg = "Process complete.";

                rs.close();
                stmt.close();
                conn.close();

            } catch (SQLException connError) {

                msg = "conError";
                connError.printStackTrace();

            } catch (ClassNotFoundException e) {

                msg = "ClassEx";
                e.printStackTrace();

            } finally {

                try {

                    if (stmt != null) {
                        stmt.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                return null;
            }
        }

        @Override
        protected void onPostExecute(String iMsg) {

            progressTextView.setText(msg);
            mGame1QuestionTextTV.setText(questionText);
            mGame1Answer1.setText(questionAnswer1);
            mGame1Answer2.setText(questionAnswer2);
            mGame1Answer3.setText(questionAnswer3);
            mGame1Answer4.setText(questionAnswer4);

            /*
            if (fruitsMap.size() > 0) {

                itemAdapter = new ItemAdapter(thisContext, fruitsMap);
                myListView.setAdapter(itemAdapter);

            }
            */
        }
    }
}
