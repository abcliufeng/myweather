package com.example.myweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class WeatherOpenHelper extends SQLiteOpenHelper{
	/**
	 * 省份的数据表
	 */
	public static final String PROVINCE="create table Province("
							+"id integer primary key autoincrement,"
							+"province_name text,"
							+"province_code text)";
	/**
	 * 市区的数据表
	 */
	public static final String CITY="create table City("
							+"id integer primary key autoincrement,"
							+"city_name text,"
							+"city_code text,"
							+"province_id integer)";
	/**
	 * 县区的数据表
	 */
	public static final String COUNTY="create table County("
							+"id integer primary key autoincrement,"
							+"county_name text,"
							+"county_code text,"
							+"city_id integer)";
	public WeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(PROVINCE);//创建Province表
		db.execSQL(CITY);//创建City表
		db.execSQL(COUNTY);//创建County表
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) 
	{
		// TODO Auto-generated method stub
		
	}

}
