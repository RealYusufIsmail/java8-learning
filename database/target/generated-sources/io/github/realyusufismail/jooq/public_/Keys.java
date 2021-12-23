/*
 * This file is generated by jOOQ.
 */
package io.github.realyusufismail.jooq.public_;


import io.github.realyusufismail.jooq.public_.tables.Courses;
import io.github.realyusufismail.jooq.public_.tables.Purchases;
import io.github.realyusufismail.jooq.public_.tables.Users;

import org.jooq.ForeignKey;
import org.jooq.Record;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * PUBLIC.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<Record> CONSTRAINT_6 = Internal.createUniqueKey(Courses.COURSES, DSL.name("CONSTRAINT_6"), new TableField[] { Courses.COURSES.ID }, true);
    public static final UniqueKey<Record> CONSTRAINT_4 = Internal.createUniqueKey(Users.USERS, DSL.name("CONSTRAINT_4"), new TableField[] { Users.USERS.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<Record, Record> CONSTRAINT_3 = Internal.createForeignKey(Purchases.PURCHASES, DSL.name("CONSTRAINT_3"), new TableField[] { Purchases.PURCHASES.USER_ID }, Keys.CONSTRAINT_4, new TableField[] { Users.USERS.ID }, true);
    public static final ForeignKey<Record, Record> CONSTRAINT_3B = Internal.createForeignKey(Purchases.PURCHASES, DSL.name("CONSTRAINT_3B"), new TableField[] { Purchases.PURCHASES.COURSE_ID }, Keys.CONSTRAINT_6, new TableField[] { Courses.COURSES.ID }, true);
}
