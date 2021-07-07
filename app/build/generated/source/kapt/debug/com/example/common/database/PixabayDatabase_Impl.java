package com.example.common.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.common.database.dao.PixabayKeyDao;
import com.example.common.database.dao.PixabayKeyDao_Impl;
import com.qasim.paging3example.data.database.dao.PixabayDao;
import com.qasim.paging3example.data.database.dao.PixabayDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class PixabayDatabase_Impl extends PixabayDatabase {
  private volatile PixabayDao _pixabayDao;

  private volatile PixabayKeyDao _pixabayKeyDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `pixabayList` (`webformatHeight` INTEGER, `imageWidth` INTEGER, `previewHeight` INTEGER, `webformatURL` TEXT, `userImageURL` TEXT, `previewURL` TEXT, `comments` INTEGER, `type` TEXT, `imageHeight` INTEGER, `tags` TEXT, `previewWidth` INTEGER, `downloads` INTEGER, `collections` INTEGER, `user_id` INTEGER, `largeImageURL` TEXT, `pageURL` TEXT, `id` INTEGER, `imageSize` INTEGER, `webformatWidth` INTEGER, `user` TEXT, `views` INTEGER, `likes` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `pixaBayKeys` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `index` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '98013b339c82a2293b70b150d37f0746')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `pixabayList`");
        _db.execSQL("DROP TABLE IF EXISTS `pixaBayKeys`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPixabayList = new HashMap<String, TableInfo.Column>(22);
        _columnsPixabayList.put("webformatHeight", new TableInfo.Column("webformatHeight", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("imageWidth", new TableInfo.Column("imageWidth", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("previewHeight", new TableInfo.Column("previewHeight", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("webformatURL", new TableInfo.Column("webformatURL", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("userImageURL", new TableInfo.Column("userImageURL", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("previewURL", new TableInfo.Column("previewURL", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("comments", new TableInfo.Column("comments", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("imageHeight", new TableInfo.Column("imageHeight", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("tags", new TableInfo.Column("tags", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("previewWidth", new TableInfo.Column("previewWidth", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("downloads", new TableInfo.Column("downloads", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("collections", new TableInfo.Column("collections", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("user_id", new TableInfo.Column("user_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("largeImageURL", new TableInfo.Column("largeImageURL", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("pageURL", new TableInfo.Column("pageURL", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("imageSize", new TableInfo.Column("imageSize", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("webformatWidth", new TableInfo.Column("webformatWidth", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("user", new TableInfo.Column("user", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("views", new TableInfo.Column("views", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayList.put("likes", new TableInfo.Column("likes", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPixabayList = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPixabayList = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPixabayList = new TableInfo("pixabayList", _columnsPixabayList, _foreignKeysPixabayList, _indicesPixabayList);
        final TableInfo _existingPixabayList = TableInfo.read(_db, "pixabayList");
        if (! _infoPixabayList.equals(_existingPixabayList)) {
          return new RoomOpenHelper.ValidationResult(false, "pixabayList(com.qasim.paging3example.data.model.PixabayObj).\n"
                  + " Expected:\n" + _infoPixabayList + "\n"
                  + " Found:\n" + _existingPixabayList);
        }
        final HashMap<String, TableInfo.Column> _columnsPixaBayKeys = new HashMap<String, TableInfo.Column>(2);
        _columnsPixaBayKeys.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixaBayKeys.put("index", new TableInfo.Column("index", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPixaBayKeys = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPixaBayKeys = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPixaBayKeys = new TableInfo("pixaBayKeys", _columnsPixaBayKeys, _foreignKeysPixaBayKeys, _indicesPixaBayKeys);
        final TableInfo _existingPixaBayKeys = TableInfo.read(_db, "pixaBayKeys");
        if (! _infoPixaBayKeys.equals(_existingPixaBayKeys)) {
          return new RoomOpenHelper.ValidationResult(false, "pixaBayKeys(com.qasim.paging3example.data.model.PixabayKeys).\n"
                  + " Expected:\n" + _infoPixaBayKeys + "\n"
                  + " Found:\n" + _existingPixaBayKeys);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "98013b339c82a2293b70b150d37f0746", "739e76ba0d8b68e6a2cd8fd0850e9707");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "pixabayList","pixaBayKeys");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `pixabayList`");
      _db.execSQL("DELETE FROM `pixaBayKeys`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(PixabayDao.class, PixabayDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PixabayKeyDao.class, PixabayKeyDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public PixabayDao pixabayDao() {
    if (_pixabayDao != null) {
      return _pixabayDao;
    } else {
      synchronized(this) {
        if(_pixabayDao == null) {
          _pixabayDao = new PixabayDao_Impl(this);
        }
        return _pixabayDao;
      }
    }
  }

  @Override
  public PixabayKeyDao pixabayKeyDao() {
    if (_pixabayKeyDao != null) {
      return _pixabayKeyDao;
    } else {
      synchronized(this) {
        if(_pixabayKeyDao == null) {
          _pixabayKeyDao = new PixabayKeyDao_Impl(this);
        }
        return _pixabayKeyDao;
      }
    }
  }
}
