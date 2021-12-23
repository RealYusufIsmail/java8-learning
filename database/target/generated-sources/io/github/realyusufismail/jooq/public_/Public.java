/*
 * This file is generated by jOOQ.
 */
package io.github.realyusufismail.jooq.public_;


import io.github.realyusufismail.jooq.DefaultCatalog;
import io.github.realyusufismail.jooq.public_.tables.Courses;
import io.github.realyusufismail.jooq.public_.tables.Purchases;
import io.github.realyusufismail.jooq.public_.tables.Users;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>PUBLIC</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>PUBLIC.COURSES</code>.
     */
    public final Courses COURSES = Courses.COURSES;

    /**
     * The table <code>PUBLIC.PURCHASES</code>.
     */
    public final Purchases PURCHASES = Purchases.PURCHASES;

    /**
     * The table <code>PUBLIC.USERS</code>.
     */
    public final Users USERS = Users.USERS;

    /**
     * No further instances allowed
     */
    private Public() {
        super("PUBLIC", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Courses.COURSES,
            Purchases.PURCHASES,
            Users.USERS
        );
    }
}
