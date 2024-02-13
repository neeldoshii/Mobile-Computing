package com.yassineabou.calculator.data.local;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yassineabou.calculator.data.model.PreviousOperation;
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
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class PreviousOperationDao_Impl implements PreviousOperationDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PreviousOperation> __insertionAdapterOfPreviousOperation;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public PreviousOperationDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPreviousOperation = new EntityInsertionAdapter<PreviousOperation>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `previous_operation` (`input`,`result`,`id`) VALUES (?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PreviousOperation value) {
        if (value.getInput() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getInput());
        }
        if (value.getResult() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getResult());
        }
        stmt.bindLong(3, value.getId());
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM previous_operation";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final PreviousOperation previousOperation,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPreviousOperation.insert(previousOperation);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object clear(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClear.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClear.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<PreviousOperation>> getListPreviousOperations() {
    final String _sql = "SELECT * FROM previous_operation ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"previous_operation"}, new Callable<List<PreviousOperation>>() {
      @Override
      public List<PreviousOperation> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfInput = CursorUtil.getColumnIndexOrThrow(_cursor, "input");
          final int _cursorIndexOfResult = CursorUtil.getColumnIndexOrThrow(_cursor, "result");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<PreviousOperation> _result = new ArrayList<PreviousOperation>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PreviousOperation _item;
            final String _tmpInput;
            if (_cursor.isNull(_cursorIndexOfInput)) {
              _tmpInput = null;
            } else {
              _tmpInput = _cursor.getString(_cursorIndexOfInput);
            }
            final String _tmpResult;
            if (_cursor.isNull(_cursorIndexOfResult)) {
              _tmpResult = null;
            } else {
              _tmpResult = _cursor.getString(_cursorIndexOfResult);
            }
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item = new PreviousOperation(_tmpInput,_tmpResult,_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
