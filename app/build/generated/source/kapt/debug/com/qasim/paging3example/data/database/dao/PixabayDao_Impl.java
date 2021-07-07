package com.qasim.paging3example.data.database.dao;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.qasim.paging3example.data.model.PixabayObj;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class PixabayDao_Impl implements PixabayDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PixabayObj> __insertionAdapterOfPixabayObj;

  private final SharedSQLiteStatement __preparedStmtOfDeletePixbay;

  public PixabayDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPixabayObj = new EntityInsertionAdapter<PixabayObj>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `pixabayList` (`webformatHeight`,`imageWidth`,`previewHeight`,`webformatURL`,`userImageURL`,`previewURL`,`comments`,`type`,`imageHeight`,`tags`,`previewWidth`,`downloads`,`collections`,`user_id`,`largeImageURL`,`pageURL`,`id`,`imageSize`,`webformatWidth`,`user`,`views`,`likes`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PixabayObj value) {
        if (value.getWebformatHeight() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getWebformatHeight());
        }
        if (value.getImageWidth() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getImageWidth());
        }
        if (value.getPreviewHeight() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getPreviewHeight());
        }
        if (value.getWebformatURL() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getWebformatURL());
        }
        if (value.getUserImageURL() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUserImageURL());
        }
        if (value.getPreviewURL() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPreviewURL());
        }
        if (value.getComments() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getComments());
        }
        if (value.getType() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getType());
        }
        if (value.getImageHeight() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getImageHeight());
        }
        if (value.getTags() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getTags());
        }
        if (value.getPreviewWidth() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, value.getPreviewWidth());
        }
        if (value.getDownloads() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, value.getDownloads());
        }
        if (value.getCollections() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, value.getCollections());
        }
        if (value.getUserId() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getUserId());
        }
        if (value.getLargeImageURL() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getLargeImageURL());
        }
        if (value.getPageURL() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getPageURL());
        }
        if (value.getId() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindLong(17, value.getId());
        }
        if (value.getImageSize() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindLong(18, value.getImageSize());
        }
        if (value.getWebformatWidth() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindLong(19, value.getWebformatWidth());
        }
        if (value.getUser() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getUser());
        }
        if (value.getViews() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindLong(21, value.getViews());
        }
        if (value.getLikes() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindLong(22, value.getLikes());
        }
      }
    };
    this.__preparedStmtOfDeletePixbay = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM pixabayList";
        return _query;
      }
    };
  }

  @Override
  public Object savePixabayList(final List<PixabayObj> redditPosts,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPixabayObj.insert(redditPosts);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public void deletePixbay() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeletePixbay.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeletePixbay.release(_stmt);
    }
  }

  @Override
  public PagingSource<Integer, PixabayObj> getPixabayList() {
    final String _sql = "SELECT * FROM pixabayList";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, PixabayObj>() {
      @Override
      public LimitOffsetDataSource<PixabayObj> create() {
        return new LimitOffsetDataSource<PixabayObj>(__db, _statement, false, false , "pixabayList") {
          @Override
          protected List<PixabayObj> convertRows(Cursor cursor) {
            final int _cursorIndexOfWebformatHeight = CursorUtil.getColumnIndexOrThrow(cursor, "webformatHeight");
            final int _cursorIndexOfImageWidth = CursorUtil.getColumnIndexOrThrow(cursor, "imageWidth");
            final int _cursorIndexOfPreviewHeight = CursorUtil.getColumnIndexOrThrow(cursor, "previewHeight");
            final int _cursorIndexOfWebformatURL = CursorUtil.getColumnIndexOrThrow(cursor, "webformatURL");
            final int _cursorIndexOfUserImageURL = CursorUtil.getColumnIndexOrThrow(cursor, "userImageURL");
            final int _cursorIndexOfPreviewURL = CursorUtil.getColumnIndexOrThrow(cursor, "previewURL");
            final int _cursorIndexOfComments = CursorUtil.getColumnIndexOrThrow(cursor, "comments");
            final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(cursor, "type");
            final int _cursorIndexOfImageHeight = CursorUtil.getColumnIndexOrThrow(cursor, "imageHeight");
            final int _cursorIndexOfTags = CursorUtil.getColumnIndexOrThrow(cursor, "tags");
            final int _cursorIndexOfPreviewWidth = CursorUtil.getColumnIndexOrThrow(cursor, "previewWidth");
            final int _cursorIndexOfDownloads = CursorUtil.getColumnIndexOrThrow(cursor, "downloads");
            final int _cursorIndexOfCollections = CursorUtil.getColumnIndexOrThrow(cursor, "collections");
            final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(cursor, "user_id");
            final int _cursorIndexOfLargeImageURL = CursorUtil.getColumnIndexOrThrow(cursor, "largeImageURL");
            final int _cursorIndexOfPageURL = CursorUtil.getColumnIndexOrThrow(cursor, "pageURL");
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final int _cursorIndexOfImageSize = CursorUtil.getColumnIndexOrThrow(cursor, "imageSize");
            final int _cursorIndexOfWebformatWidth = CursorUtil.getColumnIndexOrThrow(cursor, "webformatWidth");
            final int _cursorIndexOfUser = CursorUtil.getColumnIndexOrThrow(cursor, "user");
            final int _cursorIndexOfViews = CursorUtil.getColumnIndexOrThrow(cursor, "views");
            final int _cursorIndexOfLikes = CursorUtil.getColumnIndexOrThrow(cursor, "likes");
            final List<PixabayObj> _res = new ArrayList<PixabayObj>(cursor.getCount());
            while(cursor.moveToNext()) {
              final PixabayObj _item;
              final Integer _tmpWebformatHeight;
              if (cursor.isNull(_cursorIndexOfWebformatHeight)) {
                _tmpWebformatHeight = null;
              } else {
                _tmpWebformatHeight = cursor.getInt(_cursorIndexOfWebformatHeight);
              }
              final Integer _tmpImageWidth;
              if (cursor.isNull(_cursorIndexOfImageWidth)) {
                _tmpImageWidth = null;
              } else {
                _tmpImageWidth = cursor.getInt(_cursorIndexOfImageWidth);
              }
              final Integer _tmpPreviewHeight;
              if (cursor.isNull(_cursorIndexOfPreviewHeight)) {
                _tmpPreviewHeight = null;
              } else {
                _tmpPreviewHeight = cursor.getInt(_cursorIndexOfPreviewHeight);
              }
              final String _tmpWebformatURL;
              if (cursor.isNull(_cursorIndexOfWebformatURL)) {
                _tmpWebformatURL = null;
              } else {
                _tmpWebformatURL = cursor.getString(_cursorIndexOfWebformatURL);
              }
              final String _tmpUserImageURL;
              if (cursor.isNull(_cursorIndexOfUserImageURL)) {
                _tmpUserImageURL = null;
              } else {
                _tmpUserImageURL = cursor.getString(_cursorIndexOfUserImageURL);
              }
              final String _tmpPreviewURL;
              if (cursor.isNull(_cursorIndexOfPreviewURL)) {
                _tmpPreviewURL = null;
              } else {
                _tmpPreviewURL = cursor.getString(_cursorIndexOfPreviewURL);
              }
              final Integer _tmpComments;
              if (cursor.isNull(_cursorIndexOfComments)) {
                _tmpComments = null;
              } else {
                _tmpComments = cursor.getInt(_cursorIndexOfComments);
              }
              final String _tmpType;
              if (cursor.isNull(_cursorIndexOfType)) {
                _tmpType = null;
              } else {
                _tmpType = cursor.getString(_cursorIndexOfType);
              }
              final Integer _tmpImageHeight;
              if (cursor.isNull(_cursorIndexOfImageHeight)) {
                _tmpImageHeight = null;
              } else {
                _tmpImageHeight = cursor.getInt(_cursorIndexOfImageHeight);
              }
              final String _tmpTags;
              if (cursor.isNull(_cursorIndexOfTags)) {
                _tmpTags = null;
              } else {
                _tmpTags = cursor.getString(_cursorIndexOfTags);
              }
              final Integer _tmpPreviewWidth;
              if (cursor.isNull(_cursorIndexOfPreviewWidth)) {
                _tmpPreviewWidth = null;
              } else {
                _tmpPreviewWidth = cursor.getInt(_cursorIndexOfPreviewWidth);
              }
              final Integer _tmpDownloads;
              if (cursor.isNull(_cursorIndexOfDownloads)) {
                _tmpDownloads = null;
              } else {
                _tmpDownloads = cursor.getInt(_cursorIndexOfDownloads);
              }
              final Integer _tmpCollections;
              if (cursor.isNull(_cursorIndexOfCollections)) {
                _tmpCollections = null;
              } else {
                _tmpCollections = cursor.getInt(_cursorIndexOfCollections);
              }
              final Integer _tmpUserId;
              if (cursor.isNull(_cursorIndexOfUserId)) {
                _tmpUserId = null;
              } else {
                _tmpUserId = cursor.getInt(_cursorIndexOfUserId);
              }
              final String _tmpLargeImageURL;
              if (cursor.isNull(_cursorIndexOfLargeImageURL)) {
                _tmpLargeImageURL = null;
              } else {
                _tmpLargeImageURL = cursor.getString(_cursorIndexOfLargeImageURL);
              }
              final String _tmpPageURL;
              if (cursor.isNull(_cursorIndexOfPageURL)) {
                _tmpPageURL = null;
              } else {
                _tmpPageURL = cursor.getString(_cursorIndexOfPageURL);
              }
              final Integer _tmpId;
              if (cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = cursor.getInt(_cursorIndexOfId);
              }
              final Integer _tmpImageSize;
              if (cursor.isNull(_cursorIndexOfImageSize)) {
                _tmpImageSize = null;
              } else {
                _tmpImageSize = cursor.getInt(_cursorIndexOfImageSize);
              }
              final Integer _tmpWebformatWidth;
              if (cursor.isNull(_cursorIndexOfWebformatWidth)) {
                _tmpWebformatWidth = null;
              } else {
                _tmpWebformatWidth = cursor.getInt(_cursorIndexOfWebformatWidth);
              }
              final String _tmpUser;
              if (cursor.isNull(_cursorIndexOfUser)) {
                _tmpUser = null;
              } else {
                _tmpUser = cursor.getString(_cursorIndexOfUser);
              }
              final Integer _tmpViews;
              if (cursor.isNull(_cursorIndexOfViews)) {
                _tmpViews = null;
              } else {
                _tmpViews = cursor.getInt(_cursorIndexOfViews);
              }
              final Integer _tmpLikes;
              if (cursor.isNull(_cursorIndexOfLikes)) {
                _tmpLikes = null;
              } else {
                _tmpLikes = cursor.getInt(_cursorIndexOfLikes);
              }
              _item = new PixabayObj(_tmpWebformatHeight,_tmpImageWidth,_tmpPreviewHeight,_tmpWebformatURL,_tmpUserImageURL,_tmpPreviewURL,_tmpComments,_tmpType,_tmpImageHeight,_tmpTags,_tmpPreviewWidth,_tmpDownloads,_tmpCollections,_tmpUserId,_tmpLargeImageURL,_tmpPageURL,_tmpId,_tmpImageSize,_tmpWebformatWidth,_tmpUser,_tmpViews,_tmpLikes);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    }.asPagingSourceFactory().invoke();
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
