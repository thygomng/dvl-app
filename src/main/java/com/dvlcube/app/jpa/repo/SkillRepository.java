package com.dvlcube.app.jpa.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dvlcube.app.jpa.BasicRepository;
import com.dvlcube.app.jpa.DvlRepository;
import com.dvlcube.app.manager.data.SkillBean;

/**
 * @since 4 de jun de 2019
 * @author Ulisses Lima
 */
@Repository
public interface SkillRepository extends DvlRepository<SkillBean, Long>, BasicRepository<SkillBean, Long> {
	List<SkillBean> findByNameLike(String name);
	
	SkillBean findOneByName(String name);
	
	boolean existsByName(String name);
}