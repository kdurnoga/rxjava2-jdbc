package org.davidmoten.rx.jdbc;

import java.sql.SQLException;

public interface TxWithoutValue {

    boolean isComplete();

    boolean isError();

    void commit() throws SQLException;
    
    void rollback() throws SQLException;
    
    Throwable throwable();
    
    TransactedSelectBuilder select(String sql);
    
    TransactedUpdateBuilder update(String sql);
    
    TransactedCallableBuilder call(String sql);
    
}
