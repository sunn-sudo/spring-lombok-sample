package com.lombok.sample.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AccountBeanTest {

	@Test
	@DisplayName("インスタンス化で初期化した値の取得テスト_Id取得")
	void testAccountBean_001() {

		// テストデータ
		AccountBean AccountBean = new AccountBean("001", "test1");
		
		// 期待値
		String expected = "001";
		
		// 実効値
		String actual = AccountBean.getId();	
		
		// 検証
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("インスタンス化で初期化した値の取得テスト_Name取得")
	void testAccountBean_002() {

		// テストデータ
		AccountBean AccountBean = new AccountBean("002", "test2");
		
		// 期待値
		String expected = "test2";
		
		// 実効値
		String actual = AccountBean.getName();	
		
		// 検証
		assertEquals(expected, actual);
	}

}
