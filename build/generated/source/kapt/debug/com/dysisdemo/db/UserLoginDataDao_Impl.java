package com.dysisdemo.db;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class UserLoginDataDao_Impl implements UserLoginDataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUserLoginData;

  public UserLoginDataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserLoginData = new EntityInsertionAdapter<UserLoginData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user_table`(`referenceNo`,`message`,`success`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserLoginData value) {
        stmt.bindLong(1, value.getReferenceNo());
        if (value.getMessage() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMessage());
        }
        if (value.getSuccess() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSuccess());
        }
      }
    };
  }

  @Override
  public void insert(UserLoginData userLoginData) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserLoginData.insert(userLoginData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<UserLoginData> getLocalUserData() {
    final String _sql = "SELECT * from user_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfReferenceNo = _cursor.getColumnIndexOrThrow("referenceNo");
      final int _cursorIndexOfMessage = _cursor.getColumnIndexOrThrow("message");
      final int _cursorIndexOfSuccess = _cursor.getColumnIndexOrThrow("success");
      final List<UserLoginData> _result = new ArrayList<UserLoginData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final UserLoginData _item;
        _item = new UserLoginData();
        final int _tmpReferenceNo;
        _tmpReferenceNo = _cursor.getInt(_cursorIndexOfReferenceNo);
        _item.setReferenceNo(_tmpReferenceNo);
        final String _tmpMessage;
        _tmpMessage = _cursor.getString(_cursorIndexOfMessage);
        _item.setMessage(_tmpMessage);
        final String _tmpSuccess;
        _tmpSuccess = _cursor.getString(_cursorIndexOfSuccess);
        _item.setSuccess(_tmpSuccess);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
