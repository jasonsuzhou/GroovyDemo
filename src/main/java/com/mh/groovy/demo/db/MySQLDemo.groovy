package com.mh.groovy.demo.db
import groovy.sql.Sql;
class MySQLDemo {
	
	static String url = "jdbc:mysql://localhost:3306/dxm";
	static String user = "root";
	static String password = "";
	static String driverClassName = "com.mysql.jdbc.Driver";
	
	def static void createTable() {
		def sql = Sql.newInstance(url, user, password, driverClassName);
		def createTable =
		"""create table employee(
			first_name varchar(32) not null,
			last_name varchar(32),
			age int(3),
			gender varchar(1),
			income float)"""
		sql.execute(createTable);
		sql.close();
	}
	
	def static void insertRecord() {
		def sql = Sql.newInstance(url, user, password, driverClassName);
		sql.connection.autoCommit = false;
		def sqlstr = """INSERT INTO EMPLOYEE(FIRST_NAME,
         LAST_NAME, AGE, GENDER, INCOME) VALUES ('Mac', 'Mohan', 20, 'M', 2000)""" 
		try {
			sql.execute(sqlstr);
			sql.commit()
		} catch (Exception e) {
			sql.rollback()
		} finally {
			sql.close();
		}
	}
	
	def static void insertRecord2() {
		def sql = Sql.newInstance(url, user, password, driverClassName);
		sql.connection.autoCommit = false;
		def firstname = "Mac";
		def lastname ="Mohan";
		def age = 20;
		def gender = "M";
		def income = 2000;
		def sqlstr = "INSERT INTO EMPLOYEE(FIRST_NAME,LAST_NAME, AGE, GENDER, INCOME) VALUES " + "('${firstname}', '${lastname}', ${age}, '${gender}', ${income} )";
		try {
			sql.execute(sqlstr);
			sql.commit()
		} catch (Exception e) {
			sql.rollback()
		} finally {
			sql.close();
		}
	}
	
	def static void queryRows() {
		def sql = Sql.newInstance(url, user, password, driverClassName);
		sql.eachRow("select * from employee") {
			row -> println row[0]
			println row.LAST_NAME
		}
		sql.close();
	}
	
	def static void updateRecord() {
		def sql = Sql.newInstance(url, user, password, driverClassName);
		sql.connection.autoCommit = false;
		def sqlstr = "UPDATE EMPLOYEE SET AGE = AGE + 1 WHERE GENDER = 'M'"
		try {
			sql.execute(sqlstr);
			sql.commit();
		} catch (Exception e) {
			sql.rollback();
		} finally {
			sql.close();
		}
	}
	
	def static void deleteRecord() {
		def sql = Sql.newInstance(url, user, password, driverClassName);
		sql.connection.autoCommit = false;
		def sqlstr = "DELETE FROM EMPLOYEE WHERE AGE > 20";
		try {
			sql.execute(sqlstr);
			sql.commit();
		} catch (Exception e) {
			sql.rollback();
		} finally {
			sql.close();
		}
	}
	
	static void main(String[] args) {
		deleteRecord();
	}

}
