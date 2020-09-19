package huh.enterprises.cxfjaxws.service;

import com.blog.demo.webservices.accountservice.*;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceEndpoint implements com.briansdevblog.accounts.AccountService {

    @Override
    public AccountDetailsResponse getAccountDetails(AccountDetailsRequest parameters) {
        ObjectFactory factory = new ObjectFactory();
        AccountDetailsResponse response = factory.createAccountDetailsResponse();
        Account account = factory.createAccount();
        account.setAccountNumber("12345");
        account.setAccountStatus(EnumAccountStatus.ACTIVE);
        account.setAccountName("Joe Bloggs");
        account.setAccountBalance(3400);
        response.setAccountDetails(account);
        return response;
    }
}