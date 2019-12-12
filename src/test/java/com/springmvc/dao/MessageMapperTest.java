package com.springmvc.dao;

import com.springmvc.entity.Message;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author jamin <br>
 * @date 2019/12/11 下午11:37<br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application.xml")
public class MessageMapperTest {
  @Autowired private MessageMapper messageMapper;

  @Test
  public void insert() {
    Message message = new Message();
    message.setCommand("ceshi");
    message.setContent("ceshi1");
    message.setDescription("ceshi3");
    message.setId(1);
    int insert = messageMapper.insert(message);
    System.out.println(insert);
  }
}
