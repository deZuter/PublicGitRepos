package com.example.lab21

import android.annotation.SuppressLint
import android.content.ContentValues
import android.database.DatabaseUtils
import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns
import android.util.Log
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

class UserHandler
{
suspend fun insertUser(db: SQLiteDatabase, user:User) = coroutineScope {

        // Create a new map of values, where column names are the keys
        val values = ContentValues().apply {
            put(DBContract.UserEntry.COLUMN_NAME_EMAIL, user._userEmail)
            put(DBContract.UserEntry.COLUMN_NAME_PASSWORD, user._userPassword)
        }

        // Insert the new row, returning the primary key value of the new row
        val job = async {
            delay(500L)
            val newRowId = db?.insert(DBContract.UserEntry.TABLE_NAME, null, values)
        }
        job.await()
        val dbRowsCount = DatabaseUtils.queryNumEntries(db,DBContract.UserEntry.TABLE_NAME)
    }
    suspend fun delUser(db: SQLiteDatabase, email: String) = coroutineScope {

        val DbEmail = email
        // Define 'where' part of query.
        val selection = "${DBContract.UserEntry.COLUMN_NAME_EMAIL} = ?"
        // Specify arguments in placeholder order.
        val selectionArgs: String = DbEmail
        // Issue SQL statement.
        val job = async {
            delay(1000L)
            db.delete(
                DBContract.UserEntry.TABLE_NAME, selection,
                arrayOf(selectionArgs)
            )
        }
        job.await()
    }

    @SuppressLint("SuspiciousIndentation")
    suspend fun restoreData (db: SQLiteDatabase, userList: ArrayList<User>?) = coroutineScope {
        //{
        //dataList.clear()
        // Define a projection that specifies which columns from the database
        // you will actually use after this query.
        val projection = arrayOf(
            BaseColumns._ID, DBContract.UserEntry.COLUMN_NAME_EMAIL,
            DBContract.UserEntry.COLUMN_NAME_PASSWORD)

        // Filter results WHERE "title" = 'My Title'
        //val selection = "${DBContract.UserEntry.COLUMN_NAME_EMAIL} = ?"
        //val selectionArgs = arrayOf("My Title")

        // How you want the results sorted in the resulting Cursor
        val sortOrder = "${BaseColumns._ID} ASC"

        val EMAIL_KEY = "e"
        val PASSWORD_KEY = "p"

            val job = async {

            Log.i("AppLogger", "Before delay")
            delay(1000L)
            Log.i("AppLogger", "After delay")


            val cursor = db.query(
                DBContract.UserEntry.TABLE_NAME,   // The table to query
                projection,             // The array of columns to return (pass null to get all)
                null,              // The columns for the WHERE clause
                null,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                sortOrder               // The sort order
            )

            with(cursor)
            {
                while (moveToNext())
                {

                    val itemEmail = getString(
                        getColumnIndexOrThrow(
                            DBContract.UserEntry.COLUMN_NAME_EMAIL
                        )
                    )
                    val itemPassword = getString(
                        getColumnIndexOrThrow(
                            DBContract.UserEntry.COLUMN_NAME_PASSWORD
                        )
                    )
                    val user: User = User(itemEmail, itemPassword)
                    userList?.add(user)

                }
            }
            cursor.close()
        }
        job.await()
    }
}