import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;
import java.util.*;

/**
 * Created by akuma on 1/20/17.
 */
public class BYUITweet {
    private User _user;
    String _text;

    public User get_user() {
        return _user;
    }

    public void set_user(User _user) {
        this._user = _user;
    }

    public String get_text() {
        return _text;
    }

    public void set_text(String _text) {
        this._text = _text;
    }

    public static void main(String[] args) throws TwitterException {
        ConfigurationBuilder cb = new ConfigurationBuilder();

        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("r28jY50pAhNjkaxxJKMe7GmZC")
                .setOAuthConsumerSecret("PTpzJtZ5WBznlMoTR4dc8a6xHjurBOwl5isBXOP3dfOqgrDwww")
                .setOAuthAccessToken("821615209953554432-NaAipS1JcFJvY56eDnVa53ih5DnW7Px")
                .setOAuthAccessTokenSecret("2j9tEqbFWYJPoVOgj6uEKsOwR270JgBKCe6LUcHXOnyas")
                .setJSONStoreEnabled(true);

        TwitterFactory tf = new TwitterFactory(cb.build());
        twitter4j.Twitter twitter = tf.getInstance();

        /*****************************************************************/
        Query query = new Query("#byui");
        QueryResult result = twitter.search(query);
        result.get(query);

        List<Status> status = result.get(query);
        for(Status s:status) {
            System.out.println(s.getUser().getTweets());
        }






        }


}




























