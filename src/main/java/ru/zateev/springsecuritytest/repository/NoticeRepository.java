package ru.zateev.springsecuritytest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ru.zateev.springsecuritytest.model.Notice;

@Repository
public interface NoticeRepository extends CrudRepository<Notice, Long> {
	
	@Query(value = "from Notice n where current_date BETWEEN n.noticBegDt AND n.noticEndDt")
	List<Notice> findAllActiveNotices();

}
