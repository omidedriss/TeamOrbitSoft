package com.orbitsoft.teamorbitsoft.example.db;


import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.orbitsoft.teamorbitsoft.example.Model.Contact;
import com.orbitsoft.teamorbitsoft.example.db.typeconverters.DateTypeConverter;

/**
 * Created by gurleensethi on 04/02/18.
 */
@Database(entities = {Contact.class}, version = 1)
@TypeConverters({DateTypeConverter.class})
public abstract class AppDatabase extends RoomDatabase {
    public abstract ContactDAO getContactDAO();
}
