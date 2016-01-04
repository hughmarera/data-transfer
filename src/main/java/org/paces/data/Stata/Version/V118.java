package org.paces.data.Stata.Version;

import java.util.Map;

/**
 * Created by billy on 12/27/15.
 */
public class V118 extends NewFormats implements FileVersion  {

	private Integer versionNumber;

	public static final int DATASET_LABEL_LENGTH = 2;

	public V118(String versionID) {
		this.versionNumber = Integer.valueOf(versionID);
	}

	@Override
	public Integer getVersionNumber() {
		return this.versionNumber;
	}

	@Override
	public Map<Integer, Integer> getDataTypes() {
		return super.getDataTypes();
	}

}
