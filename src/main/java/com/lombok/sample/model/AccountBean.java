
package com.lombok.sample.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/** アカウントモデル */
@Data
@AllArgsConstructor
public class AccountBean {

	/** ID */
	private String id;

	/** 名前 */
	private String name;
}
