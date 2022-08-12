package com.lombok.sample.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AccountBeanTest {

	@Test
	@DisplayName("�C���X�^���X���ŏ����������l�̎擾�e�X�g_Id�擾")
	void testAccountBean_001() {

		// �e�X�g�f�[�^
		AccountBean AccountBean = new AccountBean("001", "test1");
		
		// ���Ғl
		String expected = "001";
		
		// �����l
		String actual = AccountBean.getId();	
		
		// ����
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("�C���X�^���X���ŏ����������l�̎擾�e�X�g_Name�擾")
	void testAccountBean_002() {

		// �e�X�g�f�[�^
		AccountBean AccountBean = new AccountBean("002", "test2");
		
		// ���Ғl
		String expected = "test2";
		
		// �����l
		String actual = AccountBean.getName();	
		
		// ����
		assertEquals(expected, actual);
	}

}
