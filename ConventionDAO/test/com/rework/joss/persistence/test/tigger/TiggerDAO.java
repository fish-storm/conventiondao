﻿package com.rework.joss.persistence.test.tigger;

import com.rework.joss.persistence.convention.annotation.AbstractConventionDAO;
import com.rework.joss.persistence.convention.annotation.DAO;
import com.rework.joss.persistence.test.biz.DAOTestDTO;

/**
 * 
 * @author kevin zhang
 *
 */
@DAO(pojo=DAOTestDTO.class, table="dao_test")
public class TiggerDAO extends AbstractConventionDAO{


	
}
