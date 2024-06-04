package rs.edu.raf.banka1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.edu.raf.banka1.model.Currency;
import rs.edu.raf.banka1.model.ListingType;
import rs.edu.raf.banka1.model.MarginAccount;

import java.util.List;
import java.util.Optional;

@Repository
public interface MarginAccountRepository extends JpaRepository<MarginAccount, Long> {
    Optional<MarginAccount> findByCustomer_IdAndListingTypeAndCurrency_CurrencyCode(Long id, ListingType listingType, String currencyCode);
    Optional<List<MarginAccount>> findAllByCustomer_Company_Id(Long customer_company_id); // bankAccount_company_id
    Optional<List<MarginAccount>> findMarginAccountsByCustomer_Customer_UserId(Long customer_customer_userId); // bankAccount_customer_userId
    Optional<MarginAccount> findMarginAccountByListingTypeAndCurrencyAndCustomer_AccountNumber(ListingType listingType, Currency currency, String customer_accountNumber); // bankAccount_accountNumber
    Optional<List<MarginAccount>> findMarginAccountsByMarginCallLevelTrue();
}
