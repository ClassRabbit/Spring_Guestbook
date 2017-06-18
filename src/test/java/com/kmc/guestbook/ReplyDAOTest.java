package com.kmc.guestbook;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kmc.domain.ReplyVO;
import com.kmc.persistence.ReplyDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class ReplyDAOTest {
	
	private static final Logger logger = LoggerFactory.getLogger(ReplyDAOTest.class);

	@Inject
	ReplyDAO dao;
	
	@Test
	public void testCreate() throws Exception{
		ReplyVO reply = new ReplyVO();
		reply.setRno(1);
		reply.setReplyer("user00");
		reply.setReplytext("덧글테스트");
		reply.setBno(10);
		dao.create(reply);
		
		reply = new ReplyVO();
		reply.setRno(2);
		reply.setReplyer("user01");
		reply.setReplytext("덧글테스트2");
		reply.setBno(10);
		dao.create(reply);
	}

}
