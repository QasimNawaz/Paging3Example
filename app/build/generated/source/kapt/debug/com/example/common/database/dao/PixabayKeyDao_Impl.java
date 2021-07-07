package com.example.common.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.qasim.paging3example.data.model.PixabayKeys;
import java.lang.Class;
import java.lang.Exception;
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
public final class PixabayKeyDao_Impl implements PixabayKeyDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PixabayKeys> __insertionAdapterOfPixabayKeys;

  private final SharedSQLiteStatement __preparedStmtOfDeleteKeys;

  public PixabayKeyDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPixabayKeys = new EntityInsertionAdapter<PixabayKeys>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `pixaBayKeys` (`id`,`index`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PixabayKeys value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getIndex());
      }
    };
    this.__preparedStmtOfDeleteKeys = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM pixaBayKeys";
        return _query;
      }
    };
  }

  @Override
  public Object savePixabayKeys(final PixabayKeys redditKey, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPixabayKeys.insert(redditKey);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public void deleteKeys() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteKeys.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteKeys.release(_stmt);
    }
  }

  @Override
  public Object getPixabayKeys(final Continuation<? super List<PixabayKeys>> p0) {
    final String _sql = "SELECT * FROM pixaBayKeys ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<PixabayKeys>>() {
      @Override
      public List<PixabayKeys> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfIndex = CursorUtil.getColumnIndexOrThrow(_cursor, "index");
          final List<PixabayKeys> _result = new ArrayList<PixabayKeys>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PixabayKeys _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpIndex;
            _tmpIndex = _cursor.getInt(_cursorIndexOfIndex);
            _item = new PixabayKeys(_tmpId,_tmpIndex);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
