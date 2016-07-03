package techkids.mad3.demoimportdbanduse;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by TrungNT on 7/3/2016.
 */
public class DatabaseOpenHelper extends SQLiteAssetHelper {
    public DatabaseOpenHelper(Context context) {
        super(context, Helpers.DATABASE_NAME, null, Helpers.DATABASE_VERSION);
    }
}
