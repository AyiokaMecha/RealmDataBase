package com.androidpractice.realmdb

import android.app.Application
import com.androidpractice.realmdb.models.Address
import com.androidpractice.realmdb.models.Course
import com.androidpractice.realmdb.models.Student
import com.androidpractice.realmdb.models.Teacher
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

class MyApp: Application() {

    companion object {
        lateinit var realm: Realm
    }

    override fun onCreate() {
        super.onCreate()
        realm = Realm.open(
            configuration = RealmConfiguration.create(
                schema = setOf(
                    Address::class,
                    Teacher::class,
                    Course::class,
                    Student::class
                )
            )
        )
    }

}