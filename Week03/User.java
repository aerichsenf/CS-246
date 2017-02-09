import com.google.gson.annotations.SerializedName;

/**
 * Created by akuma on 1/20/17.
 */
public class User {
    private String _name;
    @SerializedName("followers_count")
    private int followers;

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }
}
