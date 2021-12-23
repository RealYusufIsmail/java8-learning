/*
 * This file is generated by jOOQ.
 */
package io.github.realyusufismail.jooq.information_schema.tables;


import io.github.realyusufismail.jooq.information_schema.InformationSchema;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TableTypes extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.TABLE_TYPES</code>
     */
    public static final TableTypes TABLE_TYPES = new TableTypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.TABLE_TYPES.TYPE</code>.
     */
    public final TableField<Record, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(2147483647), this, "");

    private TableTypes(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private TableTypes(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.TABLE_TYPES</code> table
     * reference
     */
    public TableTypes(String alias) {
        this(DSL.name(alias), TABLE_TYPES);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.TABLE_TYPES</code> table
     * reference
     */
    public TableTypes(Name alias) {
        this(alias, TABLE_TYPES);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.TABLE_TYPES</code> table reference
     */
    public TableTypes() {
        this(DSL.name("TABLE_TYPES"), null);
    }

    public <O extends Record> TableTypes(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, TABLE_TYPES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public TableTypes as(String alias) {
        return new TableTypes(DSL.name(alias), this);
    }

    @Override
    public TableTypes as(Name alias) {
        return new TableTypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TableTypes rename(String name) {
        return new TableTypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TableTypes rename(Name name) {
        return new TableTypes(name, null);
    }
}
