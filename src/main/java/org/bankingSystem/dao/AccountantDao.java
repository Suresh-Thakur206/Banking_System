package org.bankingSystem.dao;
import org.bankingSystem.entity.Accountant;
import org.bankingSystem.exceptionHandling.AccontantException;

public interface AccountantDao {
    public Accountant LoginAccountant(String AccountantUserName, String AccountantEmail, int AccountantPassword )
            throws AccontantException;
}
