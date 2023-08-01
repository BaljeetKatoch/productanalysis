package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import Mailerpackage.Mailer;
import Mailerpackage.MailerRepo;
import Mailerpackage.Mailer1;

import static org.mockito.Mockito.*;
public class MailerTest {

	@Test
	public void testGetProductInfo() {
		MailerRepo mailerRepo=mock(MailerRepo.class);
		Mailer obj= new Mailer("Abc","David","Ron");
		Mailer obj1= new Mailer("Hello","John","Harry");
		when(mailerRepo.getMailer("Abc")).thenReturn(obj);
		when(mailerRepo.getMailer("Hello")).thenReturn(obj1);
		
		Mailer1 prSystem=new Mailer1(mailerRepo);
		
		Mailer mailer=prSystem.getMessages("Hello");
		String sender= mailer.getSender();
		String receiver=mailer.getReceiver();
		assertEquals("John",sender);
	}

}