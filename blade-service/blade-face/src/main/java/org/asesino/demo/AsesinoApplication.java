package org.asesino.demo;

import org.springblade.core.cloud.client.BladeCloudApplication;
import org.springblade.core.launch.BladeApplication;


/**
 * @author 太傅
 * @date 2021/3/6
 */
@BladeCloudApplication
public class AsesinoApplication {
	public static void main(String[] args) {
		BladeApplication.run("blade-asesino",AsesinoApplication.class);
	}
}
