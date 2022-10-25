package ir.twitter.repository.accountRepository;

import ir.twitter.repository.BaseRepository;
import ir.twitter.entity.Account;
import org.hibernate.Session;

public interface AccountRepository extends BaseRepository<Account, Long> {
    void delete(Session session, Long id);
}
